class students{
	String sname;
	students(){
		sname="unknown";
	}
	students(String x)
	{
	sname=x;	
	}
	void display()
	{
		System.out.println(sname);
	}
}
public class program33_const_overload_student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		students st=new students();
		students st1=new students("dona");
		st.display();
		st1.display();

	}

}
