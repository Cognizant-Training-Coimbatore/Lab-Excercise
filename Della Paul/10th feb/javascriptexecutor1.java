import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascriptexecutor1 {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("alert('hello world')");
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);

	}

}
