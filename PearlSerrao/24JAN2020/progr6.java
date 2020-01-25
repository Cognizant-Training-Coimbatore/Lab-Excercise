package demo;

class Student2{
	  String name;
	  public Student2(String s){
	    name = s;
	  }
	  public Student2(){
	    name = "Unknown";
	  }
	}

	public class progr6{
	  public static void main(String[] args){
	    Student2 s1 = new Student2("xyz");
	    Student2 s2 = new Student2();

	    System.out.println(s1.name);
	    System.out.println(s2.name);
	  }
	}
								
