import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class runTest {

	public static void main(String[] args) throws BiffException, IOException {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com/");
		String FilePath = "D:\\Selenium Setup\\testdata.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Sheet1");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) 
		{
			driver.findElement(By.linkText("Register")).click();
			for (int col = 0; col < totalNoOfCols; col++)
			{
				
					String value=(sh.getCell(col,row).getContents());
					if(col==0)
					{
						driver.findElement(By.name("FirstName")).sendKeys(value);
					}
					if(col==1)
					{
						driver.findElement(By.name("LastName")).sendKeys(value);
					}
					if(col==2)
					{
						driver.findElement(By.name("Email")).sendKeys(value);
					}
					if(col==3)
					{
						driver.findElement(By.name("Password")).sendKeys(value);
					}
		    }
		System.out.println();
		}


	}

}
