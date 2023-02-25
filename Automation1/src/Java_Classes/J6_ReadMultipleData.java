package Java_Classes;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class J6_ReadMultipleData {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./Data/Book2.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	int row = wb.getSheet("Invalid Login").getLastRowNum();
	for (int i = 0; i <=row; i++) {
		String un = wb.getSheet("Invalid Login").getRow(i).getCell(0).getStringCellValue();
		String pw = wb.getSheet("Invalid Login").getRow(i).getCell(1).getStringCellValue();
		System.out.println(un+" "+pw);
	}
}
}
