package demo;
class shapes
{
	int a=2;
	void draw()
	{
		System.out.println("Area=");
	}
	void erase()
	{
		System.out.println("Perimeter=");
	}
}
class ccircle extends shapes
{
	void draw()
	{
		System.out.println("Area="+(a*3.14*a));
	}
	void erase()
	{
		System.out.println("Perimeter="+(2*3.14*a));
	}
}
class ssquare extends shapes
{
	void draw()
	{
		System.out.println("Area="+(a*a));
	}
	void erase()
	{
		System.out.println("Perimeter="+(4*a));
	}
}
class triangle extends shapes
{
	void draw()
	{
		System.out.println("Area="+((a*a)/2));
	}
	void erase()
	{
		System.out.println("Perimeter="+(3*a));
	}
}
public class shapes_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ccircle ci=new ccircle();
		ssquare sq=new ssquare();
		triangle tr=new triangle();
		ci.draw();
		ci.erase();
		sq.draw();
		sq.erase();
		tr.draw();
		tr.erase();
	}

}
