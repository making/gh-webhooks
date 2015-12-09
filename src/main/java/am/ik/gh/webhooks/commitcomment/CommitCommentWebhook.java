package am.ik.gh.webhooks.commitcomment;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.763")
@org.springframework.web.bind.annotation.RestController
public class CommitCommentWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(CommitCommentWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=commit_comment")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        CommitCommentEventPayload eventPayload = objectMapper.readValue(payload, CommitCommentEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
