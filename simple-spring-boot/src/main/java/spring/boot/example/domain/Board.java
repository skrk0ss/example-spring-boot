package spring.boot.example.domain;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Board {

  private Integer id;

  private String userId;

  private String title;

  private String contents;

  private Integer hits;

  private boolean enabled;

  private Date createdDate;

  private Date updatedDate;

  private Board(String userId, String title, String contents) {
    this.userId = userId;
    this.title = title;
    this.contents = contents;
    this.hits = 0;
    this.enabled = true;
  }

  public static Board newInstance(String userId, String title, String contents) {
    return new Board(userId, title, contents);
  }

}
