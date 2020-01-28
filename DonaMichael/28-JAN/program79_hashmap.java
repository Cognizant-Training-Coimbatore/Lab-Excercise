import java.util.HashMap;
import java.util.Scanner;

public class program79_hashmap {

	public static void main(String[] args) {
		HashMap<Integer,String> hashmap1=new HashMap<Integer,String>();
		hashmap1.put(1, "java");
		hashmap1.put(2, "Selenium");
		hashmap1.put(3, "c#");
		hashmap1.put(3, "perl");
		hashmap1.put(4, "Cobol");
		hashmap1.put(6, "Fortran");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your option between 1 and 6");
		opt=sc.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
		hashmap1.remove(5);
		

	}

}
