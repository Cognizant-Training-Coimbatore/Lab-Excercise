
import java.io.FileInputStream;
import java.io.DataInputStream;
public class exercise_qn10 {
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  try {
   FileInputStream fstream=new FileInputStream("E:\\book.CSV");
   DataInputStream fin=new DataInputStream(fstream);
   while(fin.available()!=0) {
    System.out.println(fin.readLine());
   }
   fin.close();
  }
  catch (Exception e) {
   System.err.println("file error");
  }
 }
}

