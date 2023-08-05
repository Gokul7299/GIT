package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;

public class Day3 {

	public static void main(String[] args) throws AWTException {
		
		
		
System.setProperty("webdriver.edge.driver", "E:\\msedgedriver.exe");
EdgeOptions o = new EdgeOptions(); 

			WebDriver d = new EdgeDriver(o);
		 d.get("http:\\www.facebook.com");
		
		d.navigate().refresh();
		Actions ac = new Actions(d);
		WebElement user = d.findElement(By.xpath("//input[@type='text']"));
	
		ac.sendKeys(user,"Selenium").build().perform();
		
		ac.doubleClick(user).build().perform();
		ac.contextClick(user).build().perform();
		Robot r = new Robot();
		for (int i = 0; i < 1; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
				
		}
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		
		
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
		
		
		
		
		
		
		
		
		
		

	}

}
