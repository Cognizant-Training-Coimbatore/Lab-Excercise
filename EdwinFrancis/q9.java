import java.util.Scanner;

class numchar{
	void okay(int n,char c) {
		System.out.println(n);
	}
	void okay(char c,int n) {
		System.out.println(c);
	}

}
public class q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter integer and character");
		int n;
		char c;
		numchar obj=new numchar();
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		c=input.next(".").charAt(0);
		obj.okay(n, c);
		obj.okay(c, n);

	}

}
