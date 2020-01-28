
import java.util.TreeSet;
import java.util.Iterator;

 
public class prgm_15 {
public static void main(String[] args) {
  TreeSet <Integer>myset = new TreeSet<Integer>();
 
   
  myset.add(10);
  myset.add(22);
  myset.add(36);
  myset.add(25);
  myset.add(16);
  myset.add(70);
  myset.add(82);
 myset.add(89);
  myset.add(14);
 
  System.out.println("Greater than or equal to 15 : "+myset.ceiling(15));
  System.out.println("Greater than or equal to 29 : "+myset.ceiling(29));
  }    
}

