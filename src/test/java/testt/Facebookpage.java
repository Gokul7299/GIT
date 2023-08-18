package testt;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage extends Codes {
	
	
	public Facebookpage() {
		
		PageFactory.initElements(d, this);
		
	}

	@FindBy(xpath="//a[text()='Create new account']")
	private WebElement createaccountclick;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	@FindBy(xpath="//input[@name='reg_email__']")
	private WebElement phno;
	@FindBy(xpath="//select[@title='Day']")
	private WebElement day;
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password;
	@FindBy(xpath="//select[@title='Month']")
	private WebElement month;
	@FindBy(xpath="//select[@title='Year']")
	private WebElement year;
	
	@FindBy(xpath="//label[text()='Male']")
	private WebElement gender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	private WebElement createacc;

	public WebElement getCreateaccountclick() {
		return createaccountclick;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getPhno() {
		return phno;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getCreateacc() {
		return createacc;
	}
	
	
	
	
	
	
}
