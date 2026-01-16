package org.test.demo.entity;

import org.springframework.context.annotation.Configuration;

/**
 * @author Keson
 * @date 2026/1/16 16:57
 *
 */
@Configuration
public class User {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String showInfo() {
		this.setAge(18);
		this.setName("Keson");
		return name+":"+age;
	}
}
