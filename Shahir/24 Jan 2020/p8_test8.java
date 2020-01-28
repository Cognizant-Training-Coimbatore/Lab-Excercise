class Shape1
{
	void draw()
	{
		System.out.println("This is a shape");
	}
}
class Triangle1 extends Shape1
{
	void draw()
	{
		System.out.println("Trainagle is drawing");
	}
	void erase()
	{
		System.out.println("Trainagle is erasing");
	}
}
class Circle1 extends Shape1
{
	void draw()
	{
		System.out.println("Circle is drawing");
	}
	void erase()
	{
		System.out.println("Circle is erasing");
	}
}
class Square1 extends Shape1
{
	void draw()
	{
		System.out.println("Square is drawing");
	}
	void erase()
	{
		System.out.println("Square is erasing");
	}
}
public class p8_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape1 s = new Shape1();
		Triangle1 t = new Triangle1();
		Circle1 c = new Circle1();
		Square1 s1 = new Square1();
		s.draw();
		s1.draw();
		c.draw();
		t.draw();
		s1.erase();
		t.erase();
		c.erase();
	}

}
