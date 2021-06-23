package BestBuy;

import java.awt.RenderingHints.Key;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainBrowser {

	//public static void main(String[] args) {
		
		public WebDriver driver;
		String baseUrl ="https://www.bestbuy.com";
		
		
		@BeforeTest
		public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
		@Test
		public void seleniumElements() throws InterruptedException {
			driver.get(baseUrl);
			System.out.println(driver.getTitle());
			Thread.sleep(3000);
			
			//WebElement el=driver.findElement(By.xpath("//*[@id=\"input-894e7898-2f61-440e-9555-de57c05b19f1\"]"));
						//el.sendKeys("sayedsiddeque@gmail.com");
						driver.findElement(By.xpath("//*[@id=\"widgets-view-email-modal-mount\"]/div/div/div[1]/div/div/div/div/button")).click();
						Thread.sleep(3000);
		  WebElement elements = driver.findElement(By.xpath("//*[@id=\"gh-search-input\"]"));
					 elements.sendKeys("iPhone");
					 elements.sendKeys(Keys.ENTER);
		
			
		}

   
}
