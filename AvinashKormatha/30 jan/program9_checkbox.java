import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program9_checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement rem = driver.findElement(By.name("RememberMe"));
		boolean res= rem.isSelected();
		if(res==true) 
		{
			System.out.println("already selected");
		}
		else
		{
			System.out.println("not selected selecting now");
			rem.click();
			Thread.sleep(3000);
		}
		driver.quit();
	}

}
