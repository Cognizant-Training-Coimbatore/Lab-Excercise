package demo;

import java.util.Scanner;
class EvenOddcount{
public static void main (String args[]){
    int even=0,odd=0;
Scanner scan=new Scanner(System.in);
//create a scanner object for input
System.out.print("Enter the array size :\n");
int size=scan.nextInt();//reads input from user for array size
System.out.print("Enter the elements of the array :\n");
int arr[]=new int[size];
for(int i=0; i<arr.length; i++){
   System.out.printf("Enter the element arr[%d]:",i);
        arr[i]=scan.nextInt();//reads input from user for array elements
    }
    for(int i=0; i<size; i++){
        if(arr[i]%2==0){
            even++;
     
        }
        else{
            odd++;
    }
}
System.out.println("Total even numbers of ann array: "+even);//display even numbers
System.out.println("Total even numbers of ann array: "+odd);//display odd numbers
}
}

