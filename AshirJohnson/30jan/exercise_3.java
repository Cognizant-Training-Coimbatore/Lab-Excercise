package demoWebDriver;

import java.io.DataInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;

public class exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com//");
		WebElement login=driver.findElement(By.linkText("Register"));
		login.click();
		try
		{
			
			FileInputStream fin= new FileInputStream("E:\\books.csv");
			DataInputStream dt= new DataInputStream(fin);
			String cvsSplitBy=",";
			int i=0;
			while(dt.available()!=0)
			{
				String b=dt.readLine();
				String[] elements = b.split(cvsSplitBy);
				for(i=0;i<5;i++)
				{
				switch(i)
				{
				case 0:
					if(elements[0].equals("M"))
					{
					WebElement gender=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[1]/label"));
					gender.click();
					Thread.sleep(3000);
					}
					else
					{
						WebElement gender=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/form/div/div[2]/div[2]/div[2]/div[1]/div[2]/label"));
						gender.click();
						Thread.sleep(3000);
					}
					break;
				case 1:
					WebElement first=driver.findElement(By.id("FirstName"));
					first.sendKeys(elements[1]);
					break;
				case 2:
					WebElement last=driver.findElement(By.id("LastName"));
					last.sendKeys(elements[2]);
					break;
				case 3:
					WebElement pass=driver.findElement(By.id("Password"));
					pass.sendKeys(elements[3]);
					break;
				case 4:
					WebElement pass1=driver.findElement(By.id("ConfirmPassword"));
					pass1.sendKeys(elements[4]);
					
					break;
					
				}
				
				}
				
			}
			dt.close();
			
		}
		catch(Exception e)
		{
			System.err.println("file error");
		}
		driver.quit();
	}

}
