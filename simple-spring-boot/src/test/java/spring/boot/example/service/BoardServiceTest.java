package spring.boot.example.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import spring.boot.example.config.SampleWebJspApplication;
import spring.boot.example.domain.Board;
import spring.boot.example.domain.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(SampleWebJspApplication.class)
@WebAppConfiguration
public class BoardServiceTest {

  @Autowired
  private BoardService boardService;

  @Autowired
  private UserService userService;

  private Board board;

  @Before
  public void setUp() {
    User user = User.newInstance("test@rsupport.com", "111111");
    userService.merge(user);

    board = new Board();
    board.setUserId(user.getId());
    board.setTitle("title");
    board.setContents("contents");
    board.setHits(1);
    board.setEnabled(true);

    boardService.merge(board);
  }

  @Test
  @Ignore
  public void testGet() {
    Board board = boardService.get(1);
    Assert.assertEquals(null, board.getId());
  }

  @Test
  @Ignore
  public void testGetAll() {
    List<Board> list = boardService.getAll();

  }

}
