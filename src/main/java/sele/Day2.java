package sele;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Day2 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		
		
		EdgeOptions options = new EdgeOptions();
		options.addArguments("start-maximized");
	WebDriver d = new EdgeDriver(options);
		 d.get("http:\\www.flipkart.com");
		 
		 Thread.sleep(3000);
		 d.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	
			 WebElement search = d.findElement(By.xpath("//input[@type='text']"));
		 search.sendKeys("Redmi mobile");
		 d.findElement(By.xpath("//button[@type='submit']")).click();	
		
		 Thread.sleep(15000);
		List<WebElement> link = d.findElements(By.xpath("//div[@class='_4rR01T']"));
		List<WebElement> link2 = d.findElements(By.xpath("//div[@class='_30jeq3 _1_WHN1']"));
		Map<String, String> ma = new HashMap<String, String>();
		System.out.println(link.size());
		
		for (int j = 1; j < link.size();j++) {
			 ma.put(link.get(j).getText(), link2.get(j).getText());
			 }
		Seleniumm.createAndPutExcelInput("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", 0, 0, "Mobiles");
		Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", 0, 1, "Price");
		Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", 0, 3, "Total mobiles");
		
		Set<Entry<String, String>> seet = ma.entrySet();
		
		int i=1;
		for (Entry<String, String> entry : seet) {
			System.out.println(entry);
			Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", i, 0, entry.getKey());
			Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", i, 1, entry.getValue());
			i++;}
	
		i=1;
		
		for (WebElement s : link) {
			
			Seleniumm.writeExcelCell("E:\\Selenium Project\\ExcelData\\Set.xlsx", "Sheet1", i, 3, s.getText());
			i++;}
		
		
		
		
		 
		}
		 
		 
		 
		 
		 
		 
		
		 
		 
		 
		
		
		
	}


