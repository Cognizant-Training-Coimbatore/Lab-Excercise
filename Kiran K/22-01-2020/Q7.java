import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        a=scanner.nextInt();
        if(a%7==0) {
        	System.out.println("Number is divisibe by 7");
        }
        else {
        	System.out.println("Number is not divisible by 7");
        }

	}

}
