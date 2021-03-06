package spring.boot.example.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {

  private static final Logger logger = LoggerFactory.getLogger(SampleController.class);

  @RequestMapping("/home")
  @ResponseBody
  public String home() {
    return "Hello World!";
  }

}