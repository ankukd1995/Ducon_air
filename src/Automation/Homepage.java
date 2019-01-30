package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homepage {

	public static void main(String[] args) throws InterruptedException
	
	{		
      
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Homepage home = new Homepage();
		home.navigations(driver);
		home.footerlinks(driver);
		 home.functionality(driver);
		
								
	}
	
	public void navigations(WebDriver driver) throws InterruptedException
	
	{ 
		driver.get("http://duconair.oablab.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		// Clicking on the Shop button
		
		
		driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/shop/']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		// Clicking on the support button
		
		driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/faq/']")).click();
		Thread.sleep(1000);	
		driver.navigate().back();	
		
		// Clicking on the about button
		
		driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/about/']")).click();
		Thread.sleep(1500);	
		driver.navigate().back();
		Thread.sleep(1500);	

		// Clicking on the cart button
		
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/div/ul/li[1]/a")).click();
		Thread.sleep(3000);		
		driver.navigate().back();
		
		// Clicking on the login button
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(3000);		
		driver.navigate().back();
		
		// Scrolling down the page
		Thread.sleep(2000);	
		 Actions a = new Actions(driver);
		 int i=0;
		 while(i<4)
		 
		 {
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 i++;
			 Thread.sleep(1000);	
		 }
		
		 
		 // Hovering over the product
		 
		// a.moveToElement(driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/product/ducon/']"))).build().perform();
		 //Thread.sleep(3000);
		
		 // Click on the shop now button
		 //tagName[attributes='value']
		// driver.findElement(By.cssSelector("a[class='btn-third']]")).click();
		// Thread.sleep(3000);
		 //driver.navigate().back();
		 
		 // Scrollung down the page
		 int j=0;
		 while(j<4)
		 
		 {
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 j++;
			 Thread.sleep(1000);	
		 }
		
	}
		 
		 public void footerlinks(WebDriver driver) throws InterruptedException
		 
		 {
			 
			// Clicking on the Shop button
				
				driver.findElement(By.xpath("//a[@href='/shop']")).click();
				Thread.sleep(3000);
				driver.navigate().back();
				
				
				// Clicking on the support button
				
				driver.findElement(By.xpath("//a[@href='/faq']")).click();
				Thread.sleep(1000);	
				driver.navigate().back();
				
				// Clicking on the about button
				
				driver.findElement(By.xpath("//a[@href='/about/']")).click();
				Thread.sleep(3000);	
				driver.navigate().back();
				
				// Clicking on the Contact
				
				driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
				Thread.sleep(3000);		
				driver.navigate().back();
				
				
				// Clicking on the cart button
				
				driver.findElement(By.xpath("//a[@href='/cart/']")).click();
				Thread.sleep(3000);	
				driver.navigate().back();
				
				// Clicking on the terms
				
				driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();
				Thread.sleep(3000);		
				driver.navigate().back();
				Thread.sleep(2000);	
				
               // Clicking on the privacy policy
				
				driver.findElement(By.xpath("//a[contains(text(),'Privacy Policies')]")).click();
				Thread.sleep(3000);		
				driver.navigate().back();
				
				
				// Clicking on the footer logo
				Thread.sleep(2000);	
				driver.findElement(By.xpath("//span[@class='bg-footer-logo']")).click();
				 
		 }		 
		 	
		 public void functionality(WebDriver driver) throws InterruptedException
		 {
			
			 //driver.get("http://duconair.oablab.com/");
		 	//driver.manage().window().maximize();
			 Thread.sleep(2000);
			 Actions e = new Actions(driver);
			 e.sendKeys(Keys.PAGE_DOWN).build().perform();
			 
			 // Clicling on all the animations
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//span[@class='common-style bg-reason-allergy']")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//span[@class='common-style bg-reason-pet']")).click();
			 Thread.sleep(1000);
			 
			 driver.findElement(By.xpath("//span[@class='common-style bg-reason-asthma']")).click();
			 Thread.sleep(1000); 
			
			 driver.findElement(By.xpath("//span[@class='common-style bg-reason-smoke']")).click();
			 Thread.sleep(1000);
			 
			 e.sendKeys(Keys.PAGE_DOWN).build().perform();
			 
			 // Clicking on the shop button
			 driver.findElement(By.xpath("//div[@class='center-image-section-left']//a[@class='btn-third'][contains(text(),'SHOP NOW')]")).click();
			 Thread.sleep(2000);
			 driver.navigate().back();
			 Thread.sleep(1000);
			 int i=0;
			 while(i<3)
			 {
			 e.sendKeys(Keys.PAGE_DOWN).build().perform();
			 i++;
			 Thread.sleep(1000);
			 }
			 
			 
		 }
	}


