package freamWrk;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelexmple {
File f;
FileInputStream fi;
XSSFWorkbook wk;

XSSFSheet sheeto;

public excelexmple(String path) throws IOException {
	f=new File(path);
	fi=new FileInputStream(f);
	wk=new XSSFWorkbook(fi);
	
	
}
public String getsheet(String s,int r,int c) {
	sheeto=wk.getSheet("sheet1");
	String g=sheeto.getRow(r).getCell(c).getStringCellValue();
	
	return g;
	
}
public int getrow(String sheetname) {
	sheeto=wk.getSheet("sheet1");
	int row=sheeto.getLastRowNum();
	row=row+1;
	return  row;
	
}

	

public int getcolumn(String sheetnamt) {
	// TODO Auto-generated method stub
	sheeto=wk.getSheet("sheet1");
	short col=sheeto.getRow(0).getLastCellNum();
	return col;
}
 
}
