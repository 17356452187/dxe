package com.hu.ryoma.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "person.dog")
public class Dog {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "name";
    }
}
