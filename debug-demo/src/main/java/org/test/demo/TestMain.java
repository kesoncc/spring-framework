package org.test.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.test.demo.config.TestConfig;
import org.test.demo.entity.User;

/**
 * @author Keson
 * @date 2026/1/16 16:52
 *
 */

public class TestMain {
	public static void main(String[] args) {


		var context = new AnnotationConfigApplicationContext(TestConfig.class);
		User user = context.getBean(User.class);
		System.out.println(user.showInfo());
	}
}
