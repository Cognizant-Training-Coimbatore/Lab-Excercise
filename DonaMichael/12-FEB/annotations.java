import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotations {
  @Test
  public void t1() {
	  System.out.println("Test1 is runing");
  }
  @Test
  public void t2() {
	  System.out.println("Test2 is runing");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before method is running");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After method is running");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before test is running");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After test is running");
  }

}
