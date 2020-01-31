import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class excercise2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jpetstore.cfapps.io/");
		WebElement store=driver.findElement(By.xpath("//*[@id=\"Content\"]/p[1]/a"));
		store.click();
		  Thread.sleep(5000);
		String title=driver.getTitle();
		System.out.println(title);
		WebElement fish=driver.findElement(By.xpath("//*[@id=\"SidebarContent\"]/a[1]"));
		fish.click();
		  Thread.sleep(5000);
		WebElement fishid=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[1]/a"));
		fishid.click();
		  Thread.sleep(5000);
	    WebElement cart=driver.findElement(By.xpath("//*[@id=\"Catalog\"]/table/tbody/tr[2]/td[5]/a"));
	    cart.click();
	    Thread.sleep(5000);
	    WebElement quantity=driver.findElement(By.xpath("//*[@id=\"lines0.quantity\"]"));
	    quantity.clear();
	    quantity.sendKeys("10");
	    
	    Thread.sleep(5000);
	    driver.close();
		
	}

	

}
