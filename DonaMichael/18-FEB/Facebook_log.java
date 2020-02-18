package log4j;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class Facebook_log {
	public WebDriver driver;
	String url="https://facebook.com";
	Logger log;
	
	//locators
	private By fname=By.xpath("//*[@name='firstname']");
	private By lname=By.xpath("//*[@name='lastname']");
	private By mobile=By.xpath("//*[@name='reg_email__']");
	private By pwd=By.xpath("//*[@name='reg_passwd__']");
	private By day=By.id("day");
	private By month=By.id("month");
	private By year=By.id("year");
	private By male=By.xpath("//*[@value='2']");
	private By fmale=By.xpath("//*[@value='1']");
	private By custom=By.xpath("//*[@value='-1']");
	
	//Submit Button
	private By submit=By.xpath("//*[@id=\"u_0_13\"]");
  @Test(dataProvider = "FB_Login")
  public void f(String FirstName,String LastName,String MobileNumber,String Passwd,String BirthMonth,String BirthDay,String BirthYear,String Gender
) throws InterruptedException {
	  driver.findElement(fname).sendKeys(FirstName);
	  log.info("First Name Filled");
	  driver.findElement(lname).sendKeys(LastName);
	  log.info("Last Name Filled");
	  driver.findElement(mobile).sendKeys(MobileNumber);
	  log.info("Mobile Number Filled");
	  driver.findElement(pwd).sendKeys(Passwd);
	  log.info("Password Filled");
	  Select dy=new Select(driver.findElement(day));
	  dy.selectByVisibleText(BirthDay);
	  log.info("Birth Day Filled");
	  Select mnt=new Select(driver.findElement(month));
	  mnt.selectByVisibleText(BirthMonth);
	  log.info("Birth Month Filled");
	  Select yer=new Select(driver.findElement(year));
	  yer.selectByVisibleText(BirthYear);
	  log.info("Birth Year Filled");
	  if(Gender.equals("Male"))
	  {
		  driver.findElement(male).click();
		  log.info("Gender Male Selected");
	  }
	  else if(Gender.equals("Female"))
	  {
		  driver.findElement(fmale).click();
		  log.info("Gender Female Selected");
	  }
	  else
	  {
		  driver.findElement(custom).click();
		  log.info("Gender Custom Selected");
	  }
	  Thread.sleep(5000);
	  log.info("Browser waited 5 seconds");
	  driver.navigate().to(url);
	  log.info("Browser Navigated to the URL");
  }

  @DataProvider(name = "FB_Login")
  public Object[][] dp() throws Exception, IOException {
	  Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Documents\\Datasheet1.xls","FB_Login");

		return arrayObject;
  }
  private String[][] getExcelData(String Filename, String Sheetname) throws BiffException, IOException {
	// TODO Auto-generated method stub
	  String[][] arrayExcelData = null;
	  try {
		  FileInputStream file=new FileInputStream(Filename);
		  Workbook wb=Workbook.getWorkbook(file);
		  Sheet sh=wb.getSheet(Sheetname);
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

@BeforeClass
  public void beforeClass() {
	log=Logger.getLogger(Facebook_log.class.getName());
	DOMConfigurator.configure("C:\\Users\\Admin\\Desktop\\Batch1 programs\\testngDemo\\src\\log4j\\log_fb.xml");
	  driver=new ChromeDriver();
	  log.info("Browser Launched");
	  driver.manage().window().maximize();
	  log.info("Browser Maximized");
	  driver.get(url);
	  log.info("URL Opened");
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  log.info("Browser Quitted");
  }

}
