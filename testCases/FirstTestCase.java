package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class FirstTestCase {
  @Test
  public void f() {
	  
	  System.out.println("Function Definition");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("Before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

}
