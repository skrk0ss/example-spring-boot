package spring.boot.example.util;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PasswordUtilTest {

  protected final Logger logger = LoggerFactory.getLogger(getClass());

  org.springframework.security.crypto.password.PasswordEncoder bcryptPasswordEncoder;

  @Before
  public void setup() {
    bcryptPasswordEncoder = new org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder();
  }

  @Test
  public void test() {
    String rawPassword = "111111";
    logger.debug(bcryptPasswordEncoder.encode(rawPassword));
  }
}
