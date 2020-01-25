import java.util.Scanner;
class print
{
	int n;
	char c;
	void display(int n,char c)
	{
		System.out.println("integer is"+n+"char is"+c);
	}
	void display(char c,int n)
	{
		System.out.println("char is"+c+"integer is"+n);
	}
}
public class ques9_print {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		char w= sc.next().charAt(0);
		print p1=new print();
		p1.display(x,w);

	}

}
