package freamWrk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readerclssex {
	public static void main(String[] args) throws IOException {
		File path=new File("C:\\Users\\ADMIN\\Desktop\\companyname.xlsx");
		FileInputStream n=new FileInputStream(path);
		XSSFWorkbook wbk=new XSSFWorkbook(n);
		XSSFSheet sheet=wbk.getSheet("sheet1");
		
	String h=sheet.getRow(17).getCell(0).getStringCellValue();
		System.out.println(h);
		int u=sheet.getLastRowNum()+1;
		System.out.println("total row count"+u);
		
		
	}

}
