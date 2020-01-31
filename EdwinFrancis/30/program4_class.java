import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program4_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		  WebDriver driver =new ChromeDriver();
		  driver.get("http://demowebshop.tricentis.com");
		  WebElement login=driver.findElement(By.linkText("Log in"));
		  login.click();
		  WebElement username=driver.findElement(By.id("Email"));
		  username.sendKeys("edwinfrancis");
		  WebElement submit=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
		  submit.click();
		  Thread.sleep(5000);
		  driver.quit();

	}

}
