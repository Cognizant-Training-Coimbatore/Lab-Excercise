package demowebdriver;

import java.util.Random;

public class regstusingdiffusername {

	public static void main(String[] args) {
String username;
Random rand=new Random();
int randomnumber=rand.nextInt(1000);
username="user"+randomnumber+"@gmail.com";
System.out.println(username);

	}

}
