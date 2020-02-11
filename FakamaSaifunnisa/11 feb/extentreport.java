package demowedbdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class extentreport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			ExtentReports extent;
			ExtentTest logger;
			extent=new ExtentReports("E:/testresult.html",true);
			logger=extent.startTest("test1");
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demowebshop.tricentis.com");
			String s=driver.getTitle();
			if(s.equals("Demo Web Shop"))
			{
				logger.log(LogStatus.PASS,"Test is pass");
			}
			else {
				logger.log(LogStatus.FAIL, "Test is fail");
			}
			driver.quit();
			extent.flush();
			extent.endTest(logger);
			extent.close();
			
			
	}

}
