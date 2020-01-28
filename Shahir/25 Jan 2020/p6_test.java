package packB;

import java.util.Scanner;

public class Exer4_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[5];
		int sum=0;
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<5;i++) {
			System.out.printf("%d Number: ",i+1);
			array[i]=scan.nextInt();
			sum+=array[i];
		}
		System.out.println("\n Sum= "+sum+"\nAverage= "+sum/5);
	}

}
