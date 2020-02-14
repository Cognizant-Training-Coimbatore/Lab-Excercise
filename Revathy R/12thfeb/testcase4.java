import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testcase4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/Admin/Downloads/testcase4.html");
		WebElement op=driver.findElement(By.id("c4"));
		op.click();
		Alert alertbox=driver.switchTo().alert();
		alertbox.sendKeys("painting");
		alertbox.accept();
		String s=" finearts painting ";
		WebElement text = driver.findElement(By.id("t1"));
		String value = text.getAttribute("value");
		if(value.equals(s))
		{
			System.out.println("same");
		}

	}

}
