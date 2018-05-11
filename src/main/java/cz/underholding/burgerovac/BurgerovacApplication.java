package cz.underholding.burgerovac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BurgerovacApplication {

	public static void main(String[] args) {
		SpringApplication.run(BurgerovacApplication.class, args);
	}
}
