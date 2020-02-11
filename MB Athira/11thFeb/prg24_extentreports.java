import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class prg24_extentreports {

	public static void main(String[] args) {
		ExtentReports extent;
		ExtentTest logger;
		extent = new ExtentReports("D:/testResults.html",true);
		logger = extent.startTest("test1");
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("http://demowebshop.tricentis.com");
		String s = driver.getTitle();
		if(s.equals("Demo Web Shop"))
		{
			logger.log(LogStatus.PASS, "Test is pass");
		}
		else
		{
			logger.log(LogStatus.FAIL, "Test failed");
		}
		driver.quit();
		
		extent.flush();
		extent.endTest(logger);
		extent.close();
	}

}
