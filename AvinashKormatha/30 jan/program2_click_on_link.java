import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program2_click_on_link {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		String s= driver.getTitle();
		System.out.println(s);
		WebElement enter1 = driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/div[1]/div/a[1]/img"));
		enter1.click();
		Thread.sleep(5000);
		WebElement enter2 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		enter2.click();
		Thread.sleep(5000);
		WebElement enter3 = driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
		enter3.click();
		Thread.sleep(5000);
		WebElement enter4 = driver.findElement(By.id("lines0.quantity"));
		enter4.sendKeys("0");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
