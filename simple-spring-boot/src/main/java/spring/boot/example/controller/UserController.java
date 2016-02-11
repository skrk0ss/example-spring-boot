package spring.boot.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import spring.boot.example.domain.User;
import spring.boot.example.service.UserService;
import spring.boot.example.util.StringUtils;
import spring.boot.example.vo.ResponseVO;
import spring.boot.example.vo.UserRequestVO;

@RestController
public class UserController {

  private static final Logger logger = LoggerFactory.getLogger(UserController.class);

  @Autowired
  private UserService userService;

  @RequestMapping(value = "/users", method = RequestMethod.POST)
  public ResponseVO update(@RequestBody UserRequestVO requestVO) {
    // if(StringUtils.isNotBlank(user.getId())){
    // user = new User(email, username);
    // }
    User user = User.newInstance(requestVO.getEmail(), requestVO.getPasword());
    int rtn = userService.merge(user);
    logger.warn("rtn:" + rtn);
    return ResponseVO.ok();
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
  public User get(@PathVariable String id) {
    return userService.getUser(id);
  }

  @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
  public ResponseVO delete(@PathVariable String id) {
    userService.delete(id);
    return ResponseVO.ok();
  }

}
