package com.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.example.logger.LoggerInterceptor;

@Configuration
@ComponentScan("com.example")
@EnableWebMvc
public class AppConfig extends WebMvcConfigurerAdapter {

//	@Override
//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/index");
//	}
}