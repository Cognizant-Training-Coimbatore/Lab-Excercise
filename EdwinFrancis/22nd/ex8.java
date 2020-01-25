import java.util.Scanner;

public class ex8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		int count=0;
		System.out.println("Enter 5 numbers");
		Scanner input=new Scanner(System.in);
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		d=input.nextInt();
		e=input.nextInt();
		if(a%2!=0)
			count++;
		if(b%2!=0)
			count++;
		if(c%2!=0)
			count++;
		if(d%2!=0)
			count++;
		if(e%2!=0)
			count++;
		System.out.println("Count of odd number is:"+count);
		
			
		

	}

}
