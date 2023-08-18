package testt;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BrokenLink extends Codes {
	
	
	
	
	public static void main(String[] args) throws MalformedURLException, IOException {
		Codes f = new Codes();
	f.launch("https://www.amazon.com/");	
	
	int i = 0;
	List<WebElement> links = d.findElements(By.tagName("link"));
	System.out.println(links.size());
	Iterator<WebElement> link = links.iterator();
	while(link.hasNext()) {
		i++;
		String href = link.next().getAttribute("href"); 
		if (href == "" || href == null) {
			
			System.out.println("link in broken"+"  "+i+" "+href);
			
		}	
		else if ( !href.startsWith("https://www.amazon.com")) {
			System.out.println("not related "+href);
			
		} else {
HttpURLConnection httt = (HttpURLConnection)(new URL(href).openConnection());
httt.setRequestMethod("HEAD");
httt.connect();
int resonseCode=httt.getResponseCode();
if (resonseCode==200) {
	System.out.println("not a broken link");
} else {System.out.println(" broken link "+"error "+resonseCode+" "+i);}

		}
		
		
	}
	
		
		
		
		
		
		
		
	}

}
