package packB;

import java.util.Scanner;


public class qn_5 {
	static void checkmark(int no) throws Exception{
		if(no<0) {
			throw new myexceptions("negative not allowed");
		}
		else {
			System.out.println("number is accepted which is apositive integer");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the mark");
			int a=scan.nextInt();
			checkmark(a);
		}
		catch(Exception m){
			System.out.println("error occured: "+m);
			
		}
	}

	

}
