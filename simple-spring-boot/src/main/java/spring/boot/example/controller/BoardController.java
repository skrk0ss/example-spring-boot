package spring.boot.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.boot.example.domain.Board;
import spring.boot.example.service.BoardService;
import spring.boot.example.vo.BoardRequestVO;
import spring.boot.example.vo.ResponseVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardService boardService;

	@RequestMapping(value = "/boards", method = RequestMethod.GET)
	public String boards(Model model) {
		List<Board> list = boardService.getAll();
		model.addAttribute("list", list);
		return "board-list";
	}

	@RequestMapping(value = "/boards/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Board get(@PathVariable int id) {
		logger.info("BoardController.get_info");
		logger.warn("BoardController.get_warn");
		return boardService.get(id);
	}

	@RequestMapping(value = "/boards", method = RequestMethod.POST)
	@ResponseBody
	public ResponseVO update(@RequestBody BoardRequestVO requestVO) {
		Board board = Board.newInstance(requestVO.getUserId(), requestVO.getTitle(), requestVO.getContents());
		boardService.merge(board);
		logger.debug("BoardController.update_info");
		logger.warn("BoardController.update_warn");
		return ResponseVO.ok();
	}
}
