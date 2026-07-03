package com.mokito;

public class StudentService {
 Student s1;
 StudentService(Student s1){
	 this.s1=s1;
 }
 public int roll() {
	 return s1.getroll();
 }
}
