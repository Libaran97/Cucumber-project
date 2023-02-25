package qsp;

import java.io.IOException;

public class G1_Demo {
	public static void main(String[] args) throws IOException{
		G1_GenericLibrary f = new G1_GenericLibrary();
		String url = f.getPropertyData("Url");
		String un = f.getPropertyData("UN");
		String pw = f.getPropertyData("Pwd");
		System.out.println(url);
		System.out.println(un);
		System.out.println(pw);
		f.setExcelData("Sheet1", 1, 4,"You");
		System.out.println(f.getExcelData("Sheet1", 1, 4));
	}
}
