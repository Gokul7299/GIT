package sele;

import java.io.*;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;


public class LinkIoSele {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		
		

		File e = new File("E:\\Selenium Project\\ExcelData\\Input2.xlsx");
			Workbook r = new XSSFWorkbook();
	
		Sheet se = r.createSheet("Sheett3");
		Row re = se.createRow(3);
		Cell ce = re.createCell(3);
		ce.setCellValue("http://www.youtube.com");
		FileOutputStream f3 = new FileOutputStream(e);
		r.write(f3);
		f3.close();
	
		FileInputStream f5 = new FileInputStream(e);
		Workbook ww = new XSSFWorkbook(f5);
		Sheet s = ww.getSheet("Sheett3");
		Row rr = s.getRow(3);
		Cell cc = rr.getCell(3);
		String v = cc.getStringCellValue();
		
		System.out.println(v);
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		EdgeOptions option = new EdgeOptions();
		option.addArguments("window-size=500,500");
		WebDriver d = new EdgeDriver(option);
	    d.get(v);
	    v = d.getCurrentUrl();

	    rr= s.createRow(4);
		 cc = rr.createCell(4);
		 cc.setCellValue(v);
		 FileOutputStream f4 = new FileOutputStream(e);
		 ww.write(f4);
	   f4.close();
	
	   
	    
		Thread.sleep(10000);
		d.quit();
		
	
	}
	
	
}
