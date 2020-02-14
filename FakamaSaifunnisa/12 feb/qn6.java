import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class qn6 {
	WebDriver driver;
	WebElement text1,text2;
  @Test
  public void test1() throws InterruptedException {
	  text1=driver.findElement(By.id("t1"));
	  text1.sendKeys("sam is a good girl");
	  text2=driver.findElement(By.id("t2"));
	  text2.sendKeys("sam is a good girl");
	  driver.findElement(By.id("b1")).click();
	  Thread.sleep(5000);
	  String value=text1.getAttribute("value");
	  String value1=text2.getAttribute("value");
	  if(value1.equals(value)) {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
   	   js.executeScript("alert('both are same');");
	  }
	  else {
		  JavascriptExecutor js=(JavascriptExecutor)driver;
	   	   js.executeScript("alert('both are not same');");
	  }
	  
  }

  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("file:///C:/Users/Admin/Downloads/testcase6.html");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
