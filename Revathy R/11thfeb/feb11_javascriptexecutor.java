package demoWebDriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class feb11_javascriptexecutor {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		js.executeScript("alert('hello world')");
	}

}
