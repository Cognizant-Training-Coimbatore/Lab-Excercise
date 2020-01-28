package packB;

import java.util.Scanner;

public class Exer4_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String[] array = new String[10];
		for(int i=0;i<5;i++) {
			System.out.printf("Friend %d name: ",i+1);
			array[i]=scan.next();
		}
		for(int i=0;i<5;i++) {
			System.out.printf("Friend %d name: ",i+1);
			System.out.println(array[i].toUpperCase());
		}
	}

}
