package testngPackage;

import org.testng.annotations.Test;

public class dependency {
  @Test
  public void login() {
	  System.out.println("Login");
  }
  
  @Test(dependsOnMethods= {"login"})
  public void createOrder() {
	  System.out.println("Create order");
  }
  @Test(dependsOnMethods={"createOrder"})
  public void deleteOrder() {
	  System.out.println("Delete order");
  }
  
}
