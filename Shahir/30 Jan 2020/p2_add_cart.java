import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p2_add_cart
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		System.out.println(driver.getTitle());
		WebElement login = driver.findElement(By.linkText("Enter the Store"));
		login.click();
		WebElement fish = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		fish.click();
		Thread.sleep(2000);
		WebElement angelfish = driver.findElement(By.linkText("FI-SW-01"));
		angelfish.click();
		Thread.sleep(2000);
		WebElement addCart = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		addCart.click();
		Thread.sleep(2000);
		WebElement username = driver.findElement(By.id("lines0.quantity"));
		username.clear();
		username.sendKeys("10");
		Thread.sleep(2000);
		driver.quit();
	}
}