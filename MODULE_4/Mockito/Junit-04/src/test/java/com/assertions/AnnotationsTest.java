package com.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class AnnotationsTest {
	Annotations cal;
  @BeforeEach
  void create() {
	  cal=new Annotations();
	  System.out.println("Before Each TestCase....");
  }
  
  @ParameterizedTest
  @CsvSource({"2,3,5","5,5,10","10,10,20"})
  
  void testPara(int a, int b, int exp) {
	  assertEquals(exp,cal.add(a, b));
  }
  @AfterEach
  void aftereach() {
	 System.out.println("Program tested successfully");
  }
}
