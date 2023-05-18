package com.anmol.Milestone.SpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
@EnableWebSecurity
public class MilestoneSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(MilestoneSpringBootApplication.class, args);
	}

}
