package maven_selenium_programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Rightclick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("https://demo.guru99.com/test/simple_context_menu.html");
	       a.manage().window().maximize();
	      
	       WebElement q=a.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
	       Actions rc=new Actions(a);
	       rc.contextClick(q).perform();
	       
	       WebElement edit=a.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span"));
	       edit.click();
	      
	       Alert al=a.switchTo().alert();
	       System.out.println(al.getText());
	       al.accept();
	       
	       Thread.sleep(2000);
	       a.close();
	}

}
