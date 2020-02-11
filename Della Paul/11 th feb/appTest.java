import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class appTest {
  @BeforeTest
  public void beforeTest()
  {
	  System.out.println("Test started...");
  }

  @AfterTest
  public void afterTest() 
  {
	  System.out.println("Test execution is over...");
  }


  @Test
  public void findLengthTest()
  {
	  System.out.println("Test is running...");
	  app obj=new app();
	  String x= "java";
	  int explength=5;
	  int actlength=obj.findLength(x);
	  assertEquals(actlength,explength);
	  
  }
}
