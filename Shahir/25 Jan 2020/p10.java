package packB;

import java.util.Scanner;

public class Exer4_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] arr = new int[5];
		int s=0;
		for(int i=0;i<5;i++) {
			System.out.printf("%d Number: ",i+1);
			arr[i]=scan.nextInt();
			if(i==0) {
				s=arr[i];
			}
			else if(arr[i]<s)
				s=arr[i];
		}
		System.out.println("Smallest number is: "+s);
		scan.close();
	}

}
