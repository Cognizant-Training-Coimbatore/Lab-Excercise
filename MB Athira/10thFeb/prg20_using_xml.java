import java.io.File;
import java.net.MalformedURLException;

import org.dom4j.Document;

import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prg20_using_xml {

	public static void main(String[] args) throws MalformedURLException, DocumentException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		File inputFile = new File("C:\\Users\\Admin\\Desktop\\Batch_1 Programs\\DemoWebdriver1\\src\\myobj.xml");
		   SAXReader saxReader = new SAXReader();
		   Document document = saxReader.read(inputFile);
		   String login = document.selectSingleNode("//demowebshop/login").getText();
		   String username = document.selectSingleNode("//demowebshop/username").getText();
		   String password = document.selectSingleNode("//demowebshop/password").getText();
		   driver.findElement(By.linkText(login)).click();
		   driver.findElement(By.name(username)).sendKeys("sample username1");
		   driver.findElement(By.name(password)).sendKeys("pass123#");
		   driver.close();

		
	}

}
