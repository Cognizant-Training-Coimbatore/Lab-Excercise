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

@Test
public class logreg {
	WebDriver driver;
	WebElement firstname,lastname,password,confirm;
	WebElement register,login,username,pwd;
  public void testcase1_login() {
	  login=driver.findElement(By.linkText("Log in"));
	  login.click();
	  username=driver.findElement(By.name("Email"));
	  username.sendKeys("venkat");
	  pwd=driver.findElement(By.className("Password"));
	  pwd.sendKeys("venkat1234");
	  
	  
	  
  }
  public void testcase2_login() {
	  register=driver.findElement(By.linkText("Register"));
	  register.click();
	  firstname=driver.findElement(By.name("FirstName"));
	  firstname.sendKeys("venkat");
	  lastname=driver.findElement(By.className("LastName"));
	  lastname.sendKeys("paul");
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("test started");
	  driver.findElement(By.linkText("Tricentis")).click();
	  String expOutput="Demo Web Shop. Tricentis";
	  String actOutput=driver.getTitle();
	  assertEquals(actOutput,expOutput);
	// assertEquals(actOutput, expOutput); 
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
