class student4{
	String name;
	student4(){
		name="unknown";
		System.out.println(name);
	}
	student4(String x)
	{
		name=x;
		System.out.println(name);
	}
}
public class question6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student4 s1=new student4();
		student4 s2=new student4("sam");

	}

}
