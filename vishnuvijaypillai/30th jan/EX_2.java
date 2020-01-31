import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement link = driver.findElement(By.linkText("Enter the Store"));
		link.click();
		String s = driver.getTitle();
		System.out.println(s);
		WebElement link1 = driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		link1.click();
		Thread.sleep(5000);
		WebElement link2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		link2.click();
		Thread.sleep(5000);
		WebElement link3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		link3.click();
		Thread.sleep(5000);
		WebElement textbox = driver.findElement(By.id("lines0.quantity"));
		textbox.clear();
		textbox.sendKeys("10");		
		Thread.sleep(5000);
		driver.quit();
		
		
		

	}

}
