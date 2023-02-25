package qsp;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class J4_HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/Book1.xlsx");
		Workbook web = WorkbookFactory.create(fis);
		String data = web.getSheet("Sheet1").getRow(1).getCell(2).toString();
		System.out.println(data);
	}
}
