package demo;

import java.util.Scanner;

public class electricity_bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		float om,nm,unit,c;
		System.out.println("Enter the old meter reading");
        om=s.nextFloat();
		System.out.println("Enter the new meter reading");
		nm=s.nextFloat();
		unit=nm-om;
		if(unit<=100)
		{
			System.out.println("Free");
		}
		else if(unit>100 && unit<=200)
		{
			System.out.println("charge=Rs:1.00/-");
		}
		else if(unit>200 && unit<=300)
		{
			System.out.println("charge=Rs:2.00/-");
		}
		else if(unit>300 && unit<=400)
		{
			System.out.println("charge=Rs:1.00/-");
		}
		else
		{
			c=4+((10*unit)/100);
			System.out.println("charge=Rs:"+c+"/-");
		}
	}

}
