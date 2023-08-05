package sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Seleniumm {
	
	static WebDriver driver;
	static EdgeOptions option;
	
	// launch browser by getting a url in place of v
		public static WebDriver launchBrowser() {
			System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
			EdgeOptions options = new EdgeOptions();
			WebDriver d = new EdgeDriver(options);
			option = options;
			d.manage().window().maximize();
		    d.get("http://www.google.com");
		   driver=d;
		   return driver;
		}
	
	// launch browser by getting a url in place of v
	public static WebDriver launchBrowser(String v) {
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		EdgeOptions options = new EdgeOptions();
	    WebDriver d = new EdgeDriver(options);
		option = options;
		d.manage().window().maximize();
	    d.get(v);
	    driver=d;
	    return driver;
	}
	
	
	public static void createAndPutExcelInput(String location,String sheet,int row ,int cell,String value) throws IOException {
		
	File e = new File(location);
	Workbook r = new XSSFWorkbook();
    Sheet se = r.createSheet(sheet);
	Row re = se.createRow(row);
	Cell ce = re.createCell(cell);
	ce.setCellValue(value);
	FileOutputStream f3 = new FileOutputStream(e);
	r.write(f3);
	f3.close();
}
	
	public static String readExcelCell(String location,String sheet,int row ,int cell) throws IOException
	{
		File e = new File(location);
		FileInputStream f5 = new FileInputStream(e);
		Workbook ww = new XSSFWorkbook(f5);
		Sheet s = ww.getSheet(sheet);
		Row rr = s.getRow(row);
		Cell cc = rr.getCell(cell);
		String v = cc.getStringCellValue();
		f5.close();
		return v;
		
	}
	
	public static void writeExcelCell(String location,String sheet,int row ,int cell,String value) throws IOException
	{
		File e = new File(location);
	
		FileInputStream f5 = new FileInputStream(e);
		Workbook ww = new XSSFWorkbook(f5);
		Sheet s = ww.getSheet(sheet);
	try {
		 Row rr = s.getRow(row);
		 
		 
			
			 Cell cc1 = rr.createCell(cell);
			 cc1.setCellValue(value);
			 FileOutputStream f4 = new FileOutputStream(e);
			 ww.write(f4);
		   f4.close();
	}
	   
	   
	   catch (Exception e2) {
		   Row rr1 = s.createRow(row);
			 Cell cc1 = rr1.createCell(cell);
			 cc1.setCellValue(value);
			 FileOutputStream f4 = new FileOutputStream(e);
			 ww.write(f4);
		   f4.close();
	}
		
	}
	
	
	
	
	

}
 