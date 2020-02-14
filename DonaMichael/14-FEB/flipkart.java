package testngPackage;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class flipkart {
	WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String num, String pwd) throws InterruptedException 
  {
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys(num);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[2]/input")).sendKeys(pwd);
	  driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
	  driver.findElement(By.linkText("Women")).click();
	  //Thread.sleep(5000);
	  //driver.navigate().to("https://facebook.com");
  }

 
  @BeforeClass
  public void beforeClass() {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.flipkart.com");
  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(5000);
	  //driver.quit();
  }
  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "123456789", "XXXXXXXXX" },
      //new Object[] { 2, "b" },
    };
  }

}
