import java.io.FileOutputStream;
import java.io.File;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_Poi_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook workbook=new XSSFWorkbook();
		FileOutputStream out=new FileOutputStream(new File("data.xlsx"));
		workbook.write(out);
		out.close();
		System.out.println("data.xlsx written succesfully");

	}

}
