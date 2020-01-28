
public class Prog9_Nested_if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 70;
		if(mark>35) {
			if (mark<80) {
				System.out.println("Just Pass");
			}
			else {
				System.out.println("Disstinction!");
			}
		}
		else {
			System.out.println("Fail");
		}
	}

}
