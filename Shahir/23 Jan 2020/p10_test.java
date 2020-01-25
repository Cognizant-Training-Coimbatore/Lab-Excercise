class findArea
{
	void area(int a)
	{
		System.out.println("Area of Square ="+(a*a));
	}
	void area(int l, int b)
	{
		System.out.println("Area of rectangle =" +(l*b));
	}
}
public class p10_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findArea a = new findArea();
		a.area(4);
		a.area(2,3);
	}

}
