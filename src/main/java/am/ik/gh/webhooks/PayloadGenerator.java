package am.ik.gh.webhooks;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.CaseFormat;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

@SuppressWarnings("unchecked")
public class PayloadGenerator {


    public static class ClassMeta {
        private final String className;
        private final List<FieldMeta> fields = new ArrayList<>();

        public ClassMeta(String className) {
            this.className = className;
        }

        public String getClassName() {
            return className;
        }

        public List<FieldMeta> getFields() {
            return fields;
        }

        @Override
        public String toString() {
            return "ClassMeta{" +
                    "className='" + className + '\'' +
                    ", fields=" + fields +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            ClassMeta classMeta = (ClassMeta) o;

            if (!className.equals(classMeta.className)) return false;
            return fields.equals(classMeta.fields);

        }

        @Override
        public int hashCode() {
            int result = className.hashCode();
            result = 31 * result + fields.hashCode();
            return result;
        }
    }

    public static class FieldMeta {
        private final String fieldName;
        private final String fieldType;

        public FieldMeta(String fieldName, String fieldType) {
            this.fieldName = fieldName;
            this.fieldType = fieldType;
        }

        public String getFieldName() {
            if ("private".equals(fieldName)) {
                return "_private";
            }
            if ("public".equals(fieldName)) {
                return "_public";
            }
            return CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, fieldName);
        }

        public String getFieldType() {
            String type = fieldType;
            if (fieldType.startsWith("java.lang")) {
                type = fieldType.substring("java.lang".length() + 1);
            }
            if ("Integer".equals(type)) {
                return "Long";
            }
            return type;
        }

        @Override
        public String toString() {
            return "fieldMeta{" +
                    "fieldName='" + fieldName + '\'' +
                    ", fieldType='" + fieldType + '\'' +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            FieldMeta fieldMeta = (FieldMeta) o;

            if (!fieldName.equals(fieldMeta.fieldName)) return false;
            return fieldType.equals(fieldMeta.fieldType);

        }

        @Override
        public int hashCode() {
            int result = fieldName.hashCode();
            result = 31 * result + fieldType.hashCode();
            return result;
        }
    }

    public static void main(String[] args) throws Exception {
        final ObjectMapper mapper = new ObjectMapper();
        Files.walkFileTree(Paths.get("input"), new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                String className = file.getFileName().toString().replace(".json", "") + "Payload";
                String packageName = className.toLowerCase().replace("eventpayload", "");
                if ("public".equals(packageName)) {
                    packageName = "pblc";
                }
                genPayload(file, className, packageName, mapper);
                genWebhook(file, className, packageName, mapper);
                return FileVisitResult.CONTINUE;
            }
        });
    }

    static void genPayload(Path file, String className, String packageName, ObjectMapper mapper) throws IOException {
        Path java = Paths.get("src/main/java/am/ik/gh/webhooks/" + packageName + "/" + className + ".java");
        if (!Files.exists(java.getParent())) {
            Files.createDirectory(java.getParent());
        }
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(java))) {
            Map<String, Object> m = mapper.readValue(file.toFile(), Map.class);
            LinkedList<ClassMeta> classMetas = new LinkedList<>();
            ClassMeta meta = new ClassMeta(className);
            load(meta, m, classMetas);

            ClassMeta first = classMetas.removeFirst();
            Set<ClassMeta> rest = new LinkedHashSet<>(classMetas);
            writer.println("package am.ik.gh.webhooks." + packageName + ";");
            writer.println();
            writer.println("@javax.annotation.Generated(value = \"" + PayloadGenerator.class.getName() + "\", date = \"" + DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()) + "\")");
            writer.println("@lombok.Data");
            writer.println("public class " + first.getClassName() + " {");
            for (FieldMeta fieldMeta : first.getFields()) {
                writer.println("    @com.fasterxml.jackson.annotation.JsonProperty(\"" + fieldMeta.fieldName + "\")");
                writer.println("    private " + fieldMeta.getFieldType() + " " + fieldMeta.getFieldName() + ";");
            }
            for (ClassMeta classMeta : rest) {
                writer.println();
                writer.println("    @lombok.Data");
                writer.println("    public static class " + classMeta.getClassName() + " {");
                for (FieldMeta fieldMeta : classMeta.getFields()) {
                    writer.println("        @com.fasterxml.jackson.annotation.JsonProperty(\"" + fieldMeta.fieldName + "\")");
                    writer.println("        private " + fieldMeta.getFieldType() + " " + fieldMeta.getFieldName() + ";");
                }
                writer.println("    }");
            }
            writer.println("}");
        }
    }

    static void genWebhook(Path file, String className, String packageName, ObjectMapper mapper) throws IOException {
        String payloadName = className;
        className = className.replace("EventPayload", "Webhook");
        Path java = Paths.get("src/main/java/am/ik/gh/webhooks/" + packageName + "/" + className + ".java");
        if (!Files.exists(java.getParent())) {
            Files.createDirectory(java.getParent());
        }
        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(java))) {
            String eventName = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, className.replace("Webhook", ""));
            writer.println("package am.ik.gh.webhooks." + packageName + ";");
            writer.println();
            writer.println("@javax.annotation.Generated(value = \"" + PayloadGenerator.class.getName() + "\", date = \"" + DateTimeFormatter.ISO_DATE_TIME.format(LocalDateTime.now()) + "\")");
            writer.println("@org.springframework.web.bind.annotation.RestController");
            writer.println("public class " + className + " {");
            writer.println("    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(" + className + ".class);");
            writer.println();
            writer.println("    @org.springframework.beans.factory.annotation.Autowired");
            writer.println("    com.fasterxml.jackson.databind.ObjectMapper objectMapper;");
            writer.println("    @org.springframework.beans.factory.annotation.Autowired");
            writer.println("    org.springframework.context.ApplicationContext applicationContext;");
            writer.println();
            writer.println("    @org.springframework.web.bind.annotation.RequestMapping(headers = \"X-Github-Event=" + eventName + "\")");
            writer.println("    public String hook(@org.springframework.web.bind.annotation.RequestParam(\"payload\") String payload,");
            writer.println("                       @org.springframework.web.bind.annotation.RequestHeader(\"X-Github-Delivery\") String delivery) throws java.io.IOException {");
            writer.println("        log.info(\"delivery={}, payload={}\", delivery, payload);");
            writer.println("        " + payloadName + " eventPayload = objectMapper.readValue(payload, " + payloadName + ".class);");
            writer.println("        applicationContext.publishEvent(eventPayload);");
            writer.println("        return \"OK\";");
            writer.println("    }");
            writer.println("}");
        }
    }

    static void load(ClassMeta meta, Map<String, Object> m, List<ClassMeta> classMetas) {
        classMetas.add(meta);
        for (Map.Entry<String, Object> e : m.entrySet()) {
            Object val = e.getValue();
            String key = e.getKey();
            String type;
            if (val == null) {
                System.err.println(classMetas.get(0).getClassName() + "." + meta.className + "\t" + key + " is null");
                type = "java.lang.String";
            } else if (val instanceof Map) {
                type = meta.className + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, key);
                load(new ClassMeta(type), (Map<String, Object>) val, classMetas);
            } else if (val instanceof List) {
                List lst = (List) val;
                String param = meta.className + CaseFormat.LOWER_UNDERSCORE.to(CaseFormat.UPPER_CAMEL, key);
                if (param.endsWith("s")) {
                    param = param.substring(0, param.length() - 1);
                }
                if (lst.isEmpty()) {
                    System.err.println(classMetas.get(0).getClassName() + "." + meta.className + "\t" + key + " is empty");
                    param = "String";
                } else if (lst.get(0) instanceof String) {
                    param = "String";
                } else if (lst.get(0) instanceof Map) {
                    load(new ClassMeta(param), (Map<String, Object>) lst.get(0), classMetas);
                }
                type = "java.util.List<" + param + ">";
            } else {
                type = val.getClass().getName();
            }
            meta.getFields().add(new FieldMeta(key, type));
        }
    }
}
