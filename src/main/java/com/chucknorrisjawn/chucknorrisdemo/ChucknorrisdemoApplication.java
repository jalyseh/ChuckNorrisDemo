package com.chucknorrisjawn.chucknorrisdemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@SpringBootApplication
@EnableScheduling
public class ChucknorrisdemoApplication {

		private static final Logger log = LoggerFactory.getLogger(ChucknorrisdemoApplication.class);

		public static void main(String[] args) {
			SpringApplication.run(ChucknorrisdemoApplication.class, args);
		}

		@Bean
		public RestTemplate restTemplate(RestTemplateBuilder builder) {
			return builder.build();
		}

		@Bean
		public CommandLineRunner run(RestTemplate restTemplate) throws Exception {
			return args -> {
			reportCurrentTime();
			};
		}
		@Scheduled (fixedRate = 5000)
		public void reportCurrentTime() {
			RestTemplate restTemplate = new RestTemplate();
			Joke joke = restTemplate.getForObject(
					"https://api.chucknorris.io/jokes/random", Joke.class);
			log.info("Here is the joke: " + joke.getValue());

		}
	}

