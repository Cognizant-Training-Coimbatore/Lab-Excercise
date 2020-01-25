import java.util.Scanner;
public class program18_count_odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e;
		 int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter value a");
		a=scanner.nextInt();
		System.out.println("enter value b");
		b=scanner.nextInt();
		System.out.println("enter value c");
		c=scanner.nextInt();
		System.out.println("enter value d");
		d=scanner.nextInt();
		System.out.println("enter value e");
		e=scanner.nextInt();
		if(a%2!=0) {
			count+=1;
		}
		if(b%2!=0) {
			count+=1;
		}
		if(c%2!=0) {
			count+=1;
			
		}
		if(d%2!=0) {
			count+=1;
		}
		if(e%2!=0) {
			count+=1;
		}
		System.out.println("the no of odd no is"+count);
	}

}
