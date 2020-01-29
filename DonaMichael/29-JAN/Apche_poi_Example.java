import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apche_poi_Example {

	public static void main(String[] args) throws Exception
	{
		//Create a blank workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		//Create file system using specific name
		FileOutputStream out=new FileOutputStream(new File("sample.xlsx"));
		
		//write operation workbook using file out object
		workbook.write(out);
		out.close();
		System.out.println("sample.xlsx written successfully");
		
	}

}
