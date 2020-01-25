class students
{
	String sname;
	students()
	{
		sname = "Unknown";
	}
	
	students(String x)
	{
		sname = x;
	}
	void display()
	{
		System.out.println(sname);
	}
}
public class pgm6overload {

	public static void main(String[] args) {
		students obj=new students();
		students obj1=new students("revathy");
		obj.display();
		obj1.display();
	}

}
