package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
  public static void main(String[] args) throws IOException {
	File file =new File("E:\\Data driven class\\Data driven class.xlsx");
	FileInputStream fileInput=new FileInputStream(file);
	Workbook book=new XSSFWorkbook(fileInput);
	
	book.getSheet("Students").createRow(0).createCell(0).setCellValue("Kavin");
	book.getSheet("Students").getRow(0).createCell(1).setCellValue("L&%456");
	
	FileOutputStream fileOutput = new FileOutputStream(file);
	book.write(fileOutput);
	book.close();
	System.out.println("---success---");
	
	
}
}
