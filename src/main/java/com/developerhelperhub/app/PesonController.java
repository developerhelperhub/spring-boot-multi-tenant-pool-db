package com.developerhelperhub.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/person")
public class PesonController {

  @Autowired
  private PersonRepository repository;

  @GetMapping("/list")
  public void list() {
    this.repository.findAll().forEach(p -> {

      System.out.println(p);

    });
  }

}
