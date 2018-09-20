package com.cricket.stats;

import com.cricket.stats.requests.*;
//import com.cricket.stats.service.PlayerService;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@Configuration
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@SpringBootApplication
public class CricketStatsToDBApplication {

	public static void main(String[] args) {
		SpringApplication.run(CricketStatsToDBApplication.class, args);
	}

	/*@Bean
	CommandLineRunner runner(PlayerService userService){
	    return args -> {
			// read JSON and load json
			ObjectMapper mapper = new ObjectMapper();
			TypeReference<List<PlayerBatting>> typeReference = new TypeReference<List<PlayerBatting>>(){};
			InputStream inputStream = TypeReference.class.getResourceAsStream("/json/playersStats.json");
			try {
				List<PlayerBatting> users = mapper.readValue(inputStream,typeReference);
				userService.save(users);
				System.out.println("Users Saved!");
			} catch (IOException e){
				System.out.println("Unable to save users: " + e.getMessage());
			}
	    };
	}*/
}
