package packA;

public class empApp 
{

	public static void main(String[] args)
	{
		employee empObj = new employee();
		empObj.putValues();
		empObj.printValues();
		empObj.empname = "Revathy";
		empObj.salary = 70000;
	}

}
