package sample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Apache_Poi {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook wk=new XSSFWorkbook();
		FileOutputStream out=new FileOutputStream(new File("sample.xlsx"));
		wk.write(out);
		out.close();
		System.out.println("File Created succesfully");
	}

}
