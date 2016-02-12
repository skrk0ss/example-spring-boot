package spring.boot.example.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = { "spring.boot.example" })
public class SampleWebJspApplication extends SpringBootServletInitializer {

  private static final Logger logger = LoggerFactory.getLogger(SampleWebJspApplication.class);


  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(SampleWebJspApplication.class);
  }

  public static void main(String[] args) throws Exception {
    SpringApplication.run(SampleWebJspApplication.class, args);// 내장 서버 시작.
    logger.info("Message logged at INFO level");
    logger.debug("Message logged at DEBUG level");

  }

}
