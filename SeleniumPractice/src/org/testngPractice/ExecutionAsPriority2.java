package org.testngPractice;

import org.testng.annotations.Test;

public class ExecutionAsPriority2 {
  @Test(priority=3)
  public void guest() {
	  System.out.println("Hello from guest - lower case");
  }
  @Test
  public void customer() {
	  System.out.println("Hello from Customer");
  }
  @Test(priority=0)
  public void xerox() {
	  System.out.println("Hello from xerox");
  }
  @Test(priority=-5)
  public void Guest() {
	  System.out.println("Hello from Guest - upper case");
  }
  @Test(priority=-7)
  public void Guest11() {
	  System.out.println("Hello from Guest11 - upper case");
  }
}