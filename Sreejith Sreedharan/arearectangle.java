package demo;
import java.util.*;
class area
{int l,b;
int area(int a,int b)
{int c;
c=a*b;

return c;
	}

}

public class arearectangle {
	public static void main(String args[]) {
		area obj=new area();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values for l and b");
		obj.l=sc.nextInt();
		obj.b=sc.nextInt();
		int m;
		m=obj.area(obj.l,obj.b);
		System.out.println(m);
	}

}
