package demowedbdriver;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn4_day2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/testcase4.html");
		WebElement select=driver.findElement(By.id("c3"));
		//String s=select.getFirstSelectedOption().getText();
		select.click();
		Alert alert = driver.switchTo().alert();
		Thread.sleep(5000);	
		String value="cricket";
		alert.sendKeys(value);
        Thread.sleep(5000);
         // Accepting alert		
        alert.accept();
       String value1=driver.findElement(By.id("t1")).getAttribute("value");
       //String gem=value1;
      // gem=gem.toLowerCase();
       System.out.println(value1);
       String exp=" Sports "+value+" ";
       //exp=exp.toLowerCase();
       System.out.println(exp);
      
       
       if(value1.contentEquals(exp)) {
    	   System.out.println("passed");
    	   driver.quit();
       }
       else {
    	   JavascriptExecutor js=(JavascriptExecutor)driver;
    	   js.executeScript("alert('source and destination should not be same');");
       }
		
	}

}
