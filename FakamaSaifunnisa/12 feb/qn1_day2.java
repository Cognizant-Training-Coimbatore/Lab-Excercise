package demowedbdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn1_day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("wedriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/testcase1.html");
		String a="saifu";
		driver.findElement(By.id("t1")).sendKeys(a);
		driver.findElement(By.id("b1")).click();
		int l1=a.length();
		WebElement text_field = driver.findElement(By.id("t2"));
		String value=text_field.getAttribute("value");
		int i=Integer.parseInt(value);
		if(i==l1) {
				System.out.println("equal");
		}
		Thread.sleep(5000);
		driver.quit();
		
		
		
		

	}

}
