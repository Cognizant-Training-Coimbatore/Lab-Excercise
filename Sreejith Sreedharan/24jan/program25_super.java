package demo;
class testX
{int x=100;

}
class testY extends testX
{int x=10;
void display()
{System.out.println(super.x);}
}

public class program25_super {
public static void main(String[] args)
{testY obj=new testY();
obj.display();}
}
