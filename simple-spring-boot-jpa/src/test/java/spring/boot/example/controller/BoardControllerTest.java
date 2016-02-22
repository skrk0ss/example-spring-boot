package spring.boot.example.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
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
import spring.boot.example.domain.User;
import spring.boot.example.repository.UserRepository;
import spring.boot.example.util.JsonUtils;
import spring.boot.example.vo.BoardRequestVO;

public class BoardControllerTest extends BaseControllerTests {

	@Autowired
	private BoardController c;

	@Autowired
	private UserRepository userRepository;

	ExtendedModelMap model;

	User user;

	@Before
	public void setUp() throws Exception {
		this.mock = MockMvcBuilders.webAppContextSetup(wac).build();
		user = User.newInstance("test@gmail.com", "111111");
		user = userRepository.save(user);
	}

	@Test
	public void testBoards() {
		System.out.print("Sss");
		// c.boards(model);
	}

	@Test
	@Ignore
	public void testGet() throws Exception {
		String uri = "/boards/{id}".replace("{id}", "1");

		mock.perform(get("/boards/{id}", "1").header(HttpHeaders.AUTHORIZATION, uri).contentType(APPLICATION_JSON_UTF8)
				.accept(MediaType.APPLICATION_JSON).characterEncoding("UTF-8")).andExpect(status().isOk())
				.andDo(print());
	}

	@Test
	public void testUtpdate() throws Exception {
		BoardRequestVO requestVO = new BoardRequestVO();
		requestVO.setUserId("test");
		requestVO.setTitle("");
		requestVO.setContents("contents..");

		mock.perform(post("/boards").contentType(APPLICATION_JSON_UTF8).content(JsonUtils.toString(requestVO))
				.accept(MediaType.TEXT_HTML).characterEncoding("UTF-8")).andDo(print());
	}

}
