import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class d30_prg02_fish_links_02 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store = driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
		store.click();
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]")).sendKeys("10");
		Thread.sleep(2000);
		driver.quit();
	}

}
