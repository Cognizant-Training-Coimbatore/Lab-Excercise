import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

public class Annotation {
  @Test
  public void t1() 
  {
	  System.out.println("Test 1 is running........");
  }
  @Test
  public void t2() 
  {
	  System.out.println("Test 2 is running........");
  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  System.out.println("Before method running");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  System.out.println("After Method running");
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("Before test running");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("After test running");
  }

}
