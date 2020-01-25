import java.util.Scanner;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int oldMeter,newMeter,units;
		System.out.println("Enter the old and new meter reading:");
		Scanner input=new Scanner(System.in);
	    oldMeter=input.nextInt();
	    newMeter=input.nextInt();
	    units=newMeter-oldMeter;
	    if(units>=1 && units<=100)
	    	{System.out.println("Free");
	    	}
	    if(units>100 && units<=200)
    	{System.out.println("Rs.1");
    	}
	    if(units>200 && units<=300)
    	{System.out.println("Rs.2");
    	}
	    if(units>300 && units<=400)
    	{System.out.println("Rs.3");
    	}
	     if(units>400)
    	{System.out.println("Rs."+(4+(units/10)));
    	}
	
	

	}

}
