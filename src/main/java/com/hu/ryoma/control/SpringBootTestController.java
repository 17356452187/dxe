package com.hu.ryoma.control;

import com.alibaba.fastjson.JSONObject;
import com.hu.ryoma.bean.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class SpringBootTestController {

    @Resource(name = "person")
    private Person person;

    @GetMapping("/helloworld")
    public String hello() {
        return JSONObject.toJSONString(person);
    }
}
