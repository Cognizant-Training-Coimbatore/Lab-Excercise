import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc1_performlogin 
{

public static void main(String[] args) throws InterruptedException
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://demowebshop.tricentis.com");
homePage home=new homePage(driver);
home.clickRegisterLink();
loginPage login=new loginPage(driver);
login.enterUsername("ella123");
login.enterPassword("ellam123");
Thread.sleep(5000);
driver.quit();
}
}

