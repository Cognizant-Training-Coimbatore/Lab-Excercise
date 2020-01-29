package java8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		XSSFWorkbook e=new XSSFWorkbook();
		FileOutputStream out =new FileOutputStream("sample.xlsx");
		e.write(out);
		out.close();
		System.out.println("sample.xlsx written successfully");
	}

}
