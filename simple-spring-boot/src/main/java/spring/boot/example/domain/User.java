package spring.boot.example.domain;

import java.util.Date;

import org.springframework.security.core.authority.AuthorityUtils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import spring.boot.example.util.CommonUtils;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class User {

  private String id;

  private String password;

  private String email;

  private boolean status;

  private String role;

  private Date createdDate;

  private Date updatedDate;

  public User(String email, String password) {
    // super(email, password, true, true, true, true, AuthorityUtils.createAuthorityList(Role.ADMIN.toString()));
    this.id = CommonUtils.getRandomString();
    this.email = email;
    this.status = true;
    this.createdDate = new Date();
    this.role = Role.ADMIN.toString();
  }

  public static User newInstance(String email, String password) {
    return new User(email, password);
  }
}
