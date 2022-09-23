package maven_selenium_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class datadriven {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver;
System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
	driver=new ChromeDriver();
	
	driver.navigate().to("http://brm.tremplintech.in/");
	driver.manage().window().maximize();
	FileInputStream file=new FileInputStream("C:\\Users\\hari\\Desktop\\datadriven.xls");
	Workbook w=Workbook.getWorkbook(file);
	Sheet s=w.getSheet(0);
	for(int i=1;i<=8;i++)
	{
		System.out.println("valid");
		String username=s.getCell(0,i).getContents();
		String password=s.getCell(1,i).getContents();
		driver.findElement(By.cssSelector("input#txt_unam")).sendKeys(username);
		driver.findElement(By.cssSelector("input#txt_pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Button3")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='LOGOUT']")).click();
	}
	for(int i=9;i<=16;i++)
	{
		System.out.println("invalid");
		String username=s.getCell(0,i).getContents();
		String password=s.getCell(1,i).getContents();
		driver.findElement(By.cssSelector("input#txt_unam")).sendKeys(username);
		driver.findElement(By.cssSelector("input#txt_pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#Button3")).click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	driver.close();
	}
	}
}
