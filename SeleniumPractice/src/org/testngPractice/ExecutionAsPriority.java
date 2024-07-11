package org.testngPractice;

import org.testng.annotations.Test;

public class ExecutionAsPriority {
  @Test(priority=3)
  public void guest() {
	  System.out.println("Hello from guest - lower case");
  }
  @Test(priority=2)
  public void customer() {
	  System.out.println("Hello from Customer");
  }
  @Test(priority=1)
  public void xerox() {
	  System.out.println("Hello from xerox");
  }
  @Test(priority=4)
  public void Guest() {
	  System.out.println("Hello from Guest - upper case");
  }
}