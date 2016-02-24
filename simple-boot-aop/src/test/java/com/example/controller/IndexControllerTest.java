package com.example.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.example.SimpleBootAopApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SimpleBootAopApplication.class)
@WebAppConfiguration
public class IndexControllerTest {

	@Autowired
	private IndexController c;

	@Test
	public void testIndex() {
		c.index();
	}
}
