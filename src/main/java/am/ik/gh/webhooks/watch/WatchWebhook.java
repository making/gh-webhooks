package am.ik.gh.webhooks.watch;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:59.055")
@org.springframework.web.bind.annotation.RestController
public class WatchWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(WatchWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=watch")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        WatchEventPayload eventPayload = objectMapper.readValue(payload, WatchEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
