package demowedbdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javascript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdiver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executescript("alert('hello world');");
		String title=js.executeScript("return document.title;").toString();
		System.out.println(title);
		String url=js.executeScript("return document.URL;").toString();
		System.out.println(url);
		
		

	}

}
