import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterTest;

public class appTest {
  @BeforeTest
  public void beforeTest() {
	  System.out.println("test started......");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("test over......");
  }


  @Test
  public void findLengthTest() {
    System.out.println("test is running");
    app obj=new app();
    String x="java";
    int explength=5;
    int actlength=obj.findLength(x);
    assertEquals(actlength, explength);
    
    
  }
}
