package qbrainx.adactin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExecutionClass extends UtilityClass {

	/*LoginPage page;
	
	@BeforeClass
	private void launch() {
		browserLaunch();
	}
	
	@BeforeMethod
	private void executionStarts() {
		time();
	}
	
	@Test
	private void Url() {
		page = new LoginPage();
		url("https://adactin.com/HotelAppBuild2/");
		enteredUrl();
		title();
		fill(page.getUser().get(0), "GOWTHAMK");
		fill(page.getPass().get(0), "Myvizhi@1194");
		btnclk(page.getLogin().get(0));
		
	}
	

	@AfterMethod
	private void executionEnds() {
		time();
	}
	*/

	public static WebDriver driver;
	
	@Test
	private void testCase1() {
		System.setProperty("webdriver.chrome.driver", "E:\\Gowtham\\Oxygen workspace\\testNGSampleForJenkins\\Drivers 80\\chromedriver.exe");
		ChromeOptions popups = new ChromeOptions();
		ChromeOptions disable = popups.addArguments("--disable-notifications");
		driver = new ChromeDriver(disable);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://adactin.com/HotelAppBuild2/");
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("GOWTHAMK");
		driver.findElement(By.id("password")).sendKeys("Myvizhi@1194");
		driver.findElement(By.id("login")).click();
		
	}
	
}
