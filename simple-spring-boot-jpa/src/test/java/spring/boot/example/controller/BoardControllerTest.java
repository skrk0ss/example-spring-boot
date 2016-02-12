package spring.boot.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.ui.ExtendedModelMap;

import spring.boot.example.base.BaseControllerTests;

public class BoardControllerTest extends BaseControllerTests {

  @Autowired
  private BoardController c;

  ExtendedModelMap model;

  @Before
  public void setUp() throws Exception {
    this.mock = MockMvcBuilders.webAppContextSetup(wac).build();
  }

  @Test
  public void testBoards() {
    System.out.print("Sss");
    //c.boards(model);
  }

  @Test
  @Ignore
  public void testGet() throws Exception {
    String uri = "/boards/{id}".replace("{id}", "1");

    mock.perform(
        get("/boards/{id}", "1").header(HttpHeaders.AUTHORIZATION, uri).contentType(APPLICATION_JSON_UTF8).accept(MediaType.APPLICATION_JSON)
            .characterEncoding("UTF-8")).andExpect(status().isOk()).andDo(print());
  }

}
