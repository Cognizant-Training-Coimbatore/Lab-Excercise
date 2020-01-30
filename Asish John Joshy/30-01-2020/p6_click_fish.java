import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_click_fish {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement getin=driver.findElement(By.linkText("Enter the Store"));
		getin.click();
		String s=driver.getTitle();
		System.out.println(s);
		WebElement getfish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]/img"));
		getfish.click();
		WebElement getafish=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[1]/th[1]"));
		getafish.click();
		Thread.sleep(5000);
		WebElement getafish1=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/table/tbody/tr[2]/td[1]/a"));
		getafish1.click();
		Thread.sleep(5000);
		WebElement cart=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/table/tbody/tr[2]/td[5]/a"));
		cart.click();
		Thread.sleep(5000);
		WebElement cart1=driver.findElement(By.xpath("/html/body/div[2]/section/div[2]/div[1]/form/table/tbody/tr[2]/td[5]/input[2]"));
		cart1.clear();
		cart1.sendKeys("10");
		Thread.sleep(5000);
		driver.close();
	}

}
