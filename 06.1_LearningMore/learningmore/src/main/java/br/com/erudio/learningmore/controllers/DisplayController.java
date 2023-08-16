package br.com.erudio.learningmore.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DisplayController {

  @RequestMapping("api/display")
  public String display() {
    return "Olá";
  }
}
