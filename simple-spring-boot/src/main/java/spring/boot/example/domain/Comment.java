package spring.boot.example.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
public class Comment {

  private int id;

  private int userId;

  private String boardId;

  private String comment;

  private boolean enabled;
}
