package testPackg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

//import org.apache.poi.hssf.usermodel.HSSFSheet;
//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReaddata {
	
	public static ArrayList<String> excelRead(int colNum) throws IOException,FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("D:\\Practice\\SeleneseCode\\1stcode\\src\\testData\\TestData.xlsx");
		//@SuppressWarnings("resource")
		//@SuppressWarnings("resource")
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet2");
		
		Iterator<Row> Row = sheet.iterator();
		
		Row.next();
		ArrayList<String> List = new ArrayList<String>();
		while (Row.hasNext())
			{
				List.add(Row.next().getCell(colNum).getStringCellValue());
			}
		System.out.println("List : " + List);
		
		wb.close();
		return List;
	}

	

}
