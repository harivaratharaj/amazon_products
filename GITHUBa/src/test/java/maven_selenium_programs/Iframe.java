package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver driver;
       System.setProperty("webdriver.chrome.driver","C:\\Users\\hari\\eclipse-workspace\\MAVENPROJECTS\\Chromedriver path\\chromedriver.exe");
       driver=new ChromeDriver();
       driver.get("https://www.rediff.com/");
       driver.manage().window().maximize();
       driver.switchTo().frame("moneyiframe");
       Thread.sleep(5000);
       String nse=driver.findElement(By.xpath("//*[@id=\"nseindex\"]")).getText();
       System.out.println(nse);
       Thread.sleep(1000);
       String nse1=driver.findElement(By.xpath("//*[@id=\"nseindex\"]")).getText();
       System.out.println(nse1);
       Thread.sleep(1000);
       driver.switchTo().parentFrame();
       driver.findElement(By.xpath("/html/body/div[5]/ul/li[5]/a")).click();
       Thread.sleep(1000);
       driver.getPageSource();
       driver.close();
	}

}
