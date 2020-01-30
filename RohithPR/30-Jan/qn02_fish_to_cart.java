import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qn02_fish_to_cart {

	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(" https://jpetstore.cfapps.io/");
		WebElement submit = driver.findElement(By.linkText("Enter the Store"));
		submit.click();
		Thread.sleep(2000);
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		WebElement fishtype = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fishtype.click();
		Thread.sleep(2000);
		WebElement add = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		add.click();
		Thread.sleep(2000);
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
		quantity.sendKeys("10");
		Thread.sleep(4000);
		driver.quit();

	}

}
