package am.ik.gh.webhooks;

import demo.GhWebhooksApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = GhWebhooksApplication.class)
@WebAppConfiguration
public class GhWebhooksApplicationTests {

	@Test
	public void contextLoads() {
	}

}
