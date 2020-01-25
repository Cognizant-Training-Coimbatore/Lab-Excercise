class addamount
{
int initial=50;
addamount()
{
	System.out.println("without passing parameter:final amoount is $"+initial);
}
addamount(int x)
{
	System.out.println("with passing parameter final amoount is $"+(initial+x));
}
}
public class pgm7piggiebank {

	public static void main(String[] args) {
		addamount obj=new addamount();
		addamount obj1=new addamount(90);

	}

}
