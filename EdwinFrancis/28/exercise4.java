import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> colors=new ArrayList<String>();
		colors.add("Blue");
		colors.add("Yellow");
		colors.add("Red");
		colors.add("Maroon");
		colors.add("Pink");
		int index;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter index");
		index=input.nextInt();
		System.out.println(colors.get(index));
		

	}

}
