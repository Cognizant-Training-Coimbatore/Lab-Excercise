package demoWebDriver;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectloop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
		
		
		int total=product.getOptions().size();
		int i;
		for(i=0;i<total;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(5000);
			String s=product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		driver.quit();
	}

}
