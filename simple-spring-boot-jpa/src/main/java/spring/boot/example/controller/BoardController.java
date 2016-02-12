package spring.boot.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.boot.example.domain.Board;
import spring.boot.example.vo.BoardRequestVO;
import spring.boot.example.vo.ResponseVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);


	@RequestMapping(value = "/boards", method = RequestMethod.GET)
	public String boards(Model model) {
		return "board-list";
	}

	@RequestMapping(value = "/boards/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Board get(@PathVariable int id) {
		return new Board();
	}

	@RequestMapping(value = "/boards", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO update(@RequestBody BoardRequestVO requestVO) {
		return ResponseVO.ok();
	}
}
