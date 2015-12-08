package demo;

import am.ik.gh.webhooks.EnableGitHubWebhooks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGitHubWebhooks
public class GhWebhooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(GhWebhooksApplication.class, args);
    }
}
