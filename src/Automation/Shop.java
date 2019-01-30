package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Shop
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Shop shipping = new Shop();
		shipping.shopping(driver); 
		shipping.cartdetailspage(driver);
		shipping.deliverypage(driver);
		

	}

	public void shopping(WebDriver driver) throws InterruptedException
	{
        // 
	     driver.get("http://duconair.oablab.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 
		 // Clicking on the shop button
		 driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/shop/']")).click();
		 System.out.println(driver.getCurrentUrl());
		 System.out.println(driver.getTitle());
		 Thread.sleep(2000);
		 
		 // Scrolling down the page
		 Actions a = new Actions(driver);
		 a.sendKeys(Keys.PAGE_DOWN).build().perform();
	     
		 // Adding the product in the cart
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[1]/div/div/div/div[2]/div[2]/div/a")).click();
		 Thread.sleep(2000);
		 
		 // Adding the product in the cart
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[2]/div/div/div/div[2]/div[2]/div/a")).click();
		 Thread.sleep(2000);
		 
		 
		 // Adding the product in the cart
		 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div[3]/div/div/div/div[2]/div[2]/div/a")).click();
		 Thread.sleep(2000);
		 
		 // Clicking on the product to go to the details page
		 
		 driver.findElement(By.xpath("//div[@class='row']//div[4]//div[1]//div[1]//a[1]//img[1]")).click();
		 Thread.sleep(2000);
		 
		 // Scrolling down the page
	 int i=0;
		 while(i<6)
		 {
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 i++;
			 Thread.sleep(1000);
		 } 
		 
		 Thread.sleep(1000);
		 
		 int j=0;
		 while(j<6)
		 {
			 a.sendKeys(Keys.PAGE_UP).build().perform();
			 j++;
			 Thread.sleep(1000);
		 }
		

		 // Increasing the quantity of the product
		 int k=0;
		 while(k<3)
		 {
		 driver.findElement(By.xpath("//span[@class='bg-plus']")).click();
		 k++;
		 Thread.sleep(1000);
		 }
		
		 // Clicking on the add to cart button
		 driver.findElement(By.xpath("//button[@type='submit']")).click();
		 
		 // Clciking on the cart icon at the top to into the checkout
		 Thread.sleep(1500);
		 driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/div/ul/li[1]/a")).click();
		 Thread.sleep(3000);
	 
			
	}
	 
	public void cartdetailspage(WebDriver driver) throws InterruptedException
	
	{
		
		// increasing the quantity of the product
		driver.findElement(By.xpath("//tbody//tr[1]//td[3]//div[1]//button[2]//span[1]")).click();
		Thread.sleep(1000);
		// Updating the cart
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/form[1]/div[2]/button")).click();
		Thread.sleep(2000);
		//Deleting the product
		driver.findElement(By.xpath("//tbody//tr[1]//td[5]//a[1]//span[1]")).click();
		Thread.sleep(3000);
		// Clciking on th processed to checkout
		driver.findElement(By.xpath("/html/body/div/div[2]/div[2]/div/div[2]/form[1]/div[1]/div/a")).click();
		Thread.sleep(2000);
			}	
			
	       public void deliverypage(WebDriver driver) throws InterruptedException
	     {
		
	    	  // Entering the login details
	    	   driver.findElement(By.xpath("//input[@id='js-login_email']")).sendKeys("testingone@mailinator.com");
	    	   driver.findElement(By.xpath("//input[@id='js-login_pass']")).sendKeys("ankush");
	    	   Thread.sleep(2000);
	    	   driver.findElement(By.xpath("//button[@id='js-login-submit']")).click();
	    	   Thread.sleep(2000);
	    	   
	    	   // Entering the billing address
	    	   driver.findElement(By.xpath("//input[@id='billing_first_name']")).sendKeys("ankush");
	    	   driver.findElement(By.xpath("//input[@id='billing_last_name']")).sendKeys("ankush");
	    	   driver.findElement(By.xpath("//input[@id='billing_company']")).sendKeys("Cemtrexlabs");
	    	  
	    	   // Selecting the country
	    	    Select a = new Select(driver.findElement(By.xpath("//select[@id='billing_country']")));
               a.selectByVisibleText("Bangladesh");
	    	   //driver.findElement(By.xpath("//select[@id='billing_country']")).click();
	    	 

	    	   driver.findElement(By.xpath("//input[@id='billing_address_1']")).sendKeys("giga space, beta 1 , Viman nagar");
	    	   driver.findElement(By.xpath("//input[@id='billing_city']")).sendKeys("Pune");
	    	   Thread.sleep(2000);
	    	   a.selectByVisibleText("India");
	    	   // Selecting the state
	    	    Select b = new Select(driver.findElement(By.cssSelector("#billing_state")));
	    	    b.selectByVisibleText("Barguna");
	    	   
	    	   driver.findElement(By.xpath("//input[@id='billing_postcode']")).sendKeys("444444");
	    	   driver.findElement(By.xpath("//input[@id='billing_phone']")).sendKeys("1234123432");
	    	   driver.findElement(By.xpath("//input[@id='billing_email']")).sendKeys("test@mailinator.com");

	  	  
	   	   
	    	   
	     }
	
	
}