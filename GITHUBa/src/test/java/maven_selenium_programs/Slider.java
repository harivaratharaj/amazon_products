package maven_selenium_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Slider {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver a;
	       System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	       a=new ChromeDriver();
	       a.get("https://jqueryui.com/slider/#multiple-vertical");
	       a.manage().window().maximize();
	       a.switchTo().frame(0);
	       WebElement slider=a.findElement(By.xpath("//*[@id=\"master\"]/span"));
	     
		for(int i=1;i<=100;i++)
	       {
			slider.sendKeys(Keys.ARROW_RIGHT);
	       }
	       Thread.sleep(2000);
	for(int i=100;i>=30;i--)
	{
		slider.sendKeys(Keys.ARROW_LEFT);
	}
    Thread.sleep(2000);
    
    WebElement sliderv1=a.findElement(By.xpath("//*[@id=\"eq\"]/span[1]/span"));
    
	for(int i=1;i<=100;i++)
       {
		sliderv1.sendKeys(Keys.ARROW_UP);
       }
       Thread.sleep(2000);
for(int i=100;i>=30;i--)
{
	sliderv1.sendKeys(Keys.ARROW_DOWN);
}
Thread.sleep(2000);

WebElement sliderv2=a.findElement(By.xpath("//*[@id=\"eq\"]/span[2]/span"));

for(int i=1;i<=100;i++)
   {
	sliderv2.sendKeys(Keys.ARROW_UP);
   }
   Thread.sleep(2000);
for(int i=100;i>=30;i--)
{
sliderv2.sendKeys(Keys.ARROW_DOWN);
}
Thread.sleep(2000);

WebElement sliderv3=a.findElement(By.xpath("//*[@id=\"eq\"]/span[3]/span"));

for(int i=1;i<=100;i++)
   {
	sliderv3.sendKeys(Keys.ARROW_UP);
   }
   Thread.sleep(2000);
for(int i=100;i>=30;i--)
{
sliderv3.sendKeys(Keys.ARROW_DOWN);
}
Thread.sleep(2000);

WebElement sliderv4=a.findElement(By.xpath("//*[@id=\"eq\"]/span[4]/span"));


	for(int i=20;i>=1;i--)
   {
	sliderv4.sendKeys(Keys.ARROW_DOWN);
   }
   Thread.sleep(2000);
   for(int i=1;i<=100;i++)
{
sliderv4.sendKeys(Keys.ARROW_UP);
}
Thread.sleep(2000);
a.quit();
	}

}
