package com.example.testsetupdemo;

import com.example.testsetupdemo.service.SomeServiceContract;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSetupDemoApplication {
  private static final Logger log = LoggerFactory.getLogger(TestSetupDemoApplication.class);
  public static void main(String[] args) {
    var app = SpringApplication.run(TestSetupDemoApplication.class, args);
    log.info(app.getBean(SomeServiceContract.class).doSomething());
  }
}
