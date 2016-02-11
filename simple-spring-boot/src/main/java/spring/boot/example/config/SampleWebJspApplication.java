package spring.boot.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

// @SpringBootApplication
@EnableAutoConfiguration
// 다양한 설정이 자동 수행, 기존으 ㅣ스프링 애플리케이션에
// 필요했던 설정파일이 필요없게 됨.
@ComponentScan(basePackages = { "spring.boot.example" })
public class SampleWebJspApplication extends SpringBootServletInitializer {

  private static final Logger logger = LoggerFactory.getLogger(SampleWebJspApplication.class);

  @Bean
  public BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SampleWebJspApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SampleWebJspApplication.class, args);// 내장 서버 시작.
    logger.error("Message logged at ERROR level");
    logger.warn("Message logged at WARN level");
    logger.info("Message logged at INFO level");
    logger.debug("Message logged at DEBUG level");

  }

}
