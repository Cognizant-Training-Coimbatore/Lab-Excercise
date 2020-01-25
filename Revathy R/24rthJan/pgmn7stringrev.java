import java.util.*;
public class pgmn7stringrev {
public static void main(String a1[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the string");
String str=sc.nextLine();
String reverse="";
for(int i=str.length()-1;i>=0;i--)
reverse=reverse+str.charAt(i);
System.out.println("The reversed string is ");
System.out.println(reverse);
}
}