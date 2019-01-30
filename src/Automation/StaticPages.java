package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class StaticPages {

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		StaticPages stac = new StaticPages();
		stac.contact(driver);
		stac.privacy(driver);
		stac.terms(driver);

	}

	public void contact(WebDriver driver) throws InterruptedException
	{
		     driver.get("http://duconair.oablab.com/");
			 driver.manage().window().maximize();
			 System.out.println("URL OF THE HOME PAGE:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE HOME PAGE:" + driver.getTitle());
			 Thread.sleep(2000);
			 System.out.println("\n");
			 
			 // Scrolling down the page
			  Actions a = new Actions(driver);
			  int i=0;
			  while(i<6)
			  {
				  a.sendKeys(Keys.PAGE_DOWN).build().perform();
				  i++;
				  Thread.sleep(1000);
			  }	 
			  
			  Thread.sleep(2000);
			  // Clicking on the contact page link at the footer
			  
			  driver.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
			  Thread.sleep(2000);
			  System.out.println("URL OF THE CONTACT PAGE:" + driver.getCurrentUrl());
			  System.out.println("TITLE OF THE CONTACT PAGE:" + driver.getTitle());
			  System.out.println("\n");
			  Thread.sleep(2000);
			  
			  //Scrolling on the contact page
			  int j=0;
			  while(j<2)
			  {
				  a.sendKeys(Keys.PAGE_DOWN).build().perform();
				  j++;
				  Thread.sleep(1000);
				  
			  }	 
			  Thread.sleep(2000);
			  // Printing the text on the page
			  System.out.println("Text on the contact page: " + driver.findElement(By.xpath("//div[@class='top-right']")).getText());
			  System.out.println("Contact page is tested");
			  System.out.println("\n");
		  
	}
	
	   public void privacy(WebDriver driver) throws InterruptedException
	
	   {
		   driver.findElement(By.xpath("//a[contains(text(),'Privacy Policies')]")).click();
		   Thread.sleep(2000);
		   System.out.println( "URL OF THE PRIVACY POLICY PAGE:" + driver.getCurrentUrl());
		   System.out.println( "TITLE OF THE PRIVACY POLICY PAGE:" +driver.getTitle());
		   System.out.println("\n");
		   Thread.sleep(2000);
		   Actions b = new Actions(driver);
		   int k=0;
			  while(k<2)
			  {
				  b.sendKeys(Keys.PAGE_DOWN).build().perform();
				  k++;
				  Thread.sleep(1000);
				  
			  }	  
			  Thread.sleep(2000);
			  
			  // Printig the text title of the page
			  System.out.println(" Text Title of the privacy page is:" + driver.findElement(By.xpath("//h1[contains(text(),'Privacy Policies')]")).getText());
			  System.out.println("\n");
			  // Printing the first paragraph
			  System.out.println("First paragraph of the page:" + driver.findElement(By.xpath("//p[contains(text(),'Sed ut perspiciatis unde omnis iste natus error si')]")).getText());
			  System.out.println("\n");
			  //// Printing the second paragraph
			  System.out.println("First paragraph of the page:" + driver.findElement(By.xpath("//p[contains(text(),'But I must explain to you how all this mistaken id')]")).getText());
			  System.out.println("Privacy page is tested");
			  System.out.println("\n");
		
	}
	    public void terms(WebDriver driver) throws InterruptedException
	   {
		   
	    	 driver.findElement(By.xpath("//a[contains(text(),'Terms & Conditions')]")).click();
	    	 Thread.sleep(2000);
	    	 System.out.println( "URL OF THE TERMS PAGE:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE TERMS PAGE:" +driver.getTitle());
			 System.out.println("\n");
			 Thread.sleep(2000);
			   Actions c = new Actions(driver);
			   int l=0;
				  while(l<2)
				  {
					  c.sendKeys(Keys.PAGE_DOWN).build().perform();
					  l++;
					  Thread.sleep(1000);
					  
				  }	  
				  
				  Thread.sleep(2000);
				  
				  // Printig the text title of the page
				  System.out.println(" Text Title of the privacy page is:" + driver.findElement(By.xpath("//h1[contains(text(),'Terms & Conditions')]")).getText());
				  System.out.println("\n");
				  // Printing the first paragraph
				  System.out.println("First paragraph of the page:" + driver.findElement(By.xpath("//p[contains(text(),'Sed ut perspiciatis unde omnis iste natus error si')]")).getText());
				  System.out.println("\n");
				  //// Printing the second paragraph
				  System.out.println("First paragraph of the page:" + driver.findElement(By.xpath("//p[contains(text(),'But I must explain to you how all this mistaken id')]")).getText());
                   
				  
				  System.out.println("Terms page is tested");
				  // Clicking on the footer logo
					 
					 driver.findElement(By.xpath("//span[@class='bg-footer-logo']")).click();
	    	
	   }
	   
	   
}
