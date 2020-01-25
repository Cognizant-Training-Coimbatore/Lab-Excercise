import java.util.Scanner;
class programming
{
	String x;
	programming(String x)
	{
		char str[]=x.toCharArray();
		if(str.length==0)
		{
			System.out.println("I love programming language");
		}
		else
		{
			System.out.println("I love"+x);
		}
	}
	
	
}
public class ques8_programming {

	public static void main(String[] args) {
		System.out.println("enter the language");
		Scanner sc=new Scanner(System.in);
		  String y=sc.nextLine();
		  programming p1= new programming(y);
		
		
	}

}
