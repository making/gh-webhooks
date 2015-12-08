package demo;

import am.ik.gh.webhooks.push.PushEventPayload;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class PushEventHandler {
    @EventListener
    public void handleEvent(PushEventPayload payload) {
        System.out.println(payload);
    }
}
