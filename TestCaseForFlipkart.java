package Assignment_Test;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestCaseForFlipkart {

	public static void main(String[] args) throws InterruptedException {
      
       //    WebDriverManager.chromedriver().setup();
      //	WebDriverManager.edgedriver().setup();
     //		WebDriver driver=new EdgeDriver();
           WebDriver driver=new ChromeDriver();
           driver.get("https://www.flipkart.com/");
          
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
           driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
        
           driver.findElement(By.name("q")).sendKeys("ipad");
//           driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ipad");
         
           List<WebElement> allSugg = driver.findElements(By.xpath("//span[contains(text(),'ipad')]"));
           int count=allSugg.size();
           System.out.println(count);
//           for(int i=0;i<count;i++)
//           {
//        	   String text=allSugg.get(i).getText();
//        	   System.out.println(text);
//           }
           
            allSugg.get(1).click();
        
          driver.findElement(By.xpath("//div[text()='APPLE iPad (10th Gen) 64 GB ROM 10.9 inch with Wi-Fi+5G (Silver)']")).click();
          
          Set<String> h = driver.getWindowHandles();
          System.out.println(h);
          
          for(String string:h)
          {
        	  driver.switchTo().window(string);
          }
          
      
         driver.findElement(By.xpath("//button[text()='Buy Now']")).click();
         driver.findElement(By.xpath("//input[@class='_2IX_2- _17N0em']")).sendKeys("mkk8001754@gmail.com");
         
	}

}
