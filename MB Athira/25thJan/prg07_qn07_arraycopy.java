import java.util.Scanner;

public class prg07_qn07_arraycopy 
{
 public static void main(String[] args) 
 {
  int i;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter the size of array");
  int m=sc.nextInt();
  int n[]=new int[m];
  int c[]=new int[m];
  for( i=0;i<m;i++)
  {
   int number=sc.nextInt();
   n[i]=number;
   
  }
  for(i=0;i<m;i++) 
  {
   c[i]=n[i];
  }
  System.out.println("the copy is: ");
  for(i=0;i<m;i++)
  {
   System.out.print(c[i]);
  }
 }
}
