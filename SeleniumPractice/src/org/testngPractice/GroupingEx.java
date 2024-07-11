package org.testngPractice;

import org.testng.annotations.Test;

public class GroupingEx {
  @Test(groups= {"smoke"})
  public void guest() {
	  System.out.println("Hello from guest - lower case");
  }
  @Test(groups= {"smoke","Regression"})
  public void customer() {
	  System.out.println("Hello from Customer");
  }
  @Test(groups= {"Regression"})
  public void xerox() {
	  System.out.println("Hello from xerox");
  }
  @Test
  public void Guest() {
	  System.out.println("Hello from Guest - upper case");
  }
}