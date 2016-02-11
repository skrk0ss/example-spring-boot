package spring.boot.example.vo;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class BoardRequestVO {

  @JsonProperty
  private String userId;

  @JsonProperty
  private String title;

  @JsonProperty
  private String contents;

  @JsonProperty
  private int hits;

  @JsonProperty
  private boolean enabled;

  @JsonProperty
  private Date createdDt;

  @JsonProperty
  private Date updatedDt;
}
