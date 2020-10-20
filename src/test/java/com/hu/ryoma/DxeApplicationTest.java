package com.hu.ryoma;

import com.hu.ryoma.bean.Person;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DxeApplicationTest {


    @Autowired
    private Person person;

    @Test
    public void t1(){
        System.out.println(person);
    }
}
