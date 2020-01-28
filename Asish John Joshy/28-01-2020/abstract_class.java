package demo;
abstract class sha
{
	int r=2,l=2,b=2;
	abstract void calcarea();
	abstract void disparea();
	void normalmodule()
	{
		System.out.println("Normal module");
	}
}
class rect extends sha
{
	int area;
	void calcarea()
	{
		area=2*(l+b);
	}
	void disparea()
	{
		System.out.println("Area of rectangle="+area);
	}
}
class circle1 extends sha
{
	float area;
	void calcarea()
	{
		area=(float)3.14*r*r;
	}
	void disparea()
	{
		System.out.println("Area of circle="+area);
	}
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rect r=new rect();
		r.calcarea();
		r.disparea();
		circle1 c=new circle1();
		c.calcarea();
		c.disparea();
	}

}
