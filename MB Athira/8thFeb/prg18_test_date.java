import java.util.Date;
import java.text.SimpleDateFormat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg18_test_date {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/MBAthira/javascript/webdriverexp1.html");
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("MMM dd, yyyy");
		String exp_output = format.format(d);
		WebElement datefield = driver.findElement(By.xpath("/html/body/b"));
		String act_output = datefield.getText();
		if(exp_output.equals(act_output))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("FAIL");
		}
		driver.quit();
	}

}
