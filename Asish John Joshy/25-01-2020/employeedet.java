package X2;

import java.util.Scanner;

import X1.employee;

public class employeedet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		for(int i=1;i<=5;i++)
		{
		System.out.println("Enter name, department, address and salary of employee"+i);
		employee em=(employee) new employee();
		em.name=s.nextLine();
		em.dep=s.nextLine();
		em.addr=s.nextLine();
		em.sal=s.nextInt();
		em.display();
		}
	}

}
