package sele;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Srt {


	public static void main(String[] args)  {
		
		
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		
		WebDriver d = new EdgeDriver();
		d.manage().window().maximize();
	    d.get("http://www.google.com");
	
	}
}
