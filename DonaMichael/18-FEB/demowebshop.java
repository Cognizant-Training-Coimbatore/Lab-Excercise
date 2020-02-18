package log4j;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;



public class demowebshop
{
public WebDriver driver;
public WebDriverWait wait;
String appURL1 = "http://demowebshop.tricentis.com";

//Locators

//Login
private By byem = By.id("Email");
private By bypwd = By.id("Password");
private By bycoun = By.id("BillingNewAddress_CountryId");
private By bystat = By.id("BillingNewAddress_StateProvinceId");
private By bycity = By.id("BillingNewAddress_City");
private By byadd = By.id("BillingNewAddress_Address1");
private By byzip = By.id("BillingNewAddress_ZipPostalCode");
private By byphn = By.id("BillingNewAddress_PhoneNumber");


//private By bySubmit = By.id("submit");
private By bySubmit = By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input");

@BeforeClass
public void testSetup()
{
driver=new ChromeDriver();
driver.get(appURL1);
driver.manage().window().maximize();
wait = new WebDriverWait(driver,3);
driver.findElement(By.linkText("Log in")).click();
}
@AfterClass
public void afterMethod() throws Exception
{
Thread.sleep(5000);
driver.quit();
}


@Test(dataProvider="demoLogin")
public void VerifyLogin(String Email,String Password, String Country, String State, String City, String Zip, String Address, String PhoneNumber)  
throws InterruptedException {

//driver.get(appURL1);
driver.navigate().to(appURL1);
Thread.sleep(1000);
driver.findElement(By.linkText("Log in")).click();
Thread.sleep(1000);
System.out.println(Email);
System.out.println(Password);
driver.findElement(byem).sendKeys(Email);
driver.findElement(bypwd).sendKeys(Password);


//wait for element to be visible and perform click
wait.until(ExpectedConditions.visibilityOfElementLocated(bySubmit));
driver.findElement(bySubmit).click();

//itemPurchase
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")).click();
driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();
driver.findElement(By.id("termsofservice")).click();
driver.findElement(By.id("checkout")).click();

//BillingAddress
//Select Country1 = new Select(driver.findElement(bycoun));
//Country1.selectByVisibleText(Country);
//Select State1 = new Select(driver.findElement(bystat));
//State1.selectByVisibleText(State);

/*driver.findElement(bycity).sendKeys(City);
driver.findElement(byzip).sendKeys(Zip);
driver.findElement(byadd).sendKeys(Address);
driver.findElement(byphn).sendKeys(PhoneNumber);

driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();*/

//logout
driver.findElement(By.linkText("Log out")).click();

}


@DataProvider(name="demoLogin")
public Object[][] logindemoData()
{
Object[][] arrayObject = getExcelData("C:\\Users\\Admin\\Desktop\\Batch1 programs\\testngDemo\\src\\log4j\\demo.xls","Sheet1");

return arrayObject;
}


public String[][] getExcelData(String fileName, String sheetName)
{
String[][] arrayExcelData = null;
try
{
FileInputStream fs = new FileInputStream(fileName);
Workbook wb1 = Workbook.getWorkbook(fs);
Sheet sh = wb1.getSheet(sheetName);

int totalNoOfCols = sh.getColumns();
int totalNoOfRows = sh.getRows();

arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];

for (int i= 1 ; i < totalNoOfRows; i++)
{

for (int j=0; j < totalNoOfCols; j++)
{
arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
}

}
}
catch (FileNotFoundException e)
{
e.printStackTrace();
}
catch (IOException e)
{
e.printStackTrace();
//e.printStackTrace();
}
catch (BiffException e)
{
e.printStackTrace();
}
return arrayExcelData;
}
}