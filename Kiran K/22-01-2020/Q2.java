import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,sum;
		float avg;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter no.1");
        a=scanner.nextInt();
        System.out.println("Enter no.2");
        b=scanner.nextInt();
        System.out.println("Enter no.3");
        c=scanner.nextInt();
        System.out.println("Enter no.4");
        d=scanner.nextInt();
        System.out.println("Enter no.5");
        e=scanner.nextInt();
        sum=a+b+c+d+e;
        avg=(sum/5f);
        System.out.println("The sum is"+sum);
        System.out.println("The average is"+avg);
	}

}
