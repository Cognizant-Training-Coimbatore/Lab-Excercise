import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,d,e,count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter 5 nos.:");
        a=scanner.nextInt();
        b=scanner.nextInt();
        c=scanner.nextInt();
        d=scanner.nextInt();
        e=scanner.nextInt();
        if(a%2!=0) {
        	count++;
        }
        if(b%2!=0) {
        	count++;
        }
        if(c%2!=0) {
        	count++;
        } 
        if(d%2!=0) {
        	count++;
        }
        if(e%2!=0) {
        	count++;
        }
        System.out.println("the count of odd nos. is"+count);

	}

}
