package com.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestCalc {
	Calculator cal=new Calculator();
    @Test
    void test() {
     assertEquals(5,cal.add(3,2));
    }
     @Test
     void test2() {
    	 assertEquals(10,cal.sub(20,10));
     }
     @Test
     void test3() {
    assertEquals(25,cal.mul(5,5));
     }
     @Test
     void test4() {
     assertEquals(1,cal.div(40,40));
    }
}
