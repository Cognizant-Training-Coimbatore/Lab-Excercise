import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exs1_Testcase2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.linkText("Enter the Store"));
		store.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement link2=driver.findElement(By.xpath("//*[@href='/catalog/categories/FISH']"));
		link2.click();
		Thread.sleep(3000);
		WebElement link3=driver.findElement(By.xpath("//*[@href='/catalog/products/FI-SW-01']"));
		link3.click();
		Thread.sleep(3000);
		WebElement link4=driver.findElement(By.linkText("Add to Cart"));
		link4.click();
		WebElement link5=driver.findElement(By.id("lines0.quantity"));
		link5.clear();
		link5.sendKeys("10");
		Thread.sleep(3000);
		driver.quit();

	}

}
