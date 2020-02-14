import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

public class NewTest {
	WebDriver driver;
	WebElement text1,text2,clickme;
  @Test
  public void lengthofString() {
	 text1= driver.findElement(By.id("t1"));
	 text1.sendKeys("dona");
	 clickme=driver.findElement(By.id("b1"));
	 clickme.click();
	 
	 
	  
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
