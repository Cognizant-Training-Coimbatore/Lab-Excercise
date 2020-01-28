package demo;

public class Abstract_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Rectangle r=new Rectangle();
r.calArea();
r.displayArea();

Circle c=new Circle();
c.calArea();
c.displayArea();
	}
}
	abstract class shape{
		int length=2,width=3,radius=10;
		abstract void calArea();
		abstract void displayArea();
		void dummy() {
			System.out.println("dummy");
		}
	}
 class Rectangle extends shape{
	int area;
	void calArea() {
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("Rectangle"+(area));
	}
}
 class Circle extends shape{
	double area;
	void calArea() {
		area=3.14*radius*radius; 
	}
		void displayArea()
		{
			System.out.println("Circle"+(area));
		}
}

 
