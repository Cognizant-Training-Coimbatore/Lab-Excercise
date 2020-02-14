package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class dataprovider {
	WebDriver driver;
	
  @Test(dataProvider = "facebook")
  public void f(String uid, String pwd) {
	  driver.findElement(By.id("email")).sendKeys(uid);
	  driver.findElement(By.id("pass")).sendKeys(pwd);
	  driver.findElement(By.id("u_0_b"));
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver,chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://facebook.com");
  }

  @AfterMethod
  public void afterMethod() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.quit();
  }


  @DataProvider(name="facebook")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "revathyr", "revathydfg" },
      new Object[] { "12345", "1221122" },
    };
  }
}
