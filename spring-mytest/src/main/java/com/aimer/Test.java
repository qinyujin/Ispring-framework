package com.aimer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author :覃玉锦
 * @create :2023-08-29 21:58:00
 */
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		User user = (User) context.getBean("user");
		System.out.println(user);
	}
}
