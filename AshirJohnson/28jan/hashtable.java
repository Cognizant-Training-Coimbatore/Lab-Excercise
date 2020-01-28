package helloworld;
import java.util.Hashtable;
import java.util.Scanner;

public class hashtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> hashmap1=new Hashtable<Integer,String>();
		hashmap1.put(1, "Java");
		hashmap1.put(2, "C#");
		hashmap1.put(3, "Selenium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(6, "Fortran");
		int opt;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter option b/w 1 and 6");
		opt=sc.nextInt();
		String coursename=hashmap1.get(opt);
		System.out.println(coursename);
	}

}