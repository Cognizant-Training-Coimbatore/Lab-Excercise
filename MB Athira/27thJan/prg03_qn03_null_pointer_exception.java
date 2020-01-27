
public class prg03_qn03_null_pointer_exception
{
 
 
 public static void main(String[] args) 
 {
  String k=null;
  try
  {
  if(k.equals("abcd"))
  {
    
   System.out.println("enter value");
  }
  }
  catch( NullPointerException m) {
   System.out.println("error occured "+m);
  }
 }
}