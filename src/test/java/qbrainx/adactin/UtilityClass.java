package qbrainx.adactin;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UtilityClass  {
public static WebDriver driver;

public void browserLaunch() {
	System.setProperty("webdriver.chrome.driver", "E:\\Gowtham\\Oxygen workspace\\testNGSampleForJenkins\\Drivers 80\\chromedriver.exe");
	ChromeOptions popups = new ChromeOptions();
	ChromeOptions disable = popups.addArguments("--disable-notifications");
	driver = new ChromeDriver(disable);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
}

public void url(String url) {
	driver.get(url);
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
}

public void enteredUrl() {
	System.out.println(driver.getCurrentUrl());
}

public void title() {
System.out.println(driver.getTitle());

}

public void fill(WebElement e, String text) {
	System.out.println(" The field is enabled " +e.isEnabled());
	e.sendKeys(text);
	System.out.println(e.getAttribute("value"));
}

public void btnclk(WebElement e) {
	System.out.println(" The button is enabled " + e.isEnabled());
	e.click();
	System.out.println("The button is selected" + e.isSelected());
}

public void time() {
	Date time = new Date();
	System.out.println(time);
}

public void staticWait(int time) throws InterruptedException {
	Thread.sleep(time);
}

}
