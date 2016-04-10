package finaccel.controller;

import com.restfb.types.User;
import finaccel.facade.FbAuthenFacade;
import finaccel.model.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nuboat
 */
@RestController
public class FbSigninController {

	@Autowired
	private FbAuthenFacade facade;

	@RequestMapping(value = Routes.FBSIGNIN, method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResult post(
			@RequestParam(value = "token") final String token) {
		
		final User user = facade.authen(token);

		return new RestResult(200, "1.0.0", user, null);
	}

}
