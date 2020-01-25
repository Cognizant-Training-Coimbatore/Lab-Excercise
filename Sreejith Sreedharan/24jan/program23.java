package demo;
class testA
{int a=10;}
class testB extends testA
{int b=35;}
class testC extends testB
{int c=a+b;
void disp()
{System.out.println(c);}
}
public class program23 {
public static void main(String[] args)
{testC obj=new testC();
obj.disp();
}
}
