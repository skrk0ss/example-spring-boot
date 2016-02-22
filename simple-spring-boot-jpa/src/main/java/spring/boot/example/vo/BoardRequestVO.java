package spring.boot.example.vo;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
  @NotNull
  private String userId;

  @JsonProperty
  @NotNull
  @Size(min = 2, max = 50, message = "invalid length....title")
  private String title;

  @JsonProperty
  @NotNull
  @Size(min = 2, max = 500, message = "invalid length....contents")
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
