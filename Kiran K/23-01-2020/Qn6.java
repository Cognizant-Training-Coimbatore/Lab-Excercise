package demo;
class students{
	String name;
	students(String s){
		name=s;
	}
	students(){
		name="unknown";
	}
}
public class Qn6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        students obj1=new students("kiran");
        students obj2=new students();
        System.out.println(obj1.name);
        System.out.println(obj2.name);
	}

}
