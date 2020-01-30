package demowedbdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore=driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
		enterthestore.click();
		String s=driver.getTitle();
		System.out.println("the title is "+s);
		driver.close();
		
		

	}

}
