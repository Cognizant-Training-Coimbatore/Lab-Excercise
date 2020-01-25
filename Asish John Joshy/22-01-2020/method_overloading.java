package demo;
class over
{
	void area(int a,int b)
	{
		System.out.println("Area of rectangle="+a*b);
	}
	void area(float c)
	{
		float are=(float) (3.14*c*c);
		System.out.println("Area of circle="+are);
	}
}
public class method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		over o=new over();
		o.area(2,3);
		float ra=(float) 3.00;
		o.area(ra);
	}

}
