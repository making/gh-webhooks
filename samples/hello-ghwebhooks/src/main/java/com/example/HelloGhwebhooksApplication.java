package com.example;

import am.ik.gh.webhooks.EnableGitHubWebhooks;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableGitHubWebhooks
public class HelloGhwebhooksApplication {

    public static void main(String[] args) {
        SpringApplication.run(HelloGhwebhooksApplication.class, args);
    }
}
