package spring.boot.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import spring.boot.example.base.BaseControllerTests;

public class SampleControllerTest extends BaseControllerTests {

  @Before
  public void setUp() throws Exception {
    this.mock = MockMvcBuilders.webAppContextSetup(wac).build();
  }

  @Test
  public void testHome() throws Exception {
    mock.perform(get("/home").contentType(APPLICATION_JSON_UTF8).accept(MediaType.APPLICATION_JSON).characterEncoding("UTF-8"))
        .andExpect(status().isOk()).andDo(print());
  }

}
