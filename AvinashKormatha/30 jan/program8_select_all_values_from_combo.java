import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program8_select_all_values_from_combo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://examples.codecharge.com/store/Default.php");
		Select product = new Select(driver.findElement(By.name("category_id")));
		int total = product.getOptions().size();
		int i;
		for( i=0;i<total;i++)
		{
			product.selectByIndex(i);
			Thread.sleep(3000);
			String s = product.getFirstSelectedOption().getText();
			System.out.println(s);
		}
		driver.quit();
	
	}

}
