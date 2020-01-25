class AddAmount{
	int amount=50;
	AddAmount(){
		amount+=0;
	}
	AddAmount(int a){
		amount+=a;
	}
}
public class Exer_Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddAmount obj1 = new AddAmount();
		AddAmount obj2 = new AddAmount(45);
		System.out.println("Amount: $"+obj1.amount);
		System.out.println("Amount: $"+obj2.amount);
	}

}
