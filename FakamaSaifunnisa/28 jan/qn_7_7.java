import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn_7_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("violet");
		System.out.println("before changing"+color);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the color");
		String y=sc.next();
		color.set(2,y);
		System.out.println("after changing"+color);

	}

}
