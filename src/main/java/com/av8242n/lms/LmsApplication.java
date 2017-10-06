package com.av8242n.lms;

import com.av8242n.lms.repositories.AllowanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.av8242n.lms"})
@ComponentScan(basePackages = "com.av8242n.lms")
@EnableJpaRepositories(basePackages = "com.av8242n.lms.repositories")
@EntityScan(basePackages = "com.av8242n.lms.model")
public class LmsApplication {

	public static void main(String[] args) {

		SpringApplication.run(LmsApplication.class, args);
	}
}
