package SeleniumGrid;

import org.testng.annotations.Test;

public class test1 {
  @Test
  public void f1() throws InterruptedException {
	  int  i;
	  for(i=0;i<20;i++)
	  {
		  System.out.println("The value of i is "+ i);
		  Thread.sleep(2000);
	  }
  }
}
