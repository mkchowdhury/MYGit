package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PFRediffLoginPage
{
	
	By Username=By.name("login");
	By Password=By.name("passwd");
	By Checkbox=By.name("remember");
	By Go=By.name("proceed");
	
	
	WebDriver driver;
	public PFRediffLoginPage(ChromeDriver driver) {
		this.driver=driver;
	}
		
	public WebElement EmailId() {
		return driver.findElement(Username);
	}
	public WebElement Password() {
		return driver.findElement(Password);
	}
	public WebElement Checkbox() {
		return driver.findElement(Checkbox);
	}
	public WebElement submit() {
		return driver.findElement(Go);
	}
	
}
	