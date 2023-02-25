package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class J7_ReadMultipleData2 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/Book2.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		int row = wb.getSheet("Invalid Login").getLastRowNum();
		short cell = wb.getSheet("Invalid Login").getRow(row).getLastCellNum();
		for (int i = 0; i <= row; i++) {
			for (int j = 0; j <cell; j++) {
				String data = wb.getSheet("Invalid Login").getRow(j).getCell(j).getStringCellValue();
				System.out.println(data);
			}	
		}
	}
}
