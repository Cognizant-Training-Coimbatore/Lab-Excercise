import java.util.Scanner;

public class QN4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n=4,i,l;
        System.out.println("Im thinking about a number btwn 0 and 9.Can you guess it?(3 attempts left)");
        Scanner sc=new Scanner(System.in);
        for(i=3;i>0;i--)
        {
        l=sc.nextInt();
        if(l==n) {
        	System.out.println("you have entered the correct number");
        }
        else if(i!=1) {
        	System.out.println("Sorry.Wrong Number.Im thinking about a number btwn 0 and 9.Can you guess it?("+(i-1)+ "attempts left)");
        }
        else if(i==1)
        {
        	System.out.println("sorr.wrong number.The correct number is 4");
        }
        }
	}

	}
