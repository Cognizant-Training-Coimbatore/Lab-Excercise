package packB;
import java.util.Scanner;

public class qn_7 {

	static void checkaccepted(int no) throws Exception{
		if((no<100) || (no>=201) ) {
			throw new myexceptions("rejected not allowed");
		}
		else {
			System.out.println("number is accepted ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the number");
			int a=scan.nextInt();
			checkaccepted(a);
		}
		catch(Exception m){
			System.out.println("error occured: "+m);
			
		}

	}


}
