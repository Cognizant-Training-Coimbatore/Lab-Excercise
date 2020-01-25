
import java.util.*;
public class day2_ques4 {
public static void main(String[] args) {
int a,b;
Scanner sc=new Scanner(System.in);
a=(int)(Math.random()*((9-0)+1))+0;
for(int i=3;i>0;i--)
{b=sc.nextInt();

if(a==b)
{System.out.println("Correct Guess!!!!");
System.exit(0);}
else
System.out.println("Sorry.Wrong Number. I'm thinking about a number between 0 and 9. Can you guess it?"+"( "+(i-1)+" attempts left"+")" );
}

System.out.println("the number is "+a);

}

}


	


