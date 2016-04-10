package finaccel.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.testng.annotations.Test;

/**
 *
 * @author nuboat
 */
@Slf4j
public class RestResultNGTest {
	
	@Test
	public void testCreate() {
		final RestResult result = new RestResult(200, "1.0.0", "success", "fail");
		assert result != null : "Result should not be null";
	}
	
	@Test
	public void testParsing() throws Exception {
		final RestResult result = new RestResult(200, "1.0.0", "success", "fail");
		final ObjectMapper mapper = new ObjectMapper();
		
		final String json = mapper.writeValueAsString(result);
		assert json.contains("1.0.0");
		
		log.info(json);
	}
	
}
