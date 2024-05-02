package com.example.testsetupdemo.service.mock;

import com.example.testsetupdemo.service.SomeServiceContract;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;

@Service
@ConditionalOnProperty(name = "service.mock", havingValue = "true")
public class ServiceMock implements SomeServiceContract {
    @Value("${some.config.property}")
    private String someConfigProperty;

    @Override
    public String doSomething() {
        return "I will do nothing with the %s!".formatted(someConfigProperty);
    }
}
