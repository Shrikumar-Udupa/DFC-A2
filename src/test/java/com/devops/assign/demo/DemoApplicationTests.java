package com.devops.assign.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Assert.isTrue(true, "asserted to true");
	}

	@Test
	void testfails() {
		//Assert.isTrue(false, "asserted to false when expecting true");
	}

}
