class Programming{
	String x="I love ";
	Programming(){
		x+="programming languages";
	}
	Programming(String a){
		x+=a;
	}
}
public class Exer_Q8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Programming obj1 = new Programming();
		Programming obj2 = new Programming("Java");
		System.out.println(obj1.x);
		System.out.println(obj2.x);
	}

}
