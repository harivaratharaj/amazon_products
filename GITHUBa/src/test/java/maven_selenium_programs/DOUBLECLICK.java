package maven_selenium_programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DOUBLECLICK {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("https://demo.guru99.com/test/simple_context_menu.html");
	       a.manage().window().maximize();
	       Actions dc=new Actions(a);
	       WebElement doublec=a.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
	       dc.doubleClick(doublec).perform();
	       Alert q=a.switchTo().alert();
	       System.err.println("Print the alert msg "+q.getText());
	       q.accept();
	       Thread.sleep(2000);
	       a.quit();
	}

}
