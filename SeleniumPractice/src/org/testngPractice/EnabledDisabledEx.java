package org.testngPractice;

import org.testng.annotations.Test;

public class EnabledDisabledEx {
  @Test(enabled=true)
  public void guest() {
	  System.out.println("Hello from guest - lower case");
  }
  @Test(enabled=false)
  public void customer() {
	  System.out.println("Hello from Customer");
  }
  @Test(enabled=false)
  public void xerox() {
	  System.out.println("Hello from xerox");
  }
  @Test(enabled=false)
  public void Guest() {
	  System.out.println("Hello from Guest - upper case");
  }
}