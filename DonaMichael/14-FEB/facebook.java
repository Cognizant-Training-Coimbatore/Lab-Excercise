package testngPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class facebook {
	public WebDriver driver;
	public WebDriverWait wait;
	String appURL = "https://www.facebook.com/";

	//Locators
	private By byfname = By.xpath("//*[@name='firstname']");
	private By bylname = By.xpath("//*[@name='lastname']");
	private By byuid = By.xpath("//*[@name=\"reg_email__\"]");	
	private By bypwd = By.xpath("//*[@name=\"reg_passwd__\"]");
	private By dat=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By fmale=By.xpath("//*[@value=\"1\"]");
	private By male=By.xpath("//*[@value=\"2\"]");
	private By custom=By.xpath("//*[@value=\"-1\"]");
	
	//private By bySubmit = By.id("submit");
	private By bySubmit = By.xpath("//*[@name=\"websubmit\"]");
	
	@BeforeClass
	public void testSetup() {
		driver=new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		wait = new WebDriverWait(driver,3);

	}


	@Test(dataProvider="empLogin")
	public void VerifyInvalidLogin(String FirstName,String LastName,String	MobileNumber,String	Password,String	BirthMonth,String BirthDay,String BirthYear,String	Gender)  
throws InterruptedException {

		driver.get(appURL);
		driver.navigate().to(appURL);
		driver.findElement(byfname).sendKeys(FirstName);
		driver.findElement(bylname).sendKeys(LastName);
		driver.findElement(byuid).sendKeys(MobileNumber);
		driver.findElement(bypwd).sendKeys(Password);
		Select date=new Select(driver.findElement(dat));
		date.selectByVisibleText(BirthDay);
		Select mon=new Select(driver.findElement(month));
		mon.selectByVisibleText(BirthMonth);
		Select yr=new Select(driver.findElement(year));
		yr.selectByVisibleText(BirthYear);
		if(Gender=="Female")
		{
		driver.findElement(fmale).click();
		}
		else if(Gender=="Male")
		{
		driver.findElement(male).click();
		}
		else
		{
			driver.findElement(custom).click();
		}
		
		//wait for element to be visible and perform click
		wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
		driver.findElement(bySubmit).click();
	}

	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Downloads\\outlookdata.xls","Sheet1");

		return arrayObject;
	}

	
	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();

			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			//e.printStackTrace();
		} catch (BiffException e) {
			e.printStackTrace();
		}
		return arrayExcelData;
	}

	/*@Test
	public void tearDown() {
		driver.quit();
  }*/
}




