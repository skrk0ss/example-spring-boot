package spring.boot.example.service;

import org.springframework.security.core.authority.AuthorityUtils;

import lombok.Data;
import spring.boot.example.domain.User;

@Data
public class LoginUserDetails extends org.springframework.security.core.userdetails.User {

  private static final long serialVersionUID = -2526644270175032849L;

  private final User user;

  public LoginUserDetails(User user) {
    super(user.getEmail(), user.getPassword(), AuthorityUtils.createAuthorityList("ROLE_USER"));
    this.user = user;
  }

}
