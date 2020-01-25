class shape1{
	int x,y;
	void draw() {
		System.out.println("the drwing shape");
	}
	void erase() {
		System.out.println("the shape");
	}
}
class circle1 extends shape1{
	void draw() {
		System.out.println("the drwing circle");
	}
	void erase() {
		System.out.println("the erase");
	}
}
class triangle extends shape1{
	void draw() {
		System.out.println("the drwing triangle");
	}
	void erase() {
		System.out.println("the erase of triangle");
	}
}
class square1 extends shape1{
	void draw() {
		System.out.println("the drwing square");
	}
	void erase() {
		System.out.println("the erase of square");
	}
}

public class session_2_qn_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle t=new triangle();
		t.draw();
		circle1 c=new circle1();
		c.draw();
		square1 s=new square1();
		s.draw();

	}

}
