package demo;
import java.util.*;
class operations
{int a,b;
int addition(int n, int m)
{int f;
f=n+m;
return f;
}
int subtraction(int t, int g)
{int e;
e=t-g;
return e;
}
int multiplication(int k, int r)
{int c;
c=k*r;
return c;}
int division(int y,int z)
{int j;
j=y/z;
return j;}}
public class calculations {

	public static void main(String[] args) {
		operations obj=new operations();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two numbers");
		obj.a=sc.nextInt();
		obj.b=sc.nextInt();
		int k;
		k=obj.addition(obj.a, obj.b);
		int z;
		z=obj.subtraction(obj.a,obj.b);
		int l;
		l=obj.multiplication(obj.a,obj.b);
		int u;
		u=obj.division(obj.a,obj.b);
		System.out.println("Sum is"+k);
		System.out.println("subtraction is"+z);
		System.out.println("product is"+l);
		System.out.println("division:"+u);

	}

}
