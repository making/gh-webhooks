package demo;

import am.ik.gh.webhooks.push.PushEventPayload;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class PushEventSubscriber {
    @EventListener
    public void subscribe(PushEventPayload payload) {
        // build message
        String ref = payload.getRef();
        String branch = (ref != null) ? ref.replace("refs/heads/", "") : payload.getRepository().getDefaultBranch();
        String url = payload.getRepository().getHtmlUrl();
        if (!Objects.equals(branch, payload.getRepository().getDefaultBranch())) {
            url = url + "/tree/" + branch;
        }
        System.out.println("user:" + payload.getPusher().getEmail());
        System.out.println("url:" + url);
        System.out.println("ref:" + ref);

        for (PushEventPayload.Commit commit : payload.getCommits()) {
            System.out.println("\tauthor:" + commit.getAuthor().getName() +
                    "\ttimestamp:" + commit.getTimestamp() +
                    "\turl:" + commit.getUrl() +
                    "\tmessage:" + commit.getMessage());
        }
    }
}
