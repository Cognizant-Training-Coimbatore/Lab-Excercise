import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class apache_poi_example
{

	public static void main(String[] args) throws Exception
	{
		XSSFWorkbook workbook = new XSSFWorkbook();
		FileOutputStream out = new FileOutputStream("Book7(1).xlsx");
		workbook.write(out);
		out.close();
		System.out.println("Book7(1).xlsx written successfully");
	}

}
