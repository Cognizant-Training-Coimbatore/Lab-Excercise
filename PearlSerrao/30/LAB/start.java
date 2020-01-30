import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
//import org.junit.Test;

public class start {
 // @Test
  public void testGoogleSearch() throws InterruptedException {
    // Optional. If not specified, WebDriver searches the PATH for chromedriver.
    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

    WebDriver driver = new ChromeDriver();
    driver.get("http://www.google.com/");
    ChromeOptions chromeOptions = new ChromeOptions();
    chromeOptions.addArguments("port=8080");      
    Thread.sleep(5000);  // Let the user actually see something!
    WebElement searchBox = driver.findElement(By.name("q"));
    searchBox.sendKeys("ChromeDriver");
    searchBox.submit();
    Thread.sleep(5000);  // Let the user actually see something!
    driver.quit();
  }
}