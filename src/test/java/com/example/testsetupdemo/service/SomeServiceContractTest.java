package com.example.testsetupdemo.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SomeServiceContractTest {
    private static final Logger log = LoggerFactory.getLogger(SomeServiceContractTest.class);


    @Autowired
    private SomeServiceContract someServiceContract;

    @Test
    public void testDoSomething() {
        log.info(someServiceContract.doSomething());
    }
}
