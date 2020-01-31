import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class e5_check_property {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement rememberme = driver.findElement(By.name("RememberMe"));
		boolean res = rememberme.isSelected();
		if(res == true)
		{
			System.out.println("Already Selected");
		}
		else
		{
			System.out.println("Not Selected....Selecting Now");
			rememberme.click();
			Thread.sleep(5000);
		}
		driver.quit();
	}

}
