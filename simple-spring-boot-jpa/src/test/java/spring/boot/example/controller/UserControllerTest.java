package spring.boot.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spring.boot.example.base.BaseControllerTests;
import spring.boot.example.domain.User;
import spring.boot.example.util.JsonUtils;
import spring.boot.example.vo.UserRequestVO;

public class UserControllerTest extends BaseControllerTests {

  private User user;

  @Autowired
  private UserController c;

  @Before
  public void setUp() throws Exception {
    this.mock = MockMvcBuilders.webAppContextSetup(wac).build();
  }

  @Test
  public void testUpdate() throws Exception {
    UserRequestVO requestVO = new UserRequestVO();
    requestVO.setEmail("email@test.com");
    requestVO.setPasword("11111");

    logger.warn(JsonUtils.toString("contents:" + requestVO));
    mock.perform(
        post("/users").contentType(APPLICATION_JSON_UTF8).content(JsonUtils.toString(requestVO)).accept(MediaType.APPLICATION_JSON)
            .characterEncoding("UTF-8")).andDo(print());
  }
}
