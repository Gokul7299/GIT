package sele;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Framess {
	
	public static void main(String[] args) {
		
	WebDriver d = Seleniumm.launchBrowser("https://chercher.tech/practice/frames");
	d.switchTo().frame("frame1");
	WebElement box = d.findElement(By.xpath("//b[@id='topic']"));
	System.out.println(box.getText());
	d.switchTo().frame("frame3");
	d.findElement(By.id("a")).click();
	
	d.switchTo().defaultContent();
	List<WebElement> l = new ArrayList<WebElement>();
	l=d.findElements(By.tagName("iframe"));
	System.out.println(l.size());
	
	}

}
