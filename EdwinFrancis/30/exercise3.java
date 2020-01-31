import java.io.DataInputStream;
import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		WebElement login=driver.findElement(By.linkText("Register"));
		login.click();
		try {
			FileInputStream fin=new FileInputStream("E:\\books.csv");
			DataInputStream dt=new DataInputStream(fin);
			String cvsSplitBy=",";
			int i=0;
			while(dt.available()!=0) {
				String[] elements=dt.readLine().split(cvsSplitBy);
				for(i=0;i<5;i++) {
					System.out.println(elements[i]);
					switch(i) {
					case (0):
					     if(elements[0].equals("M")) {
					    	 WebElement gender=driver.findElement(By.xpath("//*[@id=\"gender-male\"]"));
					    	 gender.click();
					    	 Thread.sleep(5000);
					     }
					case()
					
					}
				}
			}
			
			
		}
		
		

	}

}
