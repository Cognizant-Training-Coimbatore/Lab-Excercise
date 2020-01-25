package demo;

public class shapes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Square s=new Square();
s.display1();
s.display2();
s.display3();
	}

}
class Shape{
	void display1() {
		System.out.println("this is shape");
		
	}
}
class Rectangle extends Shape{
	void display2() {
		System.out.println("this is rectangular shape");
		
	}
}
class Circle extends Shape{
	void display() {
		System.out.println("this is circular shape");
		
	}
}
	class Square extends   Rectangle{
		void display3() {
			
			System.out.println("Square is a rectangle");
			
		
	}
}