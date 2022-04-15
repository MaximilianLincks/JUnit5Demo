package com.example.demo.slides;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdderTest {

    Adder adder;

    @BeforeEach
    public void setUp(){
        adder = new Adder();
    }

    @Test
    public void testAdd(){
        int addedAmount = 5;

        assertEquals(addedAmount,adder.add(addedAmount));
    }

    @Test
    public void testReset(){
        adder.add(5);
        adder.reset();
        assertEquals(0,adder.getAmount());
    }
}
