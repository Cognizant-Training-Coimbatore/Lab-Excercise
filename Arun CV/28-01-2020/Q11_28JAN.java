import java.util.LinkedList;
import java.util.Scanner;
public class Q11_28JAN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     LinkedList<String> l_list = new LinkedList<String>();
	     l_list.add("Elephant");
         l_list.add("Giraffe");
         l_list.add("Buffalo");
         l_list.add("Goat");
         l_list.add("Horse");
   
  System.out.println("Original list:" + l_list);  
  System.out.println("Enetr the positions to be swapped");
  Scanner sc=new Scanner(System.in);
  int x=sc.nextInt();
  int y=sc.nextInt();
   String first_element = l_list.get(x);
   l_list.set(x,l_list.get(y));
   l_list.set(y,first_element);
   
   System.out.println("Original list:" + l_list);  
   sc.close();
	}
	}

