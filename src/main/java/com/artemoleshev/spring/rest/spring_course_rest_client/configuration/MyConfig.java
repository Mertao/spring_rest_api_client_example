package com.artemoleshev.spring.rest.spring_course_rest_client.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@ComponentScan("com.artemoleshev.spring.rest")
public class MyConfig {
	
	@Bean
	public RestTemplate restTemplate() {
		// вспомогательный класс для http запросов
		return new RestTemplate();
	}
}
