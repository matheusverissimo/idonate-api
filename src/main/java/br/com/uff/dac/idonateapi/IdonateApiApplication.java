package br.com.uff.dac.idonateapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class IdonateApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdonateApiApplication.class, args);
	}

}
