import java.util.Scanner;

class programming
{
	String str;
	programming()
	{
		str="I Love Programming Language";
		System.out.println(str);
	}
	programming(String x)
	{	
		str="I Love "+x;
		System.out.println(str);
	}
}
public class pgm8programming {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string to be passed\n");
		String y=sc.nextLine();
		programming obj=new programming();
		programming obj1=new programming(y);

	}

}
