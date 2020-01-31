package demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class prog2_exercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chromedriver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get(" https://jpetstore.cfapps.io/");
		WebElement login=driver.findElement(By.linkText("Enter the Store"));
		login.click();
		String x;
		x=driver.getTitle();
		System.out.println(x);
Thread.sleep(3000);
WebElement choose=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
choose.click();
Thread.sleep(3000);
WebElement tick=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/table/tbody/tr[2]/td[1]/a"));
tick.click();
Thread.sleep(3000);
WebElement selected=driver.findElement(By.linkText("Add to Cart"));
selected.click();
Thread.sleep(3000);
WebElement chosen=driver.findElement(By.id("lines0.quantity"));
chosen.clear();
chosen.sendKeys("10");
Thread.sleep(3000);

driver.quit();
		
		

	}

}
