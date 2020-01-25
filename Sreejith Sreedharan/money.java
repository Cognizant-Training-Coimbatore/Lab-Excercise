package demo;
import java.util.*;
class AddAmount
{int piggie=50;
AddAmount()
{
	System.out.println("no amount is added:$"+piggie);
}
AddAmount(int plus)
{ 
	piggie=piggie+plus;
	System.out.println("new amount is :$"+ piggie);
}
}

public class money {

	public static void main(String[] args) {
		AddAmount obj=new AddAmount();
		Scanner sc=new Scanner(System.in);
		int mew;
		mew=sc.nextInt();
		AddAmount obj1=new AddAmount(mew);

	}

}
