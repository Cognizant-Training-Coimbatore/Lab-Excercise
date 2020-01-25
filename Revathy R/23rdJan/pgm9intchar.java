import java.util.Scanner;

class intchar
{	
	int n1;
	char c1;
	intchar(int n,char c)
	{
		n1=n;
		c1=c;
		System.out.println("integer "+n1);
		System.out.println("character "+c1);
	}
	intchar(char c,int n)
	{
		n1=n;
		c1=c;
		System.out.println("character "+c);
		System.out.println("integer "+n);
	}
	
}
public class pgm9intchar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int i=sc.nextInt();
		System.out.println("enter the character");
		char ch=sc.next().charAt(0);
		intchar obj=new intchar(i,ch);
		intchar obj1=new intchar(ch,i);
		
	}

}
