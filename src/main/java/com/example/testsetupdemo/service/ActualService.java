package com.example.testsetupdemo.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service.mock", havingValue = "false")
public class ActualService implements SomeServiceContract {
    @Value("${some.config.property}")
    private String someConfigProperty;

    @Override
    public String doSomething() {
        return "I've sent the value %s to the other service!".formatted(someConfigProperty);
    }
}
