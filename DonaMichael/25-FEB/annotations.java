import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class annotations {
	@Before
	public void gotHomePage()
	{
		System.out.println("Go to Home Page");
	}
	@After
	public void logOut()
	{
		System.out.println("test ended");
	}
	@BeforeClass
	public static void startTest() {
		System.out.println("started test");
	}

	@Test
	public void testA() {
		
		System.out.println("TestA is running");
	}
	@Test
	public void testB() {
		System.out.println("TestB is running");
	}
	@AfterClass
	public static void endTest() {
		System.out.println("Test ended");
	}

}
