import java.util.Scanner;

public class pgmn6999 {

	public static void main(String[] args) {
	int a;
	Scanner sc=new Scanner(System.in);
	int s=0,i=0;
	float d;
	System.out.println("enter the number");
	a=sc.nextInt();
	while(a!=-999)
	{
		s=s+a;
		i=i+1;
		a=sc.nextInt();
		
	}
	d=s/i;
	System.out.println("sum is "+s);
	System.out.println("average is "+d);

	}

}
