package testngPackage;

import org.testng.annotations.Test;

public class groups {
  @Test(groups= {"smoketests"})
  public void test1() 
  {
	  System.out.println("Smoketests-Testcase1");
  }
  @Test(groups= {"smoketests"})
  public void test2() 
  {
	  System.out.println("Smoketests-Test2");
  }
  @Test(groups= {"regressiontests"})
  public void test3() 
  {
	  System.out.println("Group2-Test3");
  }
  
}
