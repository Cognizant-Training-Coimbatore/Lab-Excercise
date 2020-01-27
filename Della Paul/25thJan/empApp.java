package packA;

public class empApp {
	void display()
	{
		System.out.println(empname);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee empobj=new employee();
		empobj.putvalues();
		empobj.printvalues();
		empobj.empname="Della";
		empobj.salary=9000;
		

	}

}
