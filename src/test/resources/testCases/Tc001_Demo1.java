package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Tc001_Demo1 {
  @Test
  public void f() {
	  
	  System.out.println("This is my first functionality");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("This is after test");
	  System.out.println("This is logout functionality");
  }

}
