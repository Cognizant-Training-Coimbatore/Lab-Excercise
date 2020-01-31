import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement link = driver.findElement(By.linkText("Enter the Store"));
		link.click();
		String s = driver.getTitle();
		System.out.println(s);
		driver.close();

	}

}
