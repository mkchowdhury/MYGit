package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectRepository.PFRediffLoginPage;

public class LoginApplication {
@Test
public void getLogin() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\KAMAL\\Downloads\\chromedriver_win32\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	PFRediffLoginPage rd=new PFRediffLoginPage(driver);
	rd.EmailId().sendKeys("asaa@gmail.com");
	rd.Password().sendKeys("12456");
	rd.Checkbox().isSelected();
	rd.submit().click();
}
	
}
