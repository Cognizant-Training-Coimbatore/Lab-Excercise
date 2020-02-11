


import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ques_12_verify_system_date 
{

	
			public static void main(String[] args) {
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("file:///D:/Della/table2.html");
				Date d=new Date();
				SimpleDateFormat format= new SimpleDateFormat("MM,dd,YYYY");
				String exp_output=format.format(d);
				WebElement datefield=driver.findElement(By.xpath("/html/body/b"));
				String act_output=datefield.getText();
				if(exp_output.equals(act_output))
				{
					System.out.println("Test is pass");
				}
				else
				{
					System.out.println("Test is failed");
				}
				driver.quit();
				

			}

		

	}


