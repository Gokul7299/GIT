package sele;

import java.io.IOException;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class Day11 {
	
 
	public static void main(String[] args)  {
	
		
		
		System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
		
		
		EdgeOptions options = new EdgeOptions();
	
		WebDriver d = new EdgeDriver(options);
		 d.get("http:\\www.facebook.com");
		
		 
		 WebElement user = d.findElement(By.id("email")) ;
		 user.sendKeys("Welcome");
		 WebElement word = d.findElement(By.id("pass"));
		 word.sendKeys("Welcome");
		 
		 WebElement link = d.findElement(By.partialLinkText("Log")) ;
		 if (link.isEnabled()) {
			 link.click();
			System.out.println("clic");
		}
		 
		 
}
	
	
}
