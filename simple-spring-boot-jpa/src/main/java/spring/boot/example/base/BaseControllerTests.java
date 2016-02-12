package spring.boot.example.base;

import java.nio.charset.Charset;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import spring.boot.example.config.SampleWebJspApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SampleWebJspApplication.class)
@WebAppConfiguration
@Transactional
public abstract class BaseControllerTests {

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  protected static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(),
      MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));

  @Autowired
  protected WebApplicationContext wac;

  protected MockMvc mock;

}
