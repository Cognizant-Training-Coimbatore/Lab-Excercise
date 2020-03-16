package baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class wrapperClass
{
	protected WebDriver driver;
	public ChromeOptions options;
	DesiredCapabilities capabilities;
	
	public void launchApplication(String browser, String url)
	{
		//to launch the application
		try
		{
			//to launch the Firefox browser
			if (browser.equalsIgnoreCase("firefox"))
			{
				//creating object for chrome browser
				driver= new FirefoxDriver();
			}
			//to launch the Chrome browser
			else if(browser.equalsIgnoreCase("chrome"))
			{	
				capabilities = new DesiredCapabilities();
				options = new ChromeOptions();
				//Add chrome switch to disable notification - "**--disable-notifications**"
				options.addArguments("--disable-notifications");
				options.addArguments("disable-infobars");
				options.addArguments("disable-popup-blocking");
				//options.addExtensions(new File("/Users/shahir/eclipse-workspace/Adidas_Project/extension_3_40_1_0.crx"));
				options.addArguments("load-extension = /Users/shahir/eclipse-workspace/Adidas_Project/extension_3_40_1_0.crx");
				capabilities.setCapability(ChromeOptions.CAPABILITY, options);
				options.merge(capabilities);
				//creating object for chrome browser
				driver= new ChromeDriver(options);
			}		
			//maximize the window
			driver.manage().window().maximize();
			//setting implicit wait
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//launching website
			driver.get(url);
		}		
		//catching exceptions
		catch(WebDriverException e)
		{
			System.out.println("Browser could not be launched");
		}
	}
	
	public void screenshot(String path) throws IOException
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path);
        FileUtils.copyFile(SrcFile, DestFile);
	}
	
	public void quit()
	{
		driver.quit();
	}
}