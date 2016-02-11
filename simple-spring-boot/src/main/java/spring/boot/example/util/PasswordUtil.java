package spring.boot.example.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public final class PasswordUtil {

  private BCryptPasswordEncoder passwordEncoder;

  @Autowired
  public void setPasswordEncoder(BCryptPasswordEncoder passwordEncoder) {
    this.passwordEncoder = passwordEncoder;
  }

  private PasswordUtil() {}

  public String encodePassword(String rawPassword) {
    return passwordEncoder.encode(rawPassword);
  }

  public boolean isMatchedPassword(String paramPassword, String originalPassword) {
    boolean result = false;
    if (passwordEncoder.matches(originalPassword, paramPassword)) {
      result = true;
    }
    return result;
  }
}
