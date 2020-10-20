package com.hu.ryoma.bean;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Integer age;
    private Map<String, String> map;
    private List<String> list;
    private Dog dog;

    @Override
    public String toString() {
        return "name";
    }
}
