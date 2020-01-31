
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.opencsv.CSVReader;

public class EX_3 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		CSVReader reader = new CSVReader(new FileReader("C:\\Users\\Admin\\Desktop\\java1\\data.csv"));
		 String [] csvCell;
		 
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		WebElement link = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
		link.click();
		while ((csvCell = reader.readNext()) != null) 
		 {   
			   String gender = csvCell[0];
			   String Fname = csvCell[1];
			   String Lname = csvCell[2];
			   String password = csvCell[3];
			   
			   if (gender.contains("M"))
			   {
				   WebElement link1 = driver.findElement(By.id("gender-male"));
					link1.click();
			   }
			   else if (gender.contains("F"))
			   {
				   WebElement link1 = driver.findElement(By.id("gender-female"));
					link1.click();
			   }
			   
			   WebElement textbox = driver.findElement(By.id("FirstName"));
				textbox.clear();
				textbox.sendKeys(Fname);
				
			   WebElement textbox1 = driver.findElement(By.id("LastName"));
				textbox1.clear();
				textbox1.sendKeys(Lname);
				
				 WebElement textbox3 = driver.findElement(By.id("Password"));
					textbox3.clear();
					textbox3.sendKeys(password);
				 WebElement textbox4 = driver.findElement(By.id("ConfirmPassword"));
						textbox4.clear();
						textbox4.sendKeys(password);	
				WebElement link4 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
				Thread.sleep(5000);
						link4.click();						
		 }
		driver.quit();
				
		
		System.out.println(s);

	}

}
