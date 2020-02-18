package SeleniumGrid;

import org.testng.annotations.Test;

public class test2 {
  @Test
  public void f2() throws InterruptedException {
	  int  j;
	  for(j=0;j<20;j++)
	  {
		  System.out.println("The value of j is "+j);
		  Thread.sleep(2000);
	  }
  }
}
