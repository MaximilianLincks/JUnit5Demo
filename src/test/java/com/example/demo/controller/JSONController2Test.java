package com.example.demo.controller;

import com.example.demo.model.Greeting;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class JSONController2Test {

    @Autowired
    JSONController jsonController;

    String from = "Maxi";
    String to = "B4";
    String greeting = "Cactus = Good";

    @Test
    void greet(){
        Greeting g = jsonController.greet(from,to,greeting);

        assertEquals(g, new Greeting(from,to,greeting));
    }
}
