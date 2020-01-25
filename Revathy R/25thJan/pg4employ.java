package pack2;
import java.util.Scanner;

import pack1.pg4empdetail;
public class pg4employ {

	public static void main(String[] args) {
		pg4empdetail obj[]=new pg4empdetail[5];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<5;i++)
		{
			
			System.out.println("enter the details name,address,department age and salary of "+(i+1)+"th employee\n");
			obj[i]=new pg4empdetail();
			obj[i].name=sc.next();
			obj[i].address=sc.next();
			obj[i].department=sc.next();
			obj[i].age=sc.nextInt();
			obj[i].salary=sc.nextInt();
		}
		for(int j=0;j<5;j++)
		{
			System.out.println("details of "+(j+1)+"th employee\n");
			obj[j].display();
		}

	}

}
