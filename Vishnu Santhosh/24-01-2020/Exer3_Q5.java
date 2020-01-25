class Shape{
	void print() {
		System.out.println("This is This is shape");
	}
}
class Rectangle extends Shape{
	void printl() {
		System.out.println("This is rectangular shape");		
	}
}
class Circle extends Shape{
	void printl() {
		System.out.println("This is circle shape");		
	}
}
class Square extends Rectangle{
	void println() {
		System.out.println("Square is a rectangle");		
	}
}
public class Exer3_Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Square sq = new Square();
		sq.println();
		sq.printl();
		sq.print();
	}

}
