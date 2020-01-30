import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demowebshop.tricentis.com");
	WebElement login= driver.findElement(By.linkText("Login"));
	login.click();
	WebElement rem= driver.findElement(By.name("Remember Me"));
	boolean res=rem.isSelected();
	if(res==true) {
		System.out.println("already selected");
	}else {
		System.out.println("not selected");
		rem.click();
		Thread.sleep(5000);
	}
	driver.quit();
}
}