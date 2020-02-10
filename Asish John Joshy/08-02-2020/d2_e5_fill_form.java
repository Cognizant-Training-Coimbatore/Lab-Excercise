import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class d2_e5_fill_form {
	
public static void main(String[] args)
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://examples.codecharge.com/RegistrationForm/Registration.php");
	
}
}
