package demo;
abstract class shape{
	int length=2,width=4,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
}
class rectangle extends shape{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("Area of the rectangle is:"+(area));
	}
}
class circle extends shape{
	double area;
	void calculateArea() {
		area=3.14*radius*radius;
	}
	void displayArea() {
		System.out.println("Area of the circle is:"+(area));
	}
}
public class abstract_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        rectangle obj1=new rectangle();
        obj1.calculateArea();
        obj1.displayArea();
        circle obj2=new circle();
        obj2.calculateArea();
        obj2.displayArea();
        
	}

}
