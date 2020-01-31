package java_excercises;

import java.util.Scanner;

public class q11_powerOf4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		while(num!=1) {
			if(num%4==0) {
				num=num/4;	
			}
			else {
				System.out.println("NOT a power of 4");
				break;
			}
			
		}
		if(num==1) {
			System.out.println("It's a power of 4!!");
		}
		
		
		

	}

}
