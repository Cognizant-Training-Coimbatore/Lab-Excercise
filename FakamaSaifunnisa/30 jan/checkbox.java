package demowedbdriver;

import org.openqa.selenium.By;
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
		WebElement rememberme=driver.findElement(By.name("RememberMe"));
		boolean res=rememberme.isSelected();
		if(res==true) {
			System.out.println("already selected");
		}
		else {
			System.out.println("not selected...selecting now");
			rememberme.click();
			Thread.sleep(5000);
		}
			driver.quit();
	}

}
