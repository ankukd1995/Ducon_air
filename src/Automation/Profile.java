package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Profile 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Profile pro = new Profile();
		pro.login (driver);
		pro.forgotpassword(driver);
		pro.register(driver);
		
	}

	public void login(WebDriver driver) throws InterruptedException
	{
		
		 driver.get("http://duconair.oablab.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle()); 
		 Thread.sleep(2000);
		 // Clicking on the login button
		 driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		 Thread.sleep(2000); 
		 driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
		 
		 // printing the error message
		 String a = driver.findElement(By.xpath("//span[@id='error_login_email']")).getText();
		 String b = driver.findElement(By.xpath("//span[@id='error_login_pass']")).getText();
		 System.out.println("Error message of the emial id:" + a);
		 System.out.println("Error message of the Password :" + b);
		 Thread.sleep(2000);
		 
		 // Entering the wrong credentials
	      driver.findElement(By.xpath("//input[@id='js-login_email']")).sendKeys("testingone@mailinator.com");
  	      driver.findElement(By.xpath("//input[@id='js-login_pass']")).sendKeys("ankush123423");
  	      Thread.sleep(1000);
  	       driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
  	      Thread.sleep(2000);
  	     
  	     // Printing the error message
  	      String c =driver.findElement(By.xpath("//span[@id='common_error_login']")).getText();
  	      System.out.println("Common message of the login :" +c);
 		  Thread.sleep(2000);
 		   
 		  // Clearing the data 
 		  driver.findElement(By.xpath("//input[@id='js-login_email']")).clear();
 		  Thread.sleep(1000);
 		  driver.findElement(By.xpath("//input[@id='js-login_pass']")).clear();
 		  Thread.sleep(2000);
 		  // Entering the correct credentials
 		  driver.findElement(By.xpath("//input[@id='js-login_email']")).sendKeys("testingone@mailinator.com");
  	      driver.findElement(By.xpath("//input[@id='js-login_pass']")).sendKeys("ankush");
  	      Thread.sleep(1000);
  	      driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
 		  
  	      // Logout the user
  	       Actions d = new Actions(driver);
  	       Thread.sleep(2000);
  	       d.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link profile-login-menu']"))).build().perform();
  	       Thread.sleep(2000);
  	       driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();  	      
  	       Thread.sleep(2000);      
  	       System.out.println("Tested the login page");
  	        	     	      
	}
	
	public void forgotpassword(WebDriver driver) throws InterruptedException
	
	{
		
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000); 
		
		// Clicking on the forgot password button
		driver.findElement(By.xpath("//a[@class='js-login-switch-forgot']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		
		// Printing the error message
		
		String e= driver.findElement(By.xpath("//span[@id='error_forgot_email']")).getText();
		System.out.println("Validation message:" + e);
		Thread.sleep(1000);
		
		// Entering the invalid email id
		driver.findElement(By.xpath("//input[@id='js-forgot_email']")).sendKeys("safsgfd");
		Thread.sleep(1000);
		
		// Printing the error message
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		String f= driver.findElement(By.xpath("//span[@id='error_forgot_email']")).getText();
		System.out.println("Validation message:" + f);
		Thread.sleep(1000);
		
		// Entering the unregisted email id
		driver.findElement(By.xpath("//input[@id='js-forgot_email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='js-forgot_email']")).sendKeys("akushvasdhhbj@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(1000);
		String g = driver.findElement(By.xpath("//span[@id='common_error_forgot']")).getText();
		System.out.println("Common error message:" + g );
		Thread.sleep(2000);
		
		// Entering the correct email id
		driver.findElement(By.xpath("//input[@id='js-forgot_email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='js-forgot_email']")).sendKeys("testingone@mailinator.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'Reset Password')]")).click();
		Thread.sleep(3000);
		 System.out.println("Tested the Forgot password page");
		
	}
	
	public void register(WebDriver driver) throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		// Click on th register
		driver.findElement(By.xpath("//a[@class='js-login-switch-register']")).click();
		Thread.sleep(2000); 
		driver.findElement(By.xpath("//button[@id='js-register-submit']")).click();
		
		// Printing the error message
		String a = driver.findElement(By.xpath("//span[@id='error_register_email']")).getText();
		String b = driver.findElement(By.xpath("//span[@id='error_register_pass']")).getText();
		String c = driver.findElement(By.xpath("//span[@id='error_register_confirm_pass']")).getText();
		System.out.println("Validation error  message for email:" + a );
		System.out.println("Validation error  message for password:" + b );
		System.out.println("Validation error  message for confirm password:" + c );
		Thread.sleep(2000);
		
		// Printing the invalid error message
		
		driver.findElement(By.xpath("//input[@id='js-register_email']")).sendKeys("gfdhgchbvnc");
		driver.findElement(By.xpath("//input[@id='js-register_pass']")).sendKeys("gfd");
		driver.findElement(By.xpath("//input[@id='js-register_confirm_pass']")).sendKeys("gfdhgchbvnc");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='js-register-submit']")).click();
		
		
		String x = driver.findElement(By.xpath("//span[@id='error_register_email']")).getText();
		String y = driver.findElement(By.xpath("//span[@id='error_register_pass']")).getText();
		String z = driver.findElement(By.xpath("//span[@id='error_register_confirm_pass']")).getText();
		System.out.println("Validation error  message for email:" + x );
		System.out.println("Validation error  message for password:" + y );
		System.out.println("Validation error  message for confirm password:" + z );
		Thread.sleep(2000);
		
		// Clearing the entered data
		driver.findElement(By.xpath("//input[@id='js-register_email']")).clear();
		driver.findElement(By.xpath("//input[@id='js-register_pass']")).clear();
		driver.findElement(By.xpath("//input[@id='js-register_confirm_pass']")).clear();
		Thread.sleep(2000);
		
		// Entering the correct data with the register email address
		driver.findElement(By.xpath("//input[@id='js-register_email']")).sendKeys("testingone@mailinator.com");
		driver.findElement(By.xpath("//input[@id='js-register_pass']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='js-register_confirm_pass']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@id='js-register-submit']")).click();
		Thread.sleep(1000);
		
		// Printing the common error message
		
		String p = driver.findElement(By.xpath("//span[@id='common_error_register']")).getText();
		System.out.println("common error  message for email:" + p );
		
		// Entering the new email and registering the user
		driver.findElement(By.xpath("//input[@id='js-register_email']")).clear();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='js-register_email']")).sendKeys("ankus5efhjh@mailinator.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"js-register_firstname\"]")).sendKeys("Ankush");
		driver.findElement(By.xpath("//*[@id=\"js-register_lastname\"]")).sendKeys("Pawar");

		// Cliking on the register button
		   driver.findElement(By.xpath("//button[@id='js-register-submit']")).click();
		 
		  // Logout the user
		   Actions d = new Actions(driver);
  	       Thread.sleep(2000);
  	       d.moveToElement(driver.findElement(By.xpath("//a[@class='nav-link profile-login-menu']"))).build().perform();
  	       Thread.sleep(2000);
  	       driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click();  
		
	}
	
}
