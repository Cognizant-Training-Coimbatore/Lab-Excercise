import java.util.Scanner;

public class pg8countoddno {

	public static void main(String[] args) {
		int n1,n2,n3,n4,n5,count=0;
		 System.out.println("enter the value of n1");
			Scanner sc=new Scanner(System.in);
			n1=sc.nextInt();
			 System.out.println("enter the value of n2");
			 n2=sc.nextInt();
			 System.out.println("enter the value of n3");
			 n3=sc.nextInt();
			 System.out.println("enter the value of n4");
			 n4=sc.nextInt();
			 System.out.println("enter the value of n5");
			 n5=sc.nextInt();
			 if((n1%2)!=0)
				 count=count+1;
			 if((n2%2)!=0)
				 count=count+1;
			 if((n3%2)!=0)
				 count=count+1;
			 if((n4%2)!=0)
				 count=count+1;
			 if((n5%2)!=0)
				 count=count+1;
			 System.out.println("number of odd numbers is "+count);

	}

}
