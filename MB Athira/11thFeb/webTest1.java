import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class webTest1 
{
	WebDriver driver;
	WebElement register, firstname, lastname, password;
	
  @Test
  public void test1_registerUser() 
  {
	  register = driver.findElement(By.linkText("Register"));
	  register.click();
	  firstname = driver.findElement(By.name("FirstName"));
	  firstname.sendKeys("athi");
	  lastname = driver.findElement(By.name("LastName"));
	  lastname.sendKeys("mb");
	  password = driver.findElement(By.name("Password"));
	  password.sendKeys("athi123");
	  
  }
  @BeforeTest
  public void beforeTest() 
  {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com");
  }

  @AfterTest
  public void afterTest() 
  {
	  driver.quit();
  }

}