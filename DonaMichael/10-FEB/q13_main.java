import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class q13_main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		q13_homepage home=new q13_homepage(driver);
		q13_loginpage login=new q13_loginpage(driver);
		home.clickRegisterLink();
		q13_registration_page  reg=new q13_registration_page (driver);
		reg.selectGender(1);
		reg.FirstName("Dona");
		reg.lastName("Michael");
		reg.Email("asd1234!@gmail.com");
		reg.Password("pas123$");
		reg.confirmPassword("pas123$");
		String em=reg.getvalues();
		String ps=reg.getPass();
		reg.clickRegister();
		Thread.sleep(3000);
		reg.logout();
		Thread.sleep(3000);
		reg.login();
		Thread.sleep(2000);
		login.enterUsername(em);
		login.enterPassword(ps);
		login.log();
		Thread.sleep(5000);
		driver.quit();


	}

}
