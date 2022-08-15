package maven_selenium_programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ALert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("http://brm.tremplintech.in/web_pages/login.aspx");
	       a.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("Sylix");
	       a.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("amin");
	       a.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	       
	       Alert q=a.switchTo().alert();
	       System.out.println(q.getText());
	       q.accept();
	       Thread.sleep(2000);
	       a.findElement(By.xpath("//*[@id=\"txt_unam\"]")).sendKeys("Sylix");
	       a.findElement(By.xpath("//*[@id=\"txt_pass\"]")).sendKeys("admin");
	       a.findElement(By.xpath("//*[@id=\"Button3\"]")).click();
	       Thread.sleep(2000);
	       a.quit();


	}

}
