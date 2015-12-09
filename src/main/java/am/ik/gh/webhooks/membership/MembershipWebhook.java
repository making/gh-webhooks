package am.ik.gh.webhooks.membership;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.889")
@org.springframework.web.bind.annotation.RestController
public class MembershipWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MembershipWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=membership")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        MembershipEventPayload eventPayload = objectMapper.readValue(payload, MembershipEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
