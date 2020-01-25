class stuudents{
	String name;
	stuudents(){
		name="Unknown";
	}
	stuudents(String a){
		name=a;
	}
}
public class Exer_Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stuudents obj1 = new stuudents();
		stuudents obj2 = new stuudents("Vishnu");
		System.out.println("Name: "+obj1.name);
		System.out.println("Name: "+obj2.name);
	}

}
