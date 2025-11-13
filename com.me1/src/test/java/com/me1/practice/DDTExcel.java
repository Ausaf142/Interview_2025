package com.me1.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class DDTExcel {
@Test
public void ddtexcel() throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./sel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	Row row = sheet.getRow(0);
	Cell cell = row.getCell(1);
	String data = cell.getStringCellValue();
	System.out.println(data);
	Cell cellvalue = row.createCell(2);
	cellvalue.setCellValue("chotala");
	FileOutputStream fos = new FileOutputStream("./sel.xlsx");
	wb.write(fos);
	
	
	
}
}
