import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_connection {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
        XSSFWorkbook workbook=new XSSFWorkbook();
        FileOutputStream out=new FileOutputStream(new File("Trial.xlsx"));
        workbook.write(out);
        out.close();
        System.out.println("Trial.xlsx written succesfuly");
	}

}
