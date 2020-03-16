package excelUtility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReadWrite
{
	XSSFWorkbook workbook;
	XSSFSheet sheet;
	FileInputStream inputStream;
	FileOutputStream outputStream;
	
	public String excelRead(String filepath, int row, int col) throws IOException
	{
		//FileInputStream fi=new FileInputStream(new File("/Users/shahir/eclipse-workspace/Adidas_Project/contact_us.xlsx")); 
		FileInputStream fi=new FileInputStream(new File(filepath)); 
		@SuppressWarnings("resource")
		XSSFWorkbook workbook= new XSSFWorkbook(fi);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		XSSFRow rows = sheet.getRow(row);
		XSSFCell cell = rows.getCell(col);
		DataFormatter df = new DataFormatter();
		String user = df.formatCellValue(cell);
		//String user = cell.getStringCellValue();
		fi.close();
		return user;
	}
	
	public void excelWrite(String filepath, String data) throws IOException
	{
		inputStream = new FileInputStream(new File(filepath));
		workbook = new XSSFWorkbook(inputStream);
		sheet = workbook.getSheet("Sheet1");	
		int newRowNumber = sheet.getLastRowNum() + 1;
		int cellnum = 0;
		XSSFRow row = sheet.createRow(newRowNumber);
		XSSFCell cell = row.createCell(cellnum++);
		cell.setCellValue(data);
		inputStream.close();
		outputStream = new FileOutputStream(new File(filepath));
		workbook.write(outputStream);
        outputStream.close();
	}
}