import java.util.Scanner;

public class q2_6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int n,sum=0,i=1;
		Scanner input=new Scanner(System.in);
		while(i!=0) {
			System.out.println("Enter number:");
			n=input.nextInt();
			if(n==-999) {
			 break;
			}
			i++;
			sum=sum+n;
		}
			System.out.println("Sum is:"+sum);
			System.out.println("Average is"+(sum/(i-1)));
			
		}

	}


