import java.util.Scanner;

class AddAmount{
	int amount=50;
	AddAmount(){
		amount=amount+0;
	}
	AddAmount(int s){
		amount=amount+s;
	}
}
public class q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AddAmount ob1=new AddAmount();
		AddAmount ob2=new AddAmount(10);
		System.out.println(ob1.amount);
		System.out.println(ob2.amount);
	
		

	}

}
