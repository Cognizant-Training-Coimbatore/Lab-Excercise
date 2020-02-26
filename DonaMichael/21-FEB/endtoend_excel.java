import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class endtoend_excel {

	public static void main(String[] args) throws BiffException, IOException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String FilePath = "D:\\Selenium Setup\\enstoend_excel.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 1; row < totalNoOfRows; row++) 
		{
			driver.findElement(By.linkText("Log in")).click();
			for (int col = 0; col < totalNoOfCols; col++)
			{
				
					String value=(sh.getCell(col,row).getContents());
					if(col==0)
					{
						driver.findElement(By.id("Email")).sendKeys(value);
					}
					if(col==1)
					{
						driver.findElement(By.name("Password")).sendKeys(value);
						driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();;
					}
					
					if(col==2)
					{
						driver.findElement(By.linkText(value)).click();
						
					}
					if(col==3)
					{
						driver.findElement(By.linkText(value)).click();
		            }
					if(col==4) 
					{
						driver.findElement(By.id("addtocart_36_EnteredQuantity")).clear();
						driver.findElement(By.id("addtocart_36_EnteredQuantity")).sendKeys(value);
						driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]")).click();
						driver.findElement(By.id("termsofservice")).click();
						driver.findElement(By.id("checkout")).click();
					}
					
			}
		System.out.println();
		}

	}

}
