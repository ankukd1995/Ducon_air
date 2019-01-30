package Automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class About
{

	public static void main(String[] args) throws InterruptedException 
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		About abb = new About();
		abb.faq(driver);		 
	}

	  public void faq(WebDriver driver) throws InterruptedException
	{
		    // entering the URL of the ducon on the site
		  
		     driver.get("http://duconair.oablab.com/");
			 driver.manage().window().maximize();
			 
			 // Getting the URL and title of the current page
			 
			 System.out.println("URL OF THE HOME PAGE:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE HOME PAGE:" + driver.getTitle());
			 System.out.println("\n");
			 
			 // Click on the about link in the navigation
			 
			 driver.findElement(By.xpath("//a[@href='http://duconair.oablab.com/about/']")).click();
			 Thread.sleep(2000);
			 System.out.println("URL OF THE ABOUT PAGE:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE ABOUT PAGE:" + driver.getTitle());
			 System.out.println("\n");
			 
			 // Scrolling down the page on the about ducon
			 
			 Actions a = new Actions(driver);
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(1000);
			 
			 //Printing the first paragraph of the page
			 System.out.println("Title text of the page:"+ driver.findElement(By.xpath("//div[@class='about-heading']//h1")).getText());
			 System.out.println("Title text of the page:"+ driver.findElement(By.xpath("//p[contains(text(),'Using an air purifier will helpcreate cleaner, hea')]")).getText());
			 Thread.sleep(1000);
			 System.out.println("\n");
			 
			 //Printing the first learn more title and content
			 System.out.println("Title text of the first learn: "+ driver.findElement(By.xpath("//h1[contains(text(),'Consider your indoor air quality needs')]")).getText());
			 System.out.println("Description of the first learn more : "+ driver.findElement(By.xpath("//p[contains(text(),'If you have allergies, you should choose an air pu')]")).getText());
			 Thread.sleep(1000);
			 System.out.println("\n"); 
			 
			//Printing the second learn more title and content
			 System.out.println("Title text of the second learn :"+ driver.findElement(By.xpath("//h1[contains(text(),'Choose the right size air purifier')]")).getText());
			 System.out.println("Description of the second learn more :"+ driver.findElement(By.xpath("//p[contains(text(),'To meet your needs, consider the square footage of')]")).getText());
			 Thread.sleep(1000);
			 System.out.println("\n");
			 
			//Printing the Third learn more title and content
			 System.out.println("Title text of the third learn :"+ driver.findElement(By.xpath("//h1[contains(text(),'Choose the right location.')]")).getText());
			 System.out.println("Description of the third learn more :"+ driver.findElement(By.xpath("//p[contains(text(),'We recommend that you place your air purifier in y')]")).getText());
			 Thread.sleep(1000);
			 System.out.println("\n");
			 
			 
			 
			 // Clicking on the first learn more
			 
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//div[@class='row mb-120 pad-y-mob']//div[@class='col-md-6 col-12 about-top-right']//div//a")).click();
			 Thread.sleep(2000);
			 
			 System.out.println("URL OF THE LEARN MORE PAGE:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE LEARN MORE PAGE:" + driver.getTitle());
			 System.out.println("\n");
			 
			 // Getting the title text of the 5 things and descripotion
			 System.out.println("Title text of the 5 things:" + driver.findElement(By.xpath("//div[@class='heading']//h1")).getText());
			 System.out.println("Title description of the 5 things:" + driver.findElement(By.xpath("//p[contains(text(),'Our indoor air is often much more polluted than th')]")).getText());
			 System.out.println("\n");
				

			 // Getting the Title and description of the first thing
			 System.out.println("Title text of the first things:" + driver.findElement(By.xpath("//div[@class='container']//div[1]//div[2]//div[1]//h1[1]")).getText());
			 System.out.println("Title description of the first things:" + driver.findElement(By.xpath("//div[@class='container']//div[1]//div[2]//div[1]//p[1]")).getText());
			 System.out.println("\n");
			 
			 // Getting the Title and description of the second thing
			 System.out.println("Title text of the second things:" + driver.findElement(By.xpath("//div[@class='container']//div[2]//div[1]//div[1]//h1[1]")).getText());
			 System.out.println("Title description of the second things:" + driver.findElement(By.xpath("//div[@class='container']//div[2]//div[1]//div[1]//p[1]")).getText());
			 System.out.println("\n");
			 
			 // Getting the Title and description of the third thing
			 System.out.println("Title text of the third things:" + driver.findElement(By.xpath("//div[@class='container']//div[3]//div[2]//div[1]//h1[1]")).getText());
			 System.out.println("Title description of the third things:" + driver.findElement(By.xpath("//p[contains(text(),'• After choosing the type and size of air purifier')]")).getText());
			 System.out.println("\n");
			 
			 // Getting the Title and description of the fourth thing
			 System.out.println("Title text of the third things:" + driver.findElement(By.xpath("//div[@class='container']//div[4]//div[1]//div[1]//h1[1]")).getText());
			 System.out.println("Title description of the third things:" + driver.findElement(By.xpath("//div[@class='container']//div[4]//div[1]//div[1]//p[1]")).getText());
			 System.out.println("\n");
			 
			// Getting the Title and description of the fifth thing
			 System.out.println("Title text of the third things:" + driver.findElement(By.xpath("//div[@class='row align-items-center']//h1")).getText());
			 System.out.println("Title description of the third things:" + driver.findElement(By.xpath("//div[@class='row align-items-center']//p")).getText());
			 System.out.println("\n");
			 
 
			 // Scrolling down the page on the 5 things page
			 
			 int k=0;
			 while(k<7)
			 {
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(1000);
			 k++;
			 }
			  Thread.sleep(2000);
			  
			 //  Scrolling up the page on the 5 things page
			 
			 int l=0;
			 while(l<7)
			 {
			 a.sendKeys(Keys.PAGE_UP).build().perform();
			 Thread.sleep(1000);
			 l++;
			 }
			 Thread.sleep(2000);
			 
			 // clicking back on the 5 things
			 driver.findElement(By.xpath("//a[contains(text(),'BACK')]")).click();

			 
			 // Scrolling at the bottom of the page on the about ducon
			 
			 int i=0;
			 while(i<4)
			 {
			 a.sendKeys(Keys.PAGE_DOWN).build().perform();
			 Thread.sleep(1000);
			 i++;
			 }
			 
			 Thread.sleep(1000);
			 
			// Scrolling at the top of the page about ducon
			 
			 int j=0;
			 while(j<6)
			 {
			 a.sendKeys(Keys.PAGE_UP).build().perform();
			 Thread.sleep(1000);
			 j++;
			 }
			 
			 // Clicking on the about ducon
			 
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("//a[contains(text(),'About Ducon')]")).click();
			 System.out.println("URL OF THE ABOUT DUCON:" + driver.getCurrentUrl());
			 System.out.println("TITLE OF THE ABOUT DUCON:" + driver.getTitle());
			 System.out.println("\n");
			 Thread.sleep(3000);
			 
			 // Getting the the text title of the page and description
			 
			System.out.println("Title of the page:" + driver.findElement(By.xpath("//h1[contains(text(),'About Ducon')]")).getText());
			System.out.println("description of the page:" + driver.findElement(By.xpath("//p[contains(text(),'Ducon Infratechnologies Ltd. is a rapidly growing ')]")).getText());
			 System.out.println("\n");
			// Getting the the content of the page
			System.out.println("description of the page:" + driver.findElement(By.xpath("//div[@class='ducon-description']//p")).getText());
	 			 
			 int n=0;
			 while(n<3)
			 {
			 a.sendKeys(Keys.PAGE_UP).build().perform();
			 Thread.sleep(1000);
			 n++;
			 }
			 
			 Thread.sleep(2000);
			 
			 // Clicking on the footer logo
			 
			 driver.findElement(By.xpath("//span[@class='bg-footer-logo']")).click();
			 		 			 	   
	}
}
