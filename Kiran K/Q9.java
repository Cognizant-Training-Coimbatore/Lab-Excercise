import java.util.Scanner;

public class Q9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int old,newm,unit,price;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter old meter reading:");
		System.out.println("Enter new meter reading:");
		old=scanner.nextInt();
        newm=scanner.nextInt();
        unit=newm-old;
        System.out.println("No of units is:"+unit);
        if(unit>0 && unit<=100) {
        	price=0;
        	System.out.println("Price is:"+price);
        }
        if(unit>100 && unit<=200) {
        	price=1;
        	System.out.println("Price is:Rs."+price);
        }
        if(unit>200 && unit<=300) {
        	price=2;
        	System.out.println("Price is:Rs."+price);
        }
        if(unit>300 && unit<=400) {
        	price=3;
        	System.out.println("Price is:Rs."+price);
        }
        if(unit>400) {
        	price=4;
        	System.out.println("Price is:Rs."+price);
        }
        	

	}

}
