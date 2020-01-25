package demo;

import java.util.Scanner;

class sample3{
	void display()
	{
		System.out.println("display 1 is working");
	}
	void display(int x)
	{
		System.out.println("display is not working");
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         sample3 obj=new sample3();
         obj.display(5);
         obj.display();
	}

}
