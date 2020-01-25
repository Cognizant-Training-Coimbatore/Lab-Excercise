package demo;
import java.util.Scanner;
public class guess {

public static void main(String[] args)
{
for(int i=3;i>=1;i--)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();



if(  n==9)
{
System.out.println("great it is a correct guess");
}
else
{
System.out.println("Ooops its a wrong guess");
}

}
}

}
