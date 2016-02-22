package spring.boot.example.controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import spring.boot.example.domain.Board;
import spring.boot.example.domain.User;
import spring.boot.example.exception.EntityNotFoundException;
import spring.boot.example.repository.BoardRepository;
import spring.boot.example.repository.UserRepository;
import spring.boot.example.vo.BoardRequestVO;
import spring.boot.example.vo.ResponseVO;

@Controller
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);

	@Autowired
	private BoardRepository boardRepository;

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/boards", method = RequestMethod.GET)
	public String boards(Model model) {
		return "board-list";
	}

	@RequestMapping(value = "/boards/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Board get(@PathVariable int id) {
		return new Board();
	}

	@RequestMapping(value = "/boards/view", method = RequestMethod.GET)
	public String view(Model model) {
		model.addAttribute("boardRequestVO", new BoardRequestVO());
		return "board-view";
	}

	@RequestMapping(value = "/boards", method = RequestMethod.POST)
	public String update(@ModelAttribute @Valid BoardRequestVO requestVO, BindingResult result) {
		if (result.hasErrors()) {
			logger.debug("error.." + result.toString());
			return "board-view";
		}
		User user = userRepository.findOne(requestVO.getUserId());
		if (user == null)
			throw new EntityNotFoundException("user Id ..");

		Board board = new Board(requestVO, user);
		boardRepository.save(board);
		return "board-list";
	}

}
