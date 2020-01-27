package javaPrograms;
import java.util.Scanner;
public class listInteger {

public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in);

    int start = scan.nextInt();
    int end = scan.nextInt();

    if(start < end)
        for(int i = start; i <= end; i++)
            System.out.print(i+" " );

    else if(start > end)
        for(int i = start; i >= end; i--)
            System.out.print(i +" ");  
}
}
