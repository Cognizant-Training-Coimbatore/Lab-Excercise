package demo;

public class animals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cat c=new cat();
		c.shout();
	}

}
class Animal{
 
}
class dog extends Animal{
	void shoutd() {
		 System.out.println("dog barks");
	 }
}
class cat extends dog{
	void shout() {
		shoutd();
		 System.out.println("cats say meow");
	 }
}