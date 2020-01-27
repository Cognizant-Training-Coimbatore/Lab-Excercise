package packB;

import java.util.Scanner;

public class qn_1 {
	static void checkpositive(int no) throws Exception{
		if(no<=0) {
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
			int a=scan.nextInt();
			checkpositive(a);
		}
		catch(Exception m){
			System.out.println("error occured: "+m);
			
		}

	}

}
