package sele;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;

public class Day5 {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = Seleniumm.launchBrowser("http:\\www.facebook.com");
		WebElement click =  driver.findElement(By.linkText("Create new account"));
		//WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		JavascriptExecutor js =(JavascriptExecutor)driver ;
		
		//Thread.sleep(3000);
		//js.executeAsyncScript("arguments[0].click()", click);
		
		//WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
			//js.executeAsyncScript("attribute[0].setAttribute,('value','Sele')", name);
		
			//js.executeAsyncScript("attribute[0].setAttribute,('style','border:2px solid red;background:yellow')", name);
			
			
		TakesScreenshot k = (TakesScreenshot)driver ;
			
		File src =k.getScreenshotAs(OutputType.FILE);
		File des = new File("D:\\eclipse\\ic.png");
		FileUtils.copyFile(src, des);
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
