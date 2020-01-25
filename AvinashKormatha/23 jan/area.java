class area1
{
	void area2(int a)
	{
		System.out.println("area of square"+a*a);
	}
	void area2(int l,int b)
	{
		System.out.println("area of rectangle"+l*b);
	}
}
public class area {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		area1 obj = new area1();
		obj.area2(5);
		obj.area2(2,3);
	}

}
