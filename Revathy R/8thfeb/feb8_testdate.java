package demoWebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb8_testdate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Revathy/table.html");
		Date d=new Date();
		SimpleDateFormat format=new SimpleDateFormat("MMM dd, yyyy");
		String exp_output=format.format(d);
		WebElement datefield=driver.findElement(By.xpath("/html/body/b"));
		String act_output=datefield.getText();
		if(exp_output.equals(act_output))
		{
			System.out.println("test is passed");
		}
		else
		{
			System.out.println("test is failed");
		}
		driver.quit();
	}

}
