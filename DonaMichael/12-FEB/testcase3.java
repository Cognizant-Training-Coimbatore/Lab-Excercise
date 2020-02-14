import java.util.Scanner;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testcase3 {

	public static void main(String[] args) throws InterruptedException {
		int i=0,j=0;
		System.out.println("enter the two indexes between 0 and 10");
		Scanner sc=new Scanner(System.in);
		i=sc.nextInt();
		j=sc.nextInt();
		Thread.sleep(4000);
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.get("file:///C:/Users/Admin/Downloads/testcase3.html");
		Select drop=new Select(driver.findElement(By.id("country1")));
		drop.selectByIndex(i);
		Select drop1=new Select(driver.findElement(By.id("country2")));
		drop1.selectByIndex(j);
		String s1=drop.getFirstSelectedOption().getText();
		String s2=drop1.getFirstSelectedOption().getText();
		if(s1.equals(s2))
		{
			js.executeScript("alert('cant select same source and destination')");
			Thread.sleep(2000);
			Alert alertbox=driver.switchTo().alert();
			alertbox.accept();
			Thread.sleep(3000);
			//Select drop2=new Select(driver.findElement(By.id("country2")));
			//9drop2.selectByIndex(1);
			
		}
		
		Thread.sleep(3000);
		driver.quit();

	}

}
