import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class driveScript 
{

	public static void main(String[] args) throws BiffException, IOException 
	{
		int i=0,j=0;
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
		String FilePath = "D:\\Selenium Setup\\keyword.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		homepage home = new homepage(driver);
		for (int row = 0; row < totalNoOfRows; row++) 
		{
			for (int col = 0; col < totalNoOfCols; col++) 
			{
				String value = sh.getCell(1, row).getContents();
				if(value.equals("OpenApp"))
				{
					System.out.println("Application has been launched");
				}
				if(value.equals("Click Register"))
				{
					if(i == 0)
					{
					home.clickRegister();
					testcase1 tc1 = new testcase1(driver);
					tc1.runTestRegistration();
					i++;
					}
				}
				if(value.equals("Perform Login"))
				{
					if(j == 0)
					{
					home.clickLogin();
					testcase1 tc2 = new testcase1(driver);
					tc2.runTestLogin();
					j++;
					}
				}
				if(value.equals("CloseApp"))
				{
					driver.quit();
				}
		}
			System.out.println();
		}

	}

}