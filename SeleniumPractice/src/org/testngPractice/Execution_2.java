package org.testngPractice;

import org.testng.annotations.Test;

public class Execution_2 {
  @Test
  public void guest() {
	  System.out.println("Hello from guest - lower case");
  }
  @Test
  public void customer() {
	  System.out.println("Hello from Customer");
  }
  @Test
  public void xerox() {
	  System.out.println("Hello from xerox");
  }
  @Test
  public void Guest() {
	  System.out.println("Hello from Guest - upper case");
  }
}
//A = 65
//a = 97
//Execution happens as per ASCII values of @Test method names