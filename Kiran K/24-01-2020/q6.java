import java.util.Scanner;

public class q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n[]=new int[5];
        int i,sum=0,avg;
        System.out.println("Enter the 5 nos.:");
        Scanner sc=new Scanner(System.in);
        for(i=0;i<5;i++) {
        	n[i]=sc.nextInt();
        	sum=sum+n[i];
        }
        avg=sum/5;
        System.out.println("Sum is"+sum);
        System.out.println("Average is:"+avg);
	}

}
