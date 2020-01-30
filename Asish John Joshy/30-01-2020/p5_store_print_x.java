import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5_store_print_x {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement getin=driver.findElement(By.linkText("Enter the Store"));
		getin.click();
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		driver.close();
	}

}
