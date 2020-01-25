package packB;
import java.util.Scanner;

import packA.series4__4_emp_details;
public class series4_4_emp {

	public static void main(String[] args) {
		series4__4_emp_details obj[]=new series4__4_emp_details[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			
			System.out.println("enter the details name,address,department age and salary of "+(i+1)+"th employee\n");
			obj[i]=new series4__4_emp_details();
			obj[i].empname=sc.next();
			obj[i].empaddr=sc.next();
			obj[i].empdep=sc.next();
			obj[i].age=sc.nextInt();
			obj[i].empsalary=sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println("details of "+(j+1)+"th employee\n");
			obj[j].display();
		}


	}

}
