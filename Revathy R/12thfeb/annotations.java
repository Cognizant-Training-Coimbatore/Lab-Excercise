import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotations {
  @Test
  public void t1() 
  {
	  System.out.println("test1 is running");
  }
  @Test
  public void t2() 
  {
	  System.out.println("test2 is running");
  }
  @BeforeMethod
  public void beforeMethod()
  {
	  System.out.println("before method is running");
  }

  @AfterMethod
  public void afterMethod()
  {
	  System.out.println("after method is running");
  }

  @BeforeTest
  public void beforeTest() 
  {
	  System.out.println("before test is running");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("after test is running");
  }

}
