package demo;

public class finally_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]=new int[2];
try {
	
	System.out.println("acces element 3:"+a[3]);
}
catch(ArrayIndexOutOfBoundsException e)
{
	System.out.println("error"+e);
}
finally {
	a[0]=6;
	System.out.println("first element"+a[0]);
	System.out.println("Finally statement is executed");
}
	}

}
