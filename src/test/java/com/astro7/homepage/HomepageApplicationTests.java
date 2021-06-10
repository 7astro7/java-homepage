package com.astro7.homepage;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class HomepageApplicationTests {

    @Autowired 
    private HomepageApplication controller;

	@Test
	void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
	}

}
