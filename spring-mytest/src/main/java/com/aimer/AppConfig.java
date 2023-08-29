package com.aimer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author :覃玉锦
 * @create :2023-08-29 21:55:00
 */
@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	public User user(){
		User user = new User();
		user.setName("玉锦");
		user.setAge(18);
		return user;
	}
}
