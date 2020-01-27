package packA;

import java.util.Scanner;
public class ques6 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  int i;
  Scanner sc=new Scanner(System.in);
  int n[]=new int[4];
  int sum=0;
  System.out.println("enter five numbers");
  for( i=0;i<4;i++)
  {
   int number=sc.nextInt();
   n[i]=number;
   sum=sum+number;
  }
  int avg=sum/5;
  System.out.println(sum);
  System.out.println("average is "+avg);
 }
}


