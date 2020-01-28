package packB;

import java.util.Scanner;

public class Exer4_Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] arr = new int[10];
		for(int i=0;i<10;i++) {
			System.out.printf("%d Number: ",i+1);
			arr[i]=scan.nextInt();
		}
		System.out.printf("Enter the no to search: ");
		int x=scan.nextInt();
		int fl=0;
		for(int i=0;i<10;i++) {
			if(arr[i]==x)
				fl=1;
		}
		if(fl==1)
			System.out.println("Number is present.");
		else
			System.out.println("Number is not present.");
		scan.close();
	}

}
