package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void sampleTest(){
        Integer a = 2;
        Integer b = 1;
        Assertions.assertEquals(3, a+b);
    }

}
