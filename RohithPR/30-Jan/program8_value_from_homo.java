import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program8_value_from_homo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product = new Select(driver.findElement(By.className("catagory_id")));
		int size = product.getOptions().size();
		int i ;
		for(i=0;i<size;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(5000);
			String s = product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		

	}

}
