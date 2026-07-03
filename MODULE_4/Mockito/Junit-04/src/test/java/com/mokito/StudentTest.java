package com.mokito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
public class StudentTest {
  @Test
  void test() {
	  
	  Student mock=Mockito.mock(Student.class);
	  StudentService service=new StudentService(mock);
	  when(mock.getroll()).thenReturn (102);
	  assertEquals(102,service.roll());
	  verify(mock).getroll();
  }
}
