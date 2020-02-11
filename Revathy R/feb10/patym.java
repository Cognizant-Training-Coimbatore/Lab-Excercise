package excersice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class patym {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		Thread.sleep(5000);  
		WebElement login= driver.findElement(By.xpath("//*[@data-reactid='40']"));
		login.click();
		Thread.sleep(3000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'login')]")));
		WebElement login1=driver.findElement(By.xpath("//*[@event-action='login_signup_with_mobile_pwd_clicked']"));
		login1.click();
		Thread.sleep(3000);
		WebElement user=driver.findElement(By.id("input_0"));
		user.sendKeys("8281317141");
		WebElement pass=driver.findElement(By.id("input_1"));
		pass.sendKeys("123456");
		
		//WebElement log= driver.findElement(By.xpath("//*[@type='submit']"));
		//log.click();
		Thread.sleep(3000);
		driver.close();
	}

}
