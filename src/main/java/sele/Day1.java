package sele;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;


public class Day1 {
	public static void main(String[] args) throws  IOException, InterruptedException {
	WebDriver driver;
	driver = Seleniumm.launchBrowser("http://www.youtube.com");
	Seleniumm.option.addArguments("window-size=500,500");
    Seleniumm.createAndPutExcelInput("E:\\Selenium Project\\ExcelData\\IO.xlsx", "Data", 1, 3, "http://www.google.com");
	String url = Seleniumm.readExcelCell("E:\\Selenium Project\\ExcelData\\IO.xlsx", "Data", 1, 3);
	driver.get(url);
	Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\IO.xlsx","Data", 1, 4,driver.getCurrentUrl());
	Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\IO.xlsx","Data", 1, 5,driver.getTitle());
	System.out.println("conn");
	driver.quit();
	Thread.sleep(0);
	driver = Seleniumm.launchBrowser("http://www.youtube.com");
	Seleniumm.driver.quit();
}
}