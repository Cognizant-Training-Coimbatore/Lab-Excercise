import java.util.Scanner;

public class QN2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int N,i;
        System.out.println("Enter a number btwn 1 and 9: ");
        Scanner sc=new Scanner(System.in);
        N=sc.nextInt();
        for(i=1;i<10;i++)
        {
        	System.out.println(N+"*"+i+"="+(i*N));
        }
        
	}

}
