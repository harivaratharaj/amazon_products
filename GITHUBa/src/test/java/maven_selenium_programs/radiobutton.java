package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver a;
System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
a=new ChromeDriver();
a.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
a.manage().window().maximize();
WebElement r=a.findElement(By.xpath("//*[@id=\"post-body-4458201555825921246\"]/div/input[1]"));
r.click();
Thread.sleep(1000);
WebElement g=a.findElement(By.name("green"));
g.click();
Thread.sleep(1000);
WebElement b=a.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/main/div/div[1]/div/article/div/div/div[3]/div[1]/div/input[5]"));
b.click();
Thread.sleep(1000);
WebElement m=a.findElement(By.name("mumbai"));
m.click();
Thread.sleep(2000);
a.quit();	}

}
