import java.util.*;
class Programming{
	String x;
	Programming(String x)
	{
		char str[] = x.toCharArray();
		if(str.length==0) {
			System.out.println("i love programming language");
			
		}
		else {
			System.out.println("i love "+x);
		}
		
	}
	
}
public class question8_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter the word");
		Scanner sc=new Scanner(System.in);
		String y=sc.nextLine();
		Programming p1=new Programming(y);
		
	}

}
