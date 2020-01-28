import java.util.*;
public class qn_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("violet");
		System.out.println("before changing"+color);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the index");
		int a=sc.nextInt();
		System.out.println("enter the color");
		String y=sc.next();
		color.set(a,y);
		System.out.println("after changing"+color);

	}

}
