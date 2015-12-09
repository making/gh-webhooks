package am.ik.gh.webhooks.pullrequest;

@javax.annotation.Generated(value = "am.ik.gh.webhooks.PayloadGenerator", date = "2015-12-09T11:00:58.953")
@org.springframework.web.bind.annotation.RestController
public class PullRequestWebhook {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(PullRequestWebhook.class);

    @org.springframework.beans.factory.annotation.Autowired
    com.fasterxml.jackson.databind.ObjectMapper objectMapper;
    @org.springframework.beans.factory.annotation.Autowired
    org.springframework.context.ApplicationContext applicationContext;

    @org.springframework.web.bind.annotation.RequestMapping(headers = "X-Github-Event=pull_request")
    public String hook(@org.springframework.web.bind.annotation.RequestParam("payload") String payload,
                       @org.springframework.web.bind.annotation.RequestHeader("X-Github-Delivery") String delivery) throws java.io.IOException {
        log.info("delivery={}, payload={}", delivery, payload);
        PullRequestEventPayload eventPayload = objectMapper.readValue(payload, PullRequestEventPayload.class);
        applicationContext.publishEvent(eventPayload);
        return "OK";
    }
}
