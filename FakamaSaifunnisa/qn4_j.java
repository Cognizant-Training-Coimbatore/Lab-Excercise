import java.util.Scanner;

class add{
	int add(int x,int y) {
		return x+y;
	}
}
class sub{
	int sub(int x,int y) {
		return x-y;
	}
}
class mul{
	int mul(int x,int y) {
		return x*y;
	}
}
class div{
	float div(int x,int y) {
		return x/y;
	}
}
public class qn4_j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add a=new add();
		sub b=new sub();
		mul c=new mul();
		div d=new div();
		System.out.println("enter the value of x and y");
		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
		int a2=s.nextInt();
		System.out.println("addition of two numbers is: "+a.add(a1,a2));
		System.out.println("subractin of two numbers: "+b.sub(a1,a2));
		System.out.println("multiplying of two numbers is: "+c.mul(a1,a2));
		System.out.println("division of two numbers: "+d.div(a1,a2));
		
	}

}
