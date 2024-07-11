package org.testngPractice;

import org.testng.annotations.Test;

public class Execution_1 {
  @Test
  public void exampleMethod1() {
	  System.out.println("Hello from Example method 1");
	  exampleMethod2();
  }
  
  public void exampleMethod2() {
	  System.out.println("Hello from Example method 2");
  }

  public void exampleMethod3() {
	  System.out.println("Hello from Example method 3");
  }
  @Test
  public void exampleMethod4() {
	  System.out.println("Hello from Example method 4");
  }
}