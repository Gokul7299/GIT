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

public class FaceBook extends Codes {
	
	Codes c = new Codes(); 
	Facebookpage pom = new Facebookpage();
	@Given("user launchBrowser {string}")
	public void user_launch_browser(String url) {
	   
		c.launch(url);
			
			}
	
	@When("user runs for a scenario")
	public void user_runs_for_a_scenario() {
	   System.out.println("bAcground run");
	}
		
	@When("user enters firstname {string}")
	public void user_enters_firstname(String string) throws InterruptedException {
	   Thread.sleep(1000);
		pom.getCreateaccountclick().click();
		 Thread.sleep(5000);
		 pom.getFirstname().sendKeys(string);
	}

	@When("user enters lastname  {string}")
	public void user_enters_lastname(String string) {
		pom.getLastname().sendKeys(string);
	}

	@When("user enters phno {string}")
	public void user_enters_phno(String string) {
		pom.getPhno().sendKeys(string);
	}

	@When("user enters password {string}")
	public void user_enters_password(String string) {
	   
		pom.getPassword().sendKeys(string);
	}

	@When("user selects dob {string}{string}{string}")
	public void user_selects_dob(String day,String month,String year) {
		WebElement wday= pom.getDay();
		WebElement wmonth= pom.getMonth();
		WebElement wyear = pom.getYear();
	   Select sel = new Select(wday);
	  sel.selectByValue(day);
	  sel = new Select(wmonth);
	  sel.selectByVisibleText(month);
	  sel = new Select(wyear);
	  sel.selectByVisibleText(year);
	   
	}

	@When("user selects gender")
	public void user_selects_gender() {
		
		pom.getGender().click();
		 
	}

	@When("user creates account {string}")
	public void user_creates_account(String name) throws IOException {
	    TakesScreenshot pic = (TakesScreenshot)d;
	    File source = pic.getScreenshotAs(OutputType.FILE);
	    String file = "C:\\Users\\Gokul\\eclipse-workspace\\EbayCucum\\src\\test\\Before"+name+".png";
	    File destination = new File(file);
		FileUtils.copyFile(source, destination);
		pom.getCreateacc().click();
		
		
		
	}

	@Then("I validate the outcomes {string}")
	public void i_validate_the_outcomes(String name) throws IOException, InterruptedException {
		Thread.sleep(5000);
		TakesScreenshot pic = (TakesScreenshot)d;
	    File source = pic.getScreenshotAs(OutputType.FILE);
	    String file = "C:\\Users\\Gokul\\eclipse-workspace\\EbayCucum\\src\\test\\After"+name+".png";
		File destination = new File(file);
		FileUtils.copyFile(source, destination);
		Thread.sleep(3000);
		
	}

	@When("user print name")
	public void user_print_name() {
	    System.out.println("Namee");
	}

	@Then("user quit")
	public void user_quit() throws InterruptedException {
	   d.quit();
	   Thread.sleep(3000);}

	@Given("user launchBrowsera")
	public void user_launch_browsera() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions o = new ChromeOptions();
		o.addArguments("start-maximized");
		d = new ChromeDriver(o);
		d.get("https://www.amazon.in/");
	}

	
	@When("user selects Mobile Name")
	public void user_selects_mobile_name() {
	    System.out.println("iphone");
	}

	@When("user searches Mobile")
	public void user_searches_mobile() throws InterruptedException {
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[@id='nav-xshop']//a[text()='Mobiles']")).click();
		d.findElement(By.xpath("//label[@for='apb-browse-refinements-checkbox_7']//i[@class='a-icon a-icon-checkbox']")).click();
		d.findElement(By.xpath("//input[@id='low-price']")).sendKeys("60000");
		d.findElement(By.xpath("//input[@id='high-price']")).sendKeys("70000");
		d.findElement(By.xpath("//span[@id='a-autoid-1']")).click();
	}

	@When("user gets Details")
	public void user_gets_details() {
		WebDriverWait wa = new WebDriverWait(d, Duration.ofSeconds(150));
		List ll = new LinkedList();
		wa.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']")));
		List l1 = d.findElements(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
		List l2 = d.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		for (int i = 1; i < l1.size(); i++) {
			
			WebElement ed;
			ed = (WebElement) l1.get(i);
			String mob = ed.getText();
			WebElement ed1;
			ed1 = (WebElement) l2.get(i);
			String mob1 = ed1.getText();
			
			if (mob.contains("Blue") && mob.contains("128 GB") && mob.contains("14") ) {
				ll.add(mob);
				ll.add(mob1);
				ed.click();
				break;
			}
			
		}
	}

	@Then("I validate the outcomesff")
	public void i_validate_the_outcomesff() {
	   d.quit();
	}

	
	
	
}
