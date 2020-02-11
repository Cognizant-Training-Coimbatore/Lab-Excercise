package excersice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro13_main {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		homePage home=new homePage(driver);
		loginPage login=new loginPage(driver);
		home.clickRegisterLink();
		registrationPage reg=new registrationPage(driver);
		reg.selectgender(1);
		reg.Firstname("revathy");
		reg.Lastname("R");
		reg.Email("rev1123@gmail.com");
		reg.Password("rev123");
		reg.ConfirmPassword("rev123");
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
