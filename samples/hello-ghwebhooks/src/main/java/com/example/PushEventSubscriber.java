package com.example;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import am.ik.gh.webhooks.push.PushEventPayload;

@Component
public class PushEventSubscriber {
    @EventListener
    public void subscribe(PushEventPayload payload) {
        System.out.println("Pushed! " + payload);
    }
}
