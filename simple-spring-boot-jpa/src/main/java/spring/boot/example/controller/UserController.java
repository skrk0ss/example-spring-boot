package spring.boot.example.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.example.domain.User;
import spring.boot.example.repository.UserRepository;
import spring.boot.example.vo.ResponseVO;
import spring.boot.example.vo.UserRequestVO;

@RestController
public class UserController {

  @Autowired
  private UserRepository userRepository;

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public ResponseVO update(@RequestBody UserRequestVO requestVO) {
    return ResponseVO.ok();
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public User get(@PathVariable String id) {
    List<User> list = userRepository.findAll();
    return new User();
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
  public ResponseVO delete(@PathVariable String id) {
    return ResponseVO.ok();
  }

}
