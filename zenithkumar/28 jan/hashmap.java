import java.util.HashMap;
import java.util.Scanner;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> hashmap1 = new HashMap<Integer,String>();
		hashmap1.compute(1, "Java");
		hashmap1.compute(2, "c#");
		hashmap1.compute(3, "selenium");
		hashmap1.compute(4, "pubg");
		hashmap1.compute(5, "diamond");
		int opt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Emter your option between 1 to 6");
		opt = scanner.nextInt();
		String coursename = hashmap1.get(opt);
		System.out.println(coursename);

	}

}
