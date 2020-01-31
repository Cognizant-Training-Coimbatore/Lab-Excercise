import java.util.Random;

public class register_login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		int x= rand.nextInt();
		String randomn= "user" + x + "@gmail.com";
		System.out.println(randomn);

	}

}
