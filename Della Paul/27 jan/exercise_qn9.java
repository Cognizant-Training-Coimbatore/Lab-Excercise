import java.io.FileOutputStream;
import java.io.PrintStream;
public class exercise_qn9 {
	
 public static void main(String[] args) {
  // TODO Auto-generated method stub
  FileOutputStream fout;
  PrintStream p;
  try {
   fout=new FileOutputStream("E:\\book.CSV");
   p=new PrintStream(fout);
   p.println("101,c,E.Balaguruswamy, BPB, 110");
   p.println("102, C++, Kanikar, Tech mcgraw hill, 200");
   p.println("103, Java made easy, Karthik, Vijaya, 300");
   p.close();
  }
  catch(Exception e) {
   System.err.println("error in file");
  }
 }
}




