package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		acc.address(driver);
		acc.myorders(driver);
		

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
	  	       driver.findElement(By.xpath("//div[@class='col-12 top-heading']//a[@class='btn-third edit-btn'][contains(text(),'EDIT')]")).click();
	  	       Thread.sleep(2000);  
	  	       
	  	       // Edting the first name last name
	  	       driver.findElement(By.xpath("//input[@id='first_name']")).clear();
	  	       driver.findElement(By.xpath("//input[@id='last_name']")).clear();
	  	      Thread.sleep(1000); 
	  	      driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Ankush");
	  	      driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Pawar");
	  	      Thread.sleep(2000); 
	  	    
	  	     
	  	     // Clicking on the save button
	  	     driver.findElement(By.xpath("//a[@id='js-profile-save-btn']")).click();
	  	    Thread.sleep(2000);  
	  	     // Editing the profile for the change password
	  	      driver.findElement(By.xpath("//div[@class='col-12 top-heading']//a[@class='btn-third edit-btn'][contains(text(),'EDIT')]")).click();
  	          Thread.sleep(2000);  
  	   
  	          Actions a = new Actions(driver);
  	          a.sendKeys(Keys.PAGE_DOWN).build().perform();
  	          
  	         Thread.sleep(2000);
  	          // Clicking on the change passowrd link
  	          driver.findElement(By.xpath("//a[@class='change--pwd']")).click();
  	          Thread.sleep(1000);
  	          
  	          // clicking on the change password button'
  	          driver.findElement(By.xpath("//button[@id='js-change-user-pass']")).click();
  	          
  	          // Printing the error message
  	          String e = driver.findElement(By.xpath("//span[@id='error_old_pass']")).getText();
  	          String b = driver.findElement(By.xpath("//span[@id='error_new_pass']")).getText();
  	          String c = driver.findElement(By.xpath("//span[@id='error_confirm_pass']")).getText();
  	          
  	          System.out.println("old password error message:" + e);
  	          System.out.println("old password error message:" +b);
  	           System.out.println("old password error message:" + c);	
  	         Thread.sleep(2000);  
  	  	   
  	         
  	           // Catching the old password wrong error
  	         
  	         driver.findElement(By.xpath("//input[@id='user_old_pass']")).sendKeys("363574sdgssdfy");
  	         driver.findElement(By.xpath("//input[@id='user_new_pass']")).sendKeys("123456"); 
  	         driver.findElement(By.xpath("//input[@id='user_confirm_pass']")).sendKeys("123456");
  	         Thread.sleep(2000);  
  	         driver.findElement(By.xpath("//button[@id='js-change-user-pass']")).click();
  	         Thread.sleep(1000);  
  	         String g = driver.findElement(By.xpath("//span[@id='error_old_pass']")).getText();
  	         System.out.println("old password wrong error message:" + g);
  	         Thread.sleep(2000); 
  	         
  	         // Clearing the fields
  	         driver.findElement(By.xpath("//input[@id='user_old_pass']")).clear();
	         driver.findElement(By.xpath("//input[@id='user_new_pass']")).clear();
	         driver.findElement(By.xpath("//input[@id='user_confirm_pass']")).clear();
	         Thread.sleep(2000); 
  	         driver.findElement(By.xpath("//input[@id='user_old_pass']")).sendKeys("ankush");
	         driver.findElement(By.xpath("//input[@id='user_new_pass']")).sendKeys("ankush"); 
	         driver.findElement(By.xpath("//input[@id='user_confirm_pass']")).sendKeys("ankush");
	         Thread.sleep(1000); 
	         driver.findElement(By.xpath("//button[@id='js-change-user-pass']")).click();	
	         Thread.sleep(3000);
	        
	         // log in the user
			 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//input[@id='js-login_email']")).sendKeys("testfive@mailinator.com");
	 	      driver.findElement(By.xpath("//input[@id='js-login_pass']")).sendKeys("ankush");
	 	      Thread.sleep(1000);
	 	      driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
	 	      Thread.sleep(2000);
	 	      
	 	      // Clicking on the profile
	 	       Actions z = new Actions(driver);
	  	       Thread.sleep(2000);
	  	       z.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link profile-login-menu']"))).build().perform();
	  	       Thread.sleep(2000);
	  	       driver.findElement(By.xpath("//a[contains(text(),'Profile')]")).click();  	      
	  	       Thread.sleep(2000);  
	         
	}
	  
	  public void address(WebDriver driver) throws InterruptedException
	  {
		  driver.findElement(By.xpath("//ul[@class='nav nav-tabs']//a[contains(text(),'Addresses')]")).click();
		  Thread.sleep(2000);  
		  
	  }
	
	  
	   public void myorders(WebDriver driver) throws InterruptedException
	  {
		   driver.findElement(By.xpath("//ul[@class='nav nav-tabs']//a[contains(text(),'My Orders')]")).click();
		   Thread.sleep(2000);  
		   
	  }
}
