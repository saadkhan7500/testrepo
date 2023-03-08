package com.ShoppingApplication;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShoppingApplicationTests {
	
	public static  org.slf4j.Logger logger=LoggerFactory.getLogger(ShoppingApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("test is running....");
		assertEquals(true, true);
	}

}
