package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tool_tip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		   WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("http://leafground.com/pages/tooltip.html");
	       a.manage().window().maximize();
	       Actions q=new Actions(a);
	       WebElement z=a.findElement(By.id("age"));
	       Thread.sleep(2000);
	       q.moveToElement(z).perform();
	       Thread.sleep(2000);
	       z.sendKeys("harivaratharaj");
	       Thread.sleep(2000);
	       a.close();
	}

}
