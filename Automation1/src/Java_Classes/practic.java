package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class practic {
	public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");	
	Workbook wb = WorkbookFactory.create(fis);
	String data = wb.getSheet("Sheet1").getRow(1).getCell(2).toString();
	System.out.println(data);
	FileOutputStream fos = new FileOutputStream("./Data/Book1.xlsx");
	wb.getSheet("Sheet1").getRow(1).getCell(3).setCellValue("abcd");
	wb.write(fos);
	wb.close();
	}
}
