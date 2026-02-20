package com.example.deployment;

import com.example.deployment.controller.CommonController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DeploymentApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void testGreet() {
//		test me
		assertEquals("Hello, Jenkins", CommonController.greet("Jenkins"));
	}

}
