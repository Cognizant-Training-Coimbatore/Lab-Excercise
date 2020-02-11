import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm_login {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://paytm.com/");
		 WebElement login=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div"));
		 login.click();
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/div[2]/div/iframe")));
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span"));
		signin.click();
		Thread.sleep(2000);
		WebElement click1=driver.findElement(By.xpath("//*[@id=\"input_0\"]"));
		click1.sendKeys("9876543291");
		WebElement click2=driver.findElement(By.xpath("//*[@id=\"input_1\"]"));
		click2.sendKeys("della123@");
		 driver.quit();
	}

}
