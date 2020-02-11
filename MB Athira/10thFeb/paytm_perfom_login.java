import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paytm_perfom_login
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://paytm.com/");
		Thread.sleep(2000);
		WebElement click1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[2]/div[2]/div[3]/div[4]/div"));
		click1.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"app\"]/div/div[6]/div[2]/div/iframe")));
		WebElement click2 = driver.findElement(By.xpath("//*[@id=\"wallet-container-new qr-bg-white\"]/qr-code-login/div[2]/div[2]/div[3]/span"));
		click2.click();
		Thread.sleep(2000);
		WebElement user = driver.findElement(By.xpath("//*[@id=\"input_0\"]"));
		user.sendKeys("9562535762");
		WebElement pwd = driver.findElement(By.xpath("//*[@id='input_1']"));
		pwd.sendKeys("sdffsgdgh");
		WebElement click3 = driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/md-content/button/span"));
		click3.click();
		Thread.sleep(2000);
		driver.quit();
	}

}
