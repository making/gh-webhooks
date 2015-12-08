package am.ik.gh.webhooks.pagebuild;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T03:30:22.042")
@org.springframework.web.bind.annotation.RestController
public class PageBuildWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PageBuildWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=page_build")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        PageBuildEventPayload eventPayload = objectMapper.readValue(payload, PageBuildEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
