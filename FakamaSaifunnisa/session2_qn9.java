
class animal
{
int x;
}
class dog extends animal
{
void shout()
{
System.out.println("Dog will bark");
}
}
class cat extends dog
{
void shout()
{
System.out.println("Cat will shout like miyaav.....");
}
}

public class session2_qn9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog obj=new dog();
		cat c2=new cat();
		obj.shout();
		c2.shout();
	}

}
