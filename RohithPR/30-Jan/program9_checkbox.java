import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_checkbox {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
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
			System.out.println("Not Selected...Selecting Now");
			rememberme.click();
			Thread.sleep(5000);
		}
		driver.quit();

	}

}
