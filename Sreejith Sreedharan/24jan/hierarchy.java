package demo;
class p1
{int a=20;

}
class p2 extends p1
{int b=200;
void display()
{System.out.println(a+b);}

}

class c2 extends p1
{int c=1200;
void display()
{System.out.println(a+c);}}

public class hierarchy {
public static void main(String[] args)
{p2 obj1=new p2();
obj1.display();
c2 obj2=new c2();
obj2.display();}
}
