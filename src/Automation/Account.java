package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Account 
{

	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Account acc = new Account();
		acc.profile(driver);
		

	}
      
	  public void profile(WebDriver driver) throws InterruptedException
	{   
		    driver.get("http://duconair.oablab.com/");
			 driver.manage().window().maximize();
			 System.out.println(driver.getCurrentUrl());
			 System.out.println(driver.getTitle());
			 Thread.sleep(2000);
			 
			 // log in the user
			 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='js-login_email']")).sendKeys("testfive@mailinator.com");
	 	      driver.findElement(By.xpath("//input[@id='js-login_pass']")).sendKeys("ankush");
	 	      Thread.sleep(1000);
	 	      driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
	 	      Thread.sleep(2000);
	 	      
	 	      // Clicking on the profile
	 	       Actions d = new Actions(driver);
	  	       Thread.sleep(2000);
	  	       d.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link profile-login-menu']"))).build().perform();
	  	       Thread.sleep(2000);
	  	       driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();  	      
	  	       Thread.sleep(2000);  
	  	       
	  	       //going into the edit mode of the
	  	       driver.findElement(By.className("btn-third edit-btn")).click();
	  	       Thread.sleep(2000);  
	  	       
	  	       // Edting the first name last name
	  	       driver.findElement(By.xpath("//input[@id='first_name']")).clear();
	  	       driver.findElement(By.xpath("//input[@id='last_name']")).clear();
	  	      Thread.sleep(1000); 
	  	      driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ankush");
	  	      driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Pawar");
	  	      driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("4456453346"); 
	  	      Thread.sleep(1000); 
	  	     driver.findElement(By.xpath("//a[@id='js-profile-save-btn']")).sendKeys("Ankush");  
	  	     Thread.sleep(1000); 
	  	     
	  	     // Editing the profile for the change password
	  	      driver.findElement(By.className("btn-third edit-btn")).click();
  	          Thread.sleep(2000);  
  	          
  	          // Clicking on the change passowrd link
  	          
	  	   
	  	       
		  
	}
	
}
