package packB;

import java.util.Scanner;

public class Exer4_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		int[] arr = new int[5];
		int[] arrAsc = new int[5];
		int[] arrDes = new int[5];
		for(int i=0;i<5;i++) {
			System.out.printf("%d Number: ",i+1);
			arr[i]=scan.nextInt();
		}
		int temp;
		arrDes = arr.clone();
		arrAsc = arr.clone();
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				if(arrDes[j+1]>arrDes[j]) {
					temp=arrDes[j+1];
					arrDes[j+1]=arrDes[j];
					arrDes[j]=temp;
				}
				if(arrAsc[j+1]<arrAsc[j]) {
					temp=arrAsc[j+1];
					arrAsc[j+1]=arrAsc[j];
					arrAsc[j]=temp;
				}
			}
		}
		System.out.print("Ascending order: ");
		for(int i=0;i<5;i++) {
			System.out.print(arrAsc[i]+"\t");
		}
		System.out.print("\nDescending order: ");
		for(int i=0;i<5;i++) {
			System.out.print(arrDes[i]+"\t");
		}
		
	}

}
