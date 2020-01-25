class shape1{
int x,y;
void draw() {
System.out.println("the drawing shape");
}
void erase() {
System.out.println("the shape");
}
}
class circle1 extends shape1{
void draw() {
System.out.println("the drawing is a circle");
}
void erase() {
System.out.println("the erase");
}                                                              
}
class triangle extends shape1{
void draw() {
System.out.println("the drawing is a triangle");
}
void erase() {
System.out.println("the erase of triangle");
}
}
class square1 extends shape1{
void draw() {
System.out.println("the drawing is a square");
}
void erase() {
System.out.println("the erase of square");
}
}
public class program50_shapes {

	public static void main(String[] args) 
	{
		triangle t=new triangle();
		t.draw();
		circle1 c=new circle1();
		c.draw();
		square1 s=new square1();
		s.draw();
	}

}
