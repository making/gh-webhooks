package am.ik.gh.webhooks.push;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.974")
@org.springframework.web.bind.annotation.RestController
public class PushWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PushWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=push")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        PushEventPayload eventPayload = objectMapper.readValue(payload, PushEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
