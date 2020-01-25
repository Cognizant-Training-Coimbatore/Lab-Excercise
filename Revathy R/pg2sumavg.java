import java.util.Scanner;

public class pg2sumavg {

	public static void main(String[] args) {
	 int n1,n2,n3,n4,n5,s=0;
	 float a=0;
	 System.out.println("enter the value of n1");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		 System.out.println("enter the value of n2");
		 n2=sc.nextInt();
		 System.out.println("enter the value of n3");
		 n3=sc.nextInt();
		 System.out.println("enter the value of n4");
		 n4=sc.nextInt();
		 System.out.println("enter the value of n5");
		 n5=sc.nextInt();
		 sc.close();
		 s=n1+n2+n3+n4+n5;
		 a=s/5;
		 System.out.println("sum is "+ s);
		 System.out.println("average is "+ a);
	}

}
