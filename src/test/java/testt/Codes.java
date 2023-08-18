package testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Codes {

	static WebDriver d;
	public void launch(String url) {
	WebDriverManager.chromedriver().setup();
	ChromeOptions o = new ChromeOptions();
	o.addArguments("start-maximized");
	d = new ChromeDriver(o);
	d.get(url);
	}
	
	
	
	
}
