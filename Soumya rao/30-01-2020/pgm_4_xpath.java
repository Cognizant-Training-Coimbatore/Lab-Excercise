package demoWebdriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class pgm_4_xpath {



	public static void main(String[] args) throws InterruptedException {
	
		
		

			
				System.setProperty("webdriver.chrome.driver","chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.get("http://demowebshop.tricentis.com");
				WebElement login =driver.findElement(By.linkText("Log in"));
				login.click();
				WebElement submit =driver.findElement(By.xpath(""));
				submit.click();
				Thread.sleep(5000);
				driver.quit(); 

			}

		}



