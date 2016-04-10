package finaccel.service;

import com.restfb.types.User;
import constant.Config;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
@Slf4j
public class FbProfileServiceNGTest {

	@Test
	public void testFetch() {
		final String token = Config.TOKEN_TEST;
		final FbProfileService facade = new FbProfileService();
		
		final User user = facade.fetch(token);
		
		assert "Peerapat Asoktummarungsri".equals(user.getName()) : "Name should be Peerapat Asoktummarungsri";
		
		log.info("Name: {}, Bio: {}, Birthday: {}", user.getName(), user.getBio(), user.getBirthday());
	}
	
}
