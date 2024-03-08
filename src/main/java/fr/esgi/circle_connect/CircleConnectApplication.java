package fr.esgi.circle_connect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(enableDefaultTransactions = false)
public class CircleConnectApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircleConnectApplication.class, args);
	}

}
