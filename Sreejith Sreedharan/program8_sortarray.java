package demo;
import java.util.*;
public class program8_sortarray {
public static void main(String[] args)
{int a[]=new int[5];
Scanner sc=new Scanner(System.in);
int temp;
for(int i=0;i<5;i++)
	a[i]=sc.nextInt();
for(int i=0; i < 5; i++){  
         for(int j=1; j < (5-i); j++){  
                  if(a[j-1] > a[j]){  
                         //swap elements  
                         temp = a[j-1];  
                         a[j-1] = a[j];  
                         a[j] = temp;  
                 }  
                  }
         }

for(int i=0;i<5;i++)
	System.out.println(a[i]);
for(int i=4;i>=0;i--)
{System.out.println(a[i]);

		
	

}
}
}