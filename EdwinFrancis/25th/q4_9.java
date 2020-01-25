import java.util.Scanner;

public class q4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[10];
		int i,data;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter 10 elements:");
		for(i=0;i<10;i++) {
			ar[i]=input.nextInt();
		}
		System.out.println("Enter data to be searched:");
		data=input.nextInt();
		for(i=0;i<10;i++) {
			if(ar[i]==data)
			{
				System.out.println("Search succesful at "+i+" position");
				break;
			}
			
			}
		if(i==10) {
			System.out.println("Search unsuccesful!!");
		}

	}

}
