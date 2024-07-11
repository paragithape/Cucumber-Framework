package org.testngPractice;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersEx1 {
	@Parameters({"userName","password","browserName"})
	@Test
	public void guest(String uName, String pwd, String bName) {
		System.out.println("Hello");
		System.out.println("Username: "+uName);
		System.out.println("Password : "+pwd);
		System.out.println("browser name: "+bName);
	}
}