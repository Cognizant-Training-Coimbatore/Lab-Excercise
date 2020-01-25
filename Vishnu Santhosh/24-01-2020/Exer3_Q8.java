class shapes{
	void draw() {
		System.out.println("This is a shape!");
	}
	void erase() {
		
	}
}
class circles extends shapes{
	void draw() {
		System.out.println("Circle is drawing!");
	}
	void erase() {
		System.out.println("Circle is erasing!");
	}
}
class squares extends shapes{
	void draw() {
		System.out.println("Square is drawing!");
	}
	void erase() {
		System.out.println("Square is erasing!");
	}
}
class triangle extends shapes{
	void draw() {
		System.out.println("Triangle is drawing!");
	}
	void erase() {
		System.out.println("Triangle is erasing!");
	}
}
public class Exer3_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		squares obj1=new squares();
		triangle obj2=new triangle();
		circles obj3=new circles();
		shapes obj = new shapes();
		obj1.draw();
		obj2.draw();
		obj3.draw();
		obj.draw();
		obj1.erase();
		obj2.erase();
		obj3.erase();
		obj.erase();
	}

}
