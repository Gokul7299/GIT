package testt;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	static WebDriver d;
	
	@Given("user launchBrowser")
	public void user_launch_browser() {
	   
			WebDriverManager.chromedriver().setup();
			ChromeOptions o = new ChromeOptions();
			o.addArguments("start-maximized");
			d = new ChromeDriver(o);
			d.get("https://www.facebook.com/");
			
			}
		
	@When("user enters firstname {string}")
	public void user_enters_firstname(String string) throws InterruptedException {
	   Thread.sleep(1000);
		d.findElement(By.xpath("//a[text()='Create new account']")).click();
		 Thread.sleep(1000);
		 d.findElement(By.xpath("//input[@name='firstname']")).sendKeys(string);
	}

	@When("user enters lastname  {string}")
	public void user_enters_lastname(String string) {
		d.findElement(By.xpath("//input[@name='lastname']")).sendKeys(string);
	}

	@When("user enters phno {string}")
	public void user_enters_phno(String string) {
		d.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	   
		d.findElement(By.xpath("(//input[@type='password'])[2]")).sendKeys(string);
	}

	@When("user selects dob {string}{string}{string}")
	public void user_selects_dob(String day,String month,String year) {
		WebElement wday= d.findElement(By.xpath("//select[@title='Day']"));
		WebElement wmonth= d.findElement(By.xpath("//select[@title='Month']"));
		WebElement wyear = d.findElement(By.xpath("//select[@title='Year']"));
	   Select sel = new Select(wday);
	  sel.selectByValue(day);
	  sel = new Select(wmonth);
	  sel.selectByVisibleText(month);
	  sel = new Select(wyear);
	  sel.selectByVisibleText(year);
	   
	}

	@When("user selects gender")
	public void user_selects_gender() {
		
		d.findElement(By.xpath("//label[text()='Male']")).click();
		 
	}

	@When("user creates account {string}")
	public void user_creates_account(String name) throws IOException {
	    TakesScreenshot pic = (TakesScreenshot)d;
	    File source = pic.getScreenshotAs(OutputType.FILE);
	    String file = "C:\\Users\\Gokul\\eclipse-workspace\\EbayCucum\\src\\test\\Before"+name+".png";
	    File destination = new File(file);
		FileUtils.copyFile(source, destination);
		d.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		
		
	}

	@Then("I validate the outcomes {string}")
	public void i_validate_the_outcomes(String name) throws IOException, InterruptedException {
		Thread.sleep(5000);
		TakesScreenshot pic = (TakesScreenshot)d;
	    File source = pic.getScreenshotAs(OutputType.FILE);
	    String file = "C:\\Users\\Gokul\\eclipse-workspace\\EbayCucum\\src\\test\\After"+name+".png";
		File destination = new File(file);
		FileUtils.copyFile(source, destination);
		d.quit();
	}



	
	
	
}
