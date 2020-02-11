import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class prg23_internetexplorer {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("http://demowebshop.tricentis.com");
		
		String s = driver.getTitle();
		System.out.println(s);
		driver.quit();
	}

}
