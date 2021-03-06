package testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

public class dataprovider {
  WebDriver driver;
  @Test(dataProvider = "Facebook")
  public void f(String uid, String pwd) throws InterruptedException
  {
 driver.findElement(By.id("email")).sendKeys(uid);
 driver.findElement(By.id("pass")).sendKeys(pwd);
 driver.findElement(By.xpath("//*[@id=\"login_form\"]/table/tbody/tr[2]/td[3]")).click();
 Thread.sleep(5000);
 driver.navigate().to("https://facebook.com");
  }
  @BeforeClass
  public void beforeMethod() 
  {
 System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
 driver=new ChromeDriver();
 driver.manage().window().maximize();
 driver.get("https://facebook.com");
  }

  @AfterClass
  public void afterMethod() throws Exception
  {
 Thread.sleep(5000);
 driver.quit();
  }


  @DataProvider(name = "Facebook")
  public Object[][] dp()
{
    return new Object[][] {
      new Object[] { "donamich", "donamich" },
      new Object[] { "122345678", "123456" },
    };
  }
}
