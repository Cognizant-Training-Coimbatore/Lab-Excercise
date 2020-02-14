package excersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String a="revathy";
		driver.get("file:///C:/Users/Admin/Downloads/testcase1.html");
		WebElement text=driver.findElement(By.id("t1"));
		text.sendKeys(a);
		int l1=a.length();
		WebElement clickme= driver.findElement(By.id("b1"));
		clickme.click();
		WebElement text_field_element = driver.findElement(By.id("t2"));
		String value = text_field_element.getAttribute("value");
		int i=Integer.parseInt(value);
		if(i==l1)
		{
			System.out.println("equal");
		}
		//WebElement text2=driver.findElement(By.id("t2"));
		//text2.sendKeys("7");
		Thread.sleep(5000);

	}

}
