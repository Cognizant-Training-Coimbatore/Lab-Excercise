import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_Example
{
	public static void main(String[] args) throws Exception
	{
		XSSFWorkbook x = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream(new File("Book1.xlsx"));
		x.write(out);
		out.close();
		System.out.println("Book1.xlsx written successfully");
	}

}
