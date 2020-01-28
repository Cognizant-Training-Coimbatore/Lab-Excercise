class Shape
{
	void display()
	{
		System.out.println("This is shape");
	}
}
class Rectangle extends Shape
{
	void rect()
	{
		System.out.println("This is rectangle");
	}
}
class Circle extends Shape
{
	void cir()
	{
		System.out.println("This is circle");
	}
}
class Square extends Rectangle
{
	void sqr()
	{
		System.out.println("Square is rectangle");
	}
}
public class p5_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape s = new Shape();
		Rectangle r = new Rectangle();
		Circle c = new Circle();
		Square s1 = new Square();
		s1.display();
		s1.rect();
	}

}
