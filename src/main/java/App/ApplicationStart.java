package App;

import java.util.Properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"Controllers"})
public class ApplicationStart {
	

	public static void main(String[] args) {
		//AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();
		SpringApplication s = new SpringApplication(ApplicationStart.class);
		Properties config = new Properties();
		config.setProperty("spring.main.banner-mode", "off");
		config.setProperty("logging.level.root", "INFO");
		config.setProperty("server.port", "8080");
		
		s.setDefaultProperties(config);
		s.run(args);
	}
}
