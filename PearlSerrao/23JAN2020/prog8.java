package demo;

public class prog8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Programming p=new Programming();
Programming p2=new Programming("Java");
	}

}
class Programming{
	Programming(){
		System.out.println("I love programming");
		
		
	}
	
	Programming(String x){
		System.out.println("I love"+x);
		
	}
}