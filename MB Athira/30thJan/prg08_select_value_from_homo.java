import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class prg08_select_value_from_homo {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/Store/Default.php");
		Select product = new Select(driver.findElement(By.name("category_1")));
		int size = product.getOptions().size();
		for (int j = 0; j <size; j++) 
		{
			product.selectByIndex(j);
			Thread.sleep(5000);
			String s = product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
	}

}
