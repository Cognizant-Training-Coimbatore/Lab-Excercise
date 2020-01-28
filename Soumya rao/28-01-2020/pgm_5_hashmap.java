import java.util.Scanner;
import java.util.HashMap;
public class pgm_5_hashmap {

	public static void main(String[] args) {
HashMap<Integer, String> hashmap1 =new HashMap<Integer,String>();
	hashmap1.put(1,"java");
	hashmap1.put(2,"python");
	hashmap1.put(3,"sql");
	hashmap1.put(4,"perl");
	hashmap1.put(5,"html");
	hashmap1.put(6,"javascript");
	int opt;
	Scanner sc=new Scanner (System.in);
	System.out.println("enter youtr option between 1 and 6");
opt=sc.nextInt();
String coursename=hashmap1.get(opt);
System.out.println(coursename);
		
	}

}
