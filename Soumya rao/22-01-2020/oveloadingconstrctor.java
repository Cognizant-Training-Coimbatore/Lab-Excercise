package demo;
class sample{
	sample1()
	{
		System.out.println("hai");
	}
	sample(int a){
		System.out.println("hello");
	}
}
public class oveloadingconstrctor {

	public static void main(String[] args) {
		sample obj=new sample();
		sample obj2=new sample(5);


	}

}
