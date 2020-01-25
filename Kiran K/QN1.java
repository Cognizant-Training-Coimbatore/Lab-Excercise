import java.util.Scanner;

public class QN1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		int i;
        System.out.println("Enter the two numbers:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        System.out.println("The numbers between are:");
        for(i=n1+1;i<n2;i++)
        {
        	System.out.println(i);
        }
        
	}

}
