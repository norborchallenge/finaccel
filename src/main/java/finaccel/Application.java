package finaccel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author nuboat
 */
@Configuration
@ComponentScan
@EnableWebMvc
@EnableAutoConfiguration
@SpringBootApplication
public class Application extends WebMvcAutoConfiguration {

    public static void main(final String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
