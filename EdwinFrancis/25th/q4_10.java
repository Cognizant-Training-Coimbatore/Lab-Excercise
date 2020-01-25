import java.util.Scanner;

public class q4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[]=new int[5];
		Scanner input=new Scanner(System.in);
		int i,small;
		System.out.println("Enter the numbers:");
		for(i=0;i<5;i++) {
			ar[i]=input.nextInt();
		}
		small=ar[0];
		for(i=0;i<5;i++) {
			if(ar[i]<small) {
				small=ar[i];
			}
			
		}
		System.out.println("Smallest element is :"+small);

	}

}
