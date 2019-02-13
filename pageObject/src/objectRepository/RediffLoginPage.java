package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RediffLoginPage {

	By Username=By.name("login");
	By Password=By.name("passwd");
	By Checkbox=By.name("remember");
	By Go=By.name("proceed");
	
	
	WebDriver driver;
	public RediffLoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
		
	public WebElement getEmailId() {
		return driver.findElement(Username);
	}
	public WebElement getPassword() {
		return driver.findElement(Password);
	}
	public WebElement getCheckbox() {
		return driver.findElement(Checkbox);
	}
	public WebElement getsubmit() {
		return driver.findElement(Go);
	}
}
	