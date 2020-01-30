package demowedbdriver;

import java.util.Random;

public class register_new_name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String username;
		Random rand=new Random();
		int randomnumber=rand.nextInt(1000);
		username="user"+randomnumber+"gmail.com";
		System.out.println(username);
		
		

	}

}
