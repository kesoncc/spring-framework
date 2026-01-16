package org.test.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.test.demo.entity.User;

/**
 * @author Keson
 * @date 2026/1/16 17:04
 *
 */
@Configuration
public class TestConfig {
	@Bean
	public User user() {
		return new User();
	}
}
