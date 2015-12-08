package am.ik.gh.webhooks;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(GitHubWebhooksConfig.class)
public @interface EnableGitHubWebhooks {
}
