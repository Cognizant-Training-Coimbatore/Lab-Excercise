package packc;
import java.util.ArrayList;
 
public class firstelemnt {
 
    public static void main(String[] args) {
        
        //create new ArrayList
        ArrayList<String> aListNumbers 
                = new ArrayList<String>();
        
        //we are going to add some numbers to ArrayList
        aListNumbers.add("One");
        aListNumbers.add("Two");
        aListNumbers.add("Three");
        
        /*
         * To insert element at beginning of ArrayList
         * use add method of ArrayList class with index 0
         */
        
        aListNumbers.add(0, "Zero");
        
        System.out.println("Element added at beginning of ArrayList");
        
        //print ArrayList
        System.out.println(aListNumbers);
    }
}