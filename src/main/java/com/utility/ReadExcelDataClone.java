package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataClone {
private static void getParticularCell(int rows,int column) throws Throwable {
		File file =new File("E:\\Data driven class\\Data driven class.xlsx");	
	    Workbook book = new XSSFWorkbook(file);
	    Sheet sheet=book.getSheetAt(0);
	    Row row=sheet.getRow(3);
	    Cell cell=row.getCell(2);
	    double  data  = cell.getNumericCellValue();
	    System.out.println(data);
	  //String stringData=cell.getStringCellValue();
	  //System.out.println(stringData);
	    
        // DataFormatter class its help from the each cell into string
	    DataFormatter dataFormat =new DataFormatter();
	    String testData=dataFormat.formatCellValue(cell);
	    System.out.println(testData);
	   // return testData;
		}
private static void getParticularRowMultipleCell() throws Throwable, IOException {
		File file =new File("E:\\Data driven class\\Data driven class.xlsx");
		 Workbook book = new XSSFWorkbook(file);   
		 Sheet sheet=book.getSheet("Sheet1");
		 int noOfRows=sheet.getLastRowNum();
		 System.out.println("No of Rows:"+noOfRows);
		 
		 short noOfCells=sheet.getRow(0).getLastCellNum();
		 System.out.println("No Of Cells:"+noOfCells);
		 
		 Row row= sheet.getRow(1);
		 for(int i=0; i<noOfCells;i++) {
			 Cell cell=row.getCell(i);
			 DataFormatter dataFormat =new DataFormatter();
			 String data=dataFormat.formatCellValue(cell);
			 System.out.println(data);
		 }}		 
private static void getAllData() throws InvalidFormatException, IOException {
	File file =new File("E:\\Data driven class\\Data driven class.xlsx");	
    Workbook book = new XSSFWorkbook(file);
    Sheet sheet=book.getSheet("Sheet1");
    int noOfRows = sheet.getLastRowNum();
    System.out.println("No of Cells:"+noOfRows);
    short noOfCells=sheet.getRow(0).getLastCellNum();
    System.out.println("No of Cells:"+noOfCells);
    for(int i=1; i<=noOfRows;i++) {  //row
		 Row row =sheet.getRow(i);
		 for (int j=0; j< noOfCells; j++) { //cells/column
		 Cell cell=row.getCell(j);
		 
		 DataFormatter dataFormat =new DataFormatter();
		 String testData=dataFormat.formatCellValue(cell);
		 System.out.println(testData);	 
		 }
    }
	}
	public static void main(String[] args) throws Throwable {
		getParticularCell(2,3);
		getParticularRowMultipleCell();
		getAllData();
	}
	}

