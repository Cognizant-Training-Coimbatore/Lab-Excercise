abstract class shap
{
	int length=2,width=2,radius=10;
	abstract void calculateArea();
	abstract void displayArea();
	void dummymodule()
	{
		System.out.println("Dummy module");
	}
	}
class rectangl extends shap{
	int area;
	void calculateArea()
	{
		area=length*width;
	}
	void displayArea()
	{
		System.out.println("recatngle"+(area));
	}
}
class circlee extends shap
{		double area;

	void calculateArea()
	{
		area=3.14*radius*radius;
	}
	void displayArea()
	{
		System.out.println("Circle"+(area));
	}
}
public class program80_abstract_class {

	public static void main(String[] args) {
		
		rectangl rect=new rectangl();
		rect.calculateArea();
		rect.displayArea();
		circlee ci=new circlee();
		ci.calculateArea();
		ci.displayArea();
	}

}
