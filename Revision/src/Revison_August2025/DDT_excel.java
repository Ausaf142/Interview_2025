package Revison_August2025;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDT_excel {

public static void main(String[] args) throws IOException {
	FileInputStream fis = new FileInputStream("./sel.xlsx");
	Workbook wb = WorkbookFactory.create(fis);
	Sheet sheet = wb.getSheet("Sheet1");
	Row r = sheet.getRow(0);
	Cell row = r.createCell(2);
	row.setCellValue("hila dala na");
	FileOutputStream fos = new FileOutputStream("./sel.xlsx");
	wb.write(fos);
	String wr = row.getStringCellValue();
	Cell c = r.getCell(1);
	String url = c.getStringCellValue();
	System.out.println(url);
	Row r2 = sheet.getRow(1);
	Cell c2 = r2.getCell(1);
	String un = c2.getStringCellValue();
	System.out.println(un);
	Row r3 = sheet.getRow(2);
	Cell c3 = r3.getCell(1);
	String pw = c3.getStringCellValue();
	System.out.println(pw);
	
	




}
}