package testt;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends Codes {
	
	
	Codes c = new Codes();
	@Before
	public void beforeBackground() {
		
		System.out.println("Start Hooks");
		c.launch("https://www.facebook.com/");
		
	}

	@After
	public void afterScenario() {
		
		System.out.println("End Hooks");
		d.quit();
		
	}
	
}
