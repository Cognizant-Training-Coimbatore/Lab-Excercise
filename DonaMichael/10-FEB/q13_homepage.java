import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class q13_homepage {

	
		WebDriver driver;
		WebElement registerLink;
		q13_homepage(WebDriver driver)
		{
			this.driver=driver;
			
		}
		void clickRegisterLink()
		{
		registerLink=driver.findElement(By.linkText("Register"));
		
		registerLink.click();
		}

	}


