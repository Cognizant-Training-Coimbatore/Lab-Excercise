class shape1
{
	void draw()
	{
		System.out.println("draw");
	}
	void erase()
	{
		System.out.println("erase");
	}
}

class circle1 extends shape1
{
	void draw()
	{
		System.out.println(" circle1 draw");
	}
	void erase()
	{
		System.out.println(" circle1 erase");
	}

}
class triangle extends shape1
{
	void draw()
	{
		System.out.println("triangle draw");
	}
	void erase()
	{
		System.out.println("triangle erase");
	}

}
class square1 extends shape1
{
	void draw()
	{
		System.out.println("square1 draw");
	}
	void erase()
	{
		System.out.println("square1 erase");
	}

}
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle1 obj1 = new circle1();
		obj1.draw();
		obj1.erase();
		triangle obj2 = new triangle();
		obj2.draw();
		obj2.erase();
		square1 obj3 = new square1();
		obj3.draw();
		obj3.erase();

	}

}
