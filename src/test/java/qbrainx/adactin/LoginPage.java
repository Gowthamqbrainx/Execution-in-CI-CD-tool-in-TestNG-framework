package qbrainx.adactin;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends UtilityClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (id = "username")
	private List<WebElement> user;
	
	@FindBy (id = "password")
	private List<WebElement> pass;
	
	@FindBy (id = "login")
	private List<WebElement> login;

	public List<WebElement> getUser() {
		return user;
	}

	public List<WebElement> getPass() {
		return pass;
	}

	public List<WebElement> getLogin() {
		return login;
	}
	
	}
