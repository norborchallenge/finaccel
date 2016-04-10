package finaccel.controller;

import constant.Config;
import finaccel.Application;
import lombok.extern.slf4j.Slf4j;
import static org.hamcrest.CoreMatchers.containsString;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 *
 * @author nuboat
 */
@Slf4j
@WebAppConfiguration
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
public class FbSigninControllerTest {

	private MockMvc mvc;

	@Autowired
	private WebApplicationContext wac;

	@Before
	public void setUp() throws Exception {
		mvc = MockMvcBuilders.webAppContextSetup(wac).build();
	}

	@Test
	public void testPost() throws Exception {
		final MockHttpServletRequestBuilder builder = MockMvcRequestBuilders.post("/fbsignin")
                .param("token", Config.TOKEN_TEST);

        final ResultActions result = mvc.perform(builder)
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Peerapat Asoktummarungsri")));

        log.info(result.andReturn().getResponse().getContentAsString());
	}

}
