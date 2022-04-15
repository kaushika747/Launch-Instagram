package LaunchInstagramLoginPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLoginPage {
	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver", 
				"D:\\DXC Selenium Automation Testing\\Launch Instagram\\Selenium Browser Jars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //creating instance 
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
	}

}
