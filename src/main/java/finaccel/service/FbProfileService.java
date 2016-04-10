package finaccel.service;

import com.restfb.DefaultFacebookClient;
import com.restfb.FacebookClient;
import com.restfb.Parameter;
import com.restfb.Version;
import com.restfb.types.User;
import finaccel.converter.FbDateStringToJoda;
import org.springframework.stereotype.Service;

/**
 *
 * @author nuboat
 */
@Service
public class FbProfileService implements FbDateStringToJoda {
	
	public User fetch(final String token) {
		final FacebookClient client = new DefaultFacebookClient(token, Version.VERSION_2_5);
		return client.fetchObject("me", User.class, Parameter.with("fields", "id,name,bio,birthday,email"));
	}

}
