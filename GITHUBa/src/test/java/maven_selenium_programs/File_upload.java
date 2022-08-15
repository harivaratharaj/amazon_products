package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_upload {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/upload/");
driver.manage().window().maximize();
driver.findElement(By.id("uploadfile_0")).sendKeys("D:\\AUTOMATION\\Selenium syntax");
Thread.sleep(5000);
driver.close();
	}

}
