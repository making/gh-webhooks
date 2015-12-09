package am.ik.gh.webhooks.member;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.877")
@org.springframework.web.bind.annotation.RestController
public class MemberWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(MemberWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=member")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        MemberEventPayload eventPayload = objectMapper.readValue(payload, MemberEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
