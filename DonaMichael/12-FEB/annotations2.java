import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotations2 {
	WebDriver driver;
	WebElement firstname,lastname,password,confirm;
	WebElement register,login,username,pwd;
  @Test
  public void testcase1_login() {
	  login=driver.findElement(By.linkText("Log in"));
	  login.click();
	  username=driver.findElement(By.name("Email"));
	  username.sendKeys("dona");
	  pwd=driver.findElement(By.name("Password"));
	  pwd.sendKeys("pas123$");
	  
  }
  @Test
  public void testcase2_register() {
	  register=driver.findElement(By.linkText("Register"));
	  register.click();
	  firstname=driver.findElement(By.name("FirstName"));
	  firstname.sendKeys("dona");
	  lastname=driver.findElement(By.name("LastName"));
	  lastname.sendKeys("mich");
	  password=driver.findElement(By.name("Password"));
	  password.sendKeys("pas123$");
	  confirm=driver.findElement(By.name("ConfirmPassword"));
	  confirm.sendKeys("pas123$");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test started");
	  driver.findElement(By.linkText("Tricentis")).click();
	  String expOutput="Demo Web Shop. Tricentis";
	  String actOutput=driver.getTitle();
	  assertEquals(actOutput, expOutput);
  }

  @AfterMethod
  public void afterMethod() {
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
