package log4j;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Gmail {
	WebDriver driver;
	Logger log;
  @Test
  public void f() throws InterruptedException {
	  Thread.sleep(5000);
	  log.info("Browser waited 5 Seconds");
	  driver.findElement(By.id("identifierId")).sendKeys("test123");
	  log.info("User Name Printed");
	  driver.findElement(By.id("identifierNext")).click();
	  log.info("Username Next Pressed");
	  Thread.sleep(5000);
	  log.info("Browser waited 5 Seconds after pressed Username Next Button");
	  driver.findElement(By.name("password")).sendKeys("test123");
	  log.info("Password Printed");
	  driver.findElement(By.id("PasswoordNext")).click();
	  log.info("Password Next Pressed");
	  Thread.sleep(5000);
	  log.info("Browser waited 5 Seconds after pressed Password Next Button");
  }
  @BeforeClass
  public void beforeClass() {
	  log=Logger.getLogger(Gmail.class.getName());
	  DOMConfigurator.configure("C:\\Users\\Admin\\eclipse-workspace\\Selenium_Examples\\src\\log4j\\Log_Propoerty.xml");
	  driver=new ChromeDriver();
	  log.info("Browser Launched");
	  driver.manage().window().maximize();	  
	  log.info("Browser Maximized");
	  driver.get("https://accounts.google.com/signin/v2/identifier");
	  log.info("URL Launched");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  log.info("Browser Quitted");
  }

}
