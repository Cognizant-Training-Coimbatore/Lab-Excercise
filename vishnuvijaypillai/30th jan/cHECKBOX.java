import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class cHECKBOX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login = driver.findElement(By.linkText("Log in"));
		login.click();
		WebElement remember = driver.findElement(By.name("RememberMe"));
		boolean res=remember.isSelected();
		if(res==true)
		{
			System.out.println("already selected");
		}
		else
		{
			System.out.println("not Selected.... slecting now");
		}
		driver.quit();
	}

}
