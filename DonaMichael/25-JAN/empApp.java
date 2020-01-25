package packA;

public class empApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee empObj=new employee();
		empObj.putvalues();
		empObj.printValues();
		empObj.empname="dona";
		empObj.salary=1223;
		//we cant access empObj.empCode......becuse it is declared as private.
		

	}

}
