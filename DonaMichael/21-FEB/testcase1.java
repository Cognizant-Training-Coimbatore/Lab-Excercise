import org.openqa.selenium.WebDriver;

public class testcase1 
{
	WebDriver driver;
	testcase1(WebDriver driver)
	{
		this.driver = driver;
	}
	void runTestLogin()
	{
		homepage home = new homepage(driver);
		home.clickLogin();
		loginpage login = new loginpage(driver);
		login.enterUsername("venkat");
		login.enterPassword("raja123$");
	}
	void runTestRegistration()
	{
		homepage home = new homepage(driver);
		home.clickRegister();
		registrationpage register = new registrationpage(driver);
		register.enterFirstName("firstname1");
		register.enterLastName("lastname1");
	}
}