package com.csoftz.cicd.process;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class CicdProcessApplicationTests {
	@Autowired
	private ApplicationContext appContext;

	@Test
	void contextLoads() {
		assertThat(appContext).isNotNull();
	}

}
