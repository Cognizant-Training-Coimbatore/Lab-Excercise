package demowedbdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn_7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement enterthestore=driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
		enterthestore.click();
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(5000);
		WebElement fsw01=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fsw01.click();
		Thread.sleep(5000);
		WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		cart.click();
		Thread.sleep(5000);
		WebElement quantity=driver.findElement(By.id("lines0.quantity"));
		quantity.clear();
		Thread.sleep(3000);
		quantity.sendKeys("10");
		Thread.sleep(5000);
		driver.close();
		
		
		
		

	}

}
