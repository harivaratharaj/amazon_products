package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkbox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver a;
       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
       a=new ChromeDriver();
       a.get("https://selenium08.blogspot.com/2019/07/check-box-and-radio-buttons.html");
       a.manage().window().maximize();
       WebElement r=a.findElement(By.name("color"));
       r.click();
       Thread.sleep(1000);
       WebElement b=a.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[3]"));
       b.click();
       Thread.sleep(1000);
       WebElement g=a.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[5]"));
       g.click();
       Thread.sleep(1000);
       WebElement p=a.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/input[6]"));
       p.click();
       Thread.sleep(1000);
       WebElement m=a.findElement(By.xpath("//*[@id=\"post-body-7702345506409447484\"]/div/div/input[2]"));
       m.click();
       Thread.sleep(5000);
       a.quit();
       
	}

}
