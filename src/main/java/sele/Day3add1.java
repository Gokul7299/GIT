package sele;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Day3add1 {
	
	public static void main(String[] args) throws AWTException {
		
		WebDriver driver = Seleniumm.launchBrowser("http:\\www.facebook.com");
	driver.findElement(By.xpath("//input[@id='u_0_0_ap']")).click();
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Name");
	
	
		
	
	
	
	
	
	Robot move = new Robot();
		
		for (int i = 0; i <= 3; i++) {
			move.keyPress(KeyEvent.VK_TAB);
			move.keyRelease(KeyEvent.VK_TAB);
		}
		
	
		
		
		
		
		
	}

}
