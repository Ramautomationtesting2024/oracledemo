package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f() {
	  
	  System.out.println("This is at test");
	  System.out.println("Do the task ");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("This is before method");
	  System.out.println("Do Login");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("This is after method");
	  System.out.println("Do Logout");
  }

}
