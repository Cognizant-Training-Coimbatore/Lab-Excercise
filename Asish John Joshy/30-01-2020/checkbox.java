import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Log in"));
		login.click();
		Thread.sleep(3000);
		WebElement rme=driver.findElement(By.id("RememberMe"));//name and id are same. Can use By.name("RememberMe") also
		boolean res=rme.isSelected();
		if(res==true)
		{
			System.out.println("Already selected!");
		}
		else
		{
			System.out.println("Not selected......Selecting now");
			rme.click();
			Thread.sleep(5000);
		}
		driver.quit();
	}

}
