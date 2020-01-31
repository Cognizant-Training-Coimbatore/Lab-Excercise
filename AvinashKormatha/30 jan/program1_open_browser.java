import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class program1_open_browser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jpetstore.cfapps.io/");
		WebElement enter = driver.findElement(By.linkText("Enter the Store"));
		enter.click();
		String s= driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
