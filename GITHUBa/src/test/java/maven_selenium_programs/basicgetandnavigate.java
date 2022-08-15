package maven_selenium_programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class basicgetandnavigate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
a=new ChromeDriver();
a.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
a.manage().window().maximize();
Thread.sleep(2000);
a.navigate().back();
Thread.sleep(2000);
a.quit();
	}

}
