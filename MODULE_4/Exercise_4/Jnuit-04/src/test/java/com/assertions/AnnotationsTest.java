package com.assertions;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnnotationsTest {
	Annotations cal;
  @BeforeEach
  void create() {
	  cal=new Annotations();
	  System.out.println("Before Each TestCase....");
  }
  @Test
  void test1() {
	  int a=15,b=15;
	  System.out.println("TestCase 1");
	  assertEquals(30,cal.add(a,b));
	  
  }
  @Test
  void test2() {
	  int a=12,b=8;
	  System.out.println("TestCase 2");
	  assertEquals(20,cal.add(a,b));
	 
	  
  }
  @AfterEach
  void aftereach() {
	 System.out.println("Program tested successfully");
  }
}
