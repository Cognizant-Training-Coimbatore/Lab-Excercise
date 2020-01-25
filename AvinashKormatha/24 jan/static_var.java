class taet1
{
 static int x;
static void display()
 {
	 x++;
	 System.out.println(x);
 }
}
public class static_var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		taet1 obj= new taet1();
		obj.display();
		taet1 obj2= new taet1();
		
		taet1.display();
	}

}
