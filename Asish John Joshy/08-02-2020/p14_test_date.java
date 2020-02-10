import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p14_test_date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/Asish/table.html");
		Date d=new Date();
		DateFormat format=new SimpleDateFormat("MMM dd, yyyy");
		String exp_out=format.format(d);
		WebElement datefield=driver.findElement(By.xpath("/html/body/b"));
		String act_out=datefield.getText();
		if(exp_out.equals(act_out))
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is failed");
		}
		driver.quit();
	}

}
