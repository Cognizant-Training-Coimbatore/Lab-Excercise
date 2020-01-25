import java.util.Scanner;

public class add_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,sum,avg;
		Scanner sc= new Scanner(System.in);
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		d= sc.nextInt();
		e= sc.nextInt();
		sum=(a+b+c+d+e);
		avg= sum/5;
		System.out.println(sum+" "+avg);
	}

}
