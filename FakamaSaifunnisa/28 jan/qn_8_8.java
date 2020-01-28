import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class qn_8_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> color=new ArrayList<String>();
		color.add("red");
		color.add("blue");
		color.add("violet");
		int a=0;
		for(String x:color) {
			String s=color.get(a);
			System.out.println("the element in "+a+" is "+s);
			a=a+1;
		}
		
		
		

	}

}
