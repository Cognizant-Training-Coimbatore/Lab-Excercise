import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_val {
	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Selenium_java\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product=new Select(driver.findElement(By.name("category_id")));
			//	int total=product.getOptions().size();
		product.selectByVisibleText("Databases");
		//System.out.println(total);
		Thread.sleep(5000);
		driver.quit();
	}

}
