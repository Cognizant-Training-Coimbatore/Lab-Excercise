package packA;

public class employee {
protected int  empcode; //only accessible in same class
String empname;
int salary;
void putValues() {
	empcode=101;
	empname="soumya";
	salary=1000000;
	
}
void printValues() {
	System.out.println("Employee code:"+empcode);
	System.out.println("Employee name:"+empname);
	System.out.println("Employee salary:"+salary);
}
	
	
	
	
}
