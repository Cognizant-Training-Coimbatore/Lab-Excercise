import org.testng.annotations.Test;

public class fruits {
  @Test(priority=1)
  public void banana() {
	  System.out.println("Test banana is running..");
  }
  @Test(priority=2)
  public void apple() {
	  System.out.println("Test apple is running..");
  }
}
