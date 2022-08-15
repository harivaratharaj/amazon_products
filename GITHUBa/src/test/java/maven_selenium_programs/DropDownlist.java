package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownlist {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("https://www.amazon.in/");
	       a.manage().window().maximize();
	       Select d=new Select(a.findElement(By.id("searchDropdownBox")));
	      // d.selectByIndex(5);
	       //d.selectByValue("search-alias=nowstore");
	       d.selectByVisibleText("Beauty");
	       Thread.sleep(5000);
	       a.quit();
	}

}
