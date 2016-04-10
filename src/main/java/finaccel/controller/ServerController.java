package finaccel.controller;

import finaccel.model.RestResult;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nuboat
 */
@RestController
public class ServerController {

	@RequestMapping(value = Routes.INDEX, method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public RestResult get() {
		return new RestResult(200, "1.0.0", null, null);
	}

}
