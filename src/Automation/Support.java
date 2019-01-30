package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Support 
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Support supp = new Support ();
		supp.testsupport(driver);
	}

	 public void testsupport(WebDriver driver) throws InterruptedException
	{
		 driver.get("http://duconair.oablab.com/");
		 driver.manage().window().maximize(); 
		 System.out.println("Url of the page is:" + driver.getCurrentUrl());
		 System.out.println("Title of the page is:"+ driver.getTitle());
		 
		 System.out.println("\n");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/faq/']")).click();
		 System.out.println("Url of the FAQ page is:" + driver.getCurrentUrl());
		 System.out.println("Title of the FAQ page is:"+ driver.getTitle());
		 Thread.sleep(2000);
		 
		// Printing the text title
		 System.out.println("\n");
		 System.out.println("Text title of the page:" + driver.findElement(By.xpath("//h1[contains(text(),'FAQ')]")).getText());
		 System.out.println("\n");
		 // Printing the text of the first FAQ
		 System.out.println("First FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[1]")).getText());
		 System.out.println("\n");
		 
		 // Clicking on the second FAQ AND PRINTING THE TEXT		 		 
		  driver.findElement(By.xpath("//h3[contains(text(),'How much space will an air purifier cover?')]")).click();
		  System.out.println("Second FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[2]")).getText());
		 Thread.sleep(2000);
		 System.out.println("\n");
		
		 // Scrolling down the page
		 Actions a = new Actions(driver);
		 a.sendKeys(Keys.PAGE_DOWN).build().perform();
		 Thread.sleep(2000);
		 
		
		 
		// Clicking on the Third FAQ AND PRINTING THE TEXT
		 driver.findElement(By.xpath("//h3[contains(text(),'What does CADR stand for?')]")).click();
		 System.out.println("Third FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[3]")).getText());
		 Thread.sleep(2000);
		 System.out.println("\n");
		 
		// Clicking on the fourth FAQ AND PRINTING THE TEXT
		 driver.findElement(By.xpath("//h3[contains(text(),'What does ACH stand for?')]")).click();
		 System.out.println("Fourth FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[4]")).getText());
		 Thread.sleep(2000);
		 System.out.println("\n");
		 
		// Clicking on the fifth FAQ AND PRINTING THE TEXT
		 driver.findElement(By.xpath("//h3[contains(text(),'Where should i reach out for service related queri')]")).click();
		 System.out.println("Fifth FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[5]")).getText());
		 Thread.sleep(2000);
		 System.out.println("\n");
		// Clicking on the sixth FAQ AND PRINTING THE TEXT
		 driver.findElement(By.xpath("//h3[contains(text(),'How much time it take to deliver product?')]")).click();
		 System.out.println("Sixth FAQ content :" + driver.findElement(By.xpath("//div[@class='inner-body']//ul//li[6]")).getText());
		 Thread.sleep(2000);
		 System.out.println("\n");


		// Thread.sleep(2000);
		// driver.findElement(By.xpath("//span[@class='bg-footer-logo']")).click();
	}
	
	
}
