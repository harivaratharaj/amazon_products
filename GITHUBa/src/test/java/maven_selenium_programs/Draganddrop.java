package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("https://demo.anhtester.com/drag-and-drop-demo.html");
	       a.manage().window().maximize();
	       WebElement p1=a.findElement(By.xpath("//*[@id=\"todrag\"]/span[1]"));
	       WebElement trash1=a.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
	       
	       WebElement p2=a.findElement(By.xpath("//*[@id=\"todrag\"]/span[2]"));
	       //WebElement trash2=a.findElement(By.xpath("//*[@id=\"mydropzone\"]"));
	       
	       WebElement p3=a.findElement(By.xpath("//*[@id=\"todrag\"]/span[3]"));
	       //WebElement trash3=a.findElement(By.id("mydropzone"));
	       
	       Actions d=new Actions(a);
	       d.dragAndDrop(p1, trash1).build().perform();
	       //Thread.sleep(1000);
	       d.dragAndDrop(p2, trash1).build().perform();
	      // Thread.sleep(1000);
	       d.dragAndDrop(p3, trash1).build().perform();
	       Thread.sleep(5000);
	       a.quit();
	}

}
