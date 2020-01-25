class shape1
{
	int x,z;
}
class circle1 extends shape1
{
	void  draw()
	{
		System.out.println("circle is drawn");
	}
	void erase()
	{
		System.out.println("Erase circle");
	}
}
class triangle extends shape1
{
	void  draw()
	{
		System.out.println("triangle is drawn");
	}
	void erase()
	{
		System.out.println("Erase triangle");
	}
}
class square1 extends shape1
{
	void  draw()
	{
		System.out.println("square is drawn");
	}
	void erase()
	{
		System.out.println("Erase square");
	}
}
public class day2_second_8 {

	public static void main(String[] args) {
		triangle t=new triangle();
		t.draw();
		t.erase();
		circle1 d=new circle1();
		d.draw();
		d.erase();
		square1 s=new square1();
		s.draw();
		s.erase();

	}

}
