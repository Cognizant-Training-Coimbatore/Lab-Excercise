import java.util.HashMap;
import java.util.Scanner;

public class program66_hashmap {

	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();
		hashmap1.put(1, "Java");
		hashmap1.put(2, "c#");
		hashmap1.put(3, "Selinium");
		hashmap1.put(4, "Perl");
		hashmap1.put(5, "Cobol");
		hashmap1.put(6, "Fortan");
		int opt;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your option between 1 to 6");
		opt = scanner.nextInt();
		String coursename = hashmap1.get(opt);
		System.out.println(coursename);

	}

}
