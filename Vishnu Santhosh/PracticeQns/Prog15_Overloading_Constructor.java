class constructor{
	constructor(){
		System.out.println("Constructor 1 invoked!!!!");
	}
	constructor(int a){
		System.out.println("Constructor "+a+" invoked!!!!");
	}
}
public class Prog15_Overloading_Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor obj= new constructor();
		constructor obj1= new constructor(2);
	}

}
