package spring.boot.example.vo;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;

@Getter
@Setter
public class UserRequestVO {

  @JsonProperty
  private String id;

  @JsonProperty
  private String email;

  @JsonProperty
  private String pasword;

  @JsonProperty
  private boolean status;

  @JsonProperty
  private Date createdDate;

  @JsonProperty
  private Date updatedDate;
}
