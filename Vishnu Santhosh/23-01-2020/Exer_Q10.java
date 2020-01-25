class findArea{
	void area(int a) {
		System.out.println("Area of square= "+a*a);
	}
	void area(int l,int b) {
		System.out.println("Area of rectangle= "+l*b);
	}
}
public class Exer_Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		findArea obj = new findArea();
		obj.area(4);;
		obj.area(5, 6);
	}

}
