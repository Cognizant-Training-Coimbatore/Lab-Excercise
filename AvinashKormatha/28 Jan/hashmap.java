import java.util.HashMap;
import java.util.Scanner;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String , Integer> h = new HashMap<String , Integer>();
		h.put("java" , 1);
		h.put("c" , 2);
		h.put("selenium" , 3);
		
		Scanner sc = new Scanner(System.in);
		String opt;
		System.out.println("enter the option");
		opt=sc.next();
		int c = h.get(opt);
		System.out.println(c);
	}

}
