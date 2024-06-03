package org.beter;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CompareAndWishList {

	WebDriver driver;
	JavascriptExecutor js;

	@BeforeClass
	private void start() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://upg-dev.betterlife.ae/");

		driver.manage().window().maximize();

		// Thread.sleep(50000);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//accept the cookies
		WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='I Agree']"));
		acceptCookies.click();

	}

	@Test(priority = 1, enabled = true)
	private void login1() throws InterruptedException {

		WebElement accBtn = driver.findElement(By.xpath("//a[@class='head-signin']"));
		accBtn.click();

		Thread.sleep(3000);

		// enter the username
		WebElement userName = driver.findElement(By.xpath("//input[@name='login[username]']"));
		userName.sendKeys("balaji.p@sysfore.com");

		Thread.sleep(3000);

		// enter the password
		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
		password.sendKeys("Balaji@123");

		Thread.sleep(3000);

		// click the login button
		WebElement submit = driver.findElement(By.xpath("(//button[@name='send'])[1]"));
		submit.click();

	}

	@Test(priority = 2, enabled = true)
	private void targetForCategory() throws InterruptedException {

		/**/ String Categories = "brands";

		// categories is equals to shopByCategory if block will execute (or)
		// categories is equals to brands elseif block will execute (or)
		// categories is equals to Deals else block will execute.

		if (Categories.equals("shopByCategory")) {
            
			//Place the cursor for shop by category Option
			WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop By Category']"));
			Actions a = new Actions(driver);
			a.moveToElement(shopByCategory).perform();

			Thread.sleep(3000);
            
			//click the Air Conditioner option
			WebElement airConditioners = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
			airConditioners.click();

			Thread.sleep(3000);

		} else if (Categories.equals("brands")) {
            
			//Place the cursor For Brands Option
			WebElement brands = driver.findElement(By.xpath("//span[text()='Brands']"));
			Actions a = new Actions(driver);
			js = (JavascriptExecutor) driver;
			a.moveToElement(brands).perform();

			Thread.sleep(3000);

			//click the zanussi Brand
			WebElement zanussi = driver.findElement(By.xpath("//img[@alt='Zanussi']"));
			zanussi.click();

			Thread.sleep(3000);

		} else {

			//click the deals option
			WebElement deals = driver.findElement(By.xpath("//span[text()='Deals']"));
			deals.click();

			Thread.sleep(3000);

		}

		Thread.sleep(10000);

	}

	@Test(priority = 3, enabled = false)
	private void comparison() throws InterruptedException {

   /**/	int num = 6;

		//getting to likes compare products name
		List<WebElement> productName = driver.findElements(By.xpath("//a[@class='product-item-link']"));
		String expectedProduct = productName.get(num).getText();

		Thread.sleep(2000);

		//click the compare option for likes product
		List<WebElement> compare = driver.findElements(By.xpath("//a[@class='action tocompare']"));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", compare.get(num));

		Thread.sleep(2000);
		
		//click the view Comparison popup
		WebElement viewComparison = driver.findElement(By.xpath("//button[@title='View Comparison']"));
		viewComparison.click();

		Thread.sleep(1000);

		//getting the products name from compared list
		WebElement ComparedProductName = driver
				.findElement(By.xpath("(//h2[@class='product name product-item-name product-name'])[1]"));
		String ActualProduct = ComparedProductName.getText();

		Thread.sleep(2000);
		
		//User expect product and actual product is equal if block will execute,expected and actual is not equal else block will execute
		if (ActualProduct.equals(expectedProduct)) {

			//give the Assert true condition and print the Product name
			System.out.println("User added Product is Properly added in Compared List");
			Assert.assertTrue(true);
			System.out.println(ActualProduct);
			
			
	/**/	String delete="yes";
			
			//user likes to delete the compared products if block will execute, otherwise is not execute
			if (delete.equals("yes")) {
				
				//click the cancel button
				WebElement cancel = driver.findElement(By.xpath("//a[@class='action delete']"));
				cancel.click();
				
				Thread.sleep(2000);
				
				//click the OK delete option
				WebElement ok = driver.findElement(By.xpath("//span[text()='OK']"));
				ok.click();
				
				//getting the Success MSg and print this Msg
				WebElement successMsg = driver.findElement(By.xpath("//div[contains(text(),'You removed product')]"));
				System.out.println(successMsg.getText());
			}
			
			

		} else {
            
			//expected product is not added in the comparison page this block will execute
			//Print the Product name and give the Assert condition False
			System.out.println("User Likes Product is not added in Compare List");
			System.out.println(ActualProduct);
			Assert.assertTrue(false);

		}
		
		

	}

	@Test(priority = 4, enabled = true)
	private void wishList() throws InterruptedException, AWTException {
	
	/**/int num = 15;

	    //getting to likes compare products name
		List<WebElement> productName = driver.findElements(By.xpath("//a[@class='product-item-link']"));
		String expectedProduct = productName.get(num).getText();

		Thread.sleep(2000);

		//click the Likes Product to wish List
		List<WebElement> wishlist = driver.findElements(By.xpath("//a[@class='action towishlist']"));
		js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", wishlist.get(num));

		Thread.sleep(1000);

		//Product name is getting from wishList
		WebElement wishProductName = driver
				.findElement(By.xpath("(//strong[@class='product-item-name'])[1]"));
		String ActualProduct = wishProductName.getText();

		Thread.sleep(2000);
		
		//actual Product is equal to Expected Product if block will execute,actual Product is not equal to Expected product else block will execute
		if (ActualProduct.equals(expectedProduct)) {

			//Print the Product name from wishList and apply the Assert True condition
			System.out.println("User Likes Product is Properly added in Wish List");
			Assert.assertTrue(true);
			System.out.println(ActualProduct);
			
		/**/String userLikesTo="Delete";
		
		//userLikesTo is equal to if, if block will execute
		//userLikesTo is equal to elseif, elseif block will execute
		//userLikesTo is equal to else, else block will execute
		
			if (userLikesTo.equals("addAllToCart")) {
				
				//click the add all to cart option
				WebElement toCart = driver.findElement(By.xpath("//span[text()='Add All to Cart']"));
				toCart.click();
				
				
			}else if (userLikesTo.equals("shareWishList")) {
				
				//click the share option
				WebElement toShare = driver.findElement(By.xpath("//span[text()='Share Wish List']"));
				toShare.click();
				
				Thread.sleep(2000);
				
				//enter the email Address
				WebElement email = driver.findElement(By.xpath("//textarea[@id='email_address']"));
				email.sendKeys("balaji.p@mailinator.com");
				
				Thread.sleep(2000);
				
				//enter the Msg
				WebElement msg = driver.findElement(By.xpath("//textarea[@id='message']"));
				msg.sendKeys("My Wish List");
				
				Thread.sleep(2000);

				//click the Share Button
				WebElement shareBtn = driver.findElement(By.xpath("//button[@title='Share Wish List']"));
				shareBtn.click();
				
				//print the success Msg
				WebElement successMsg = driver.findElement(By.xpath("//div[text()='Your wish list has been shared.']"));
				System.out.println(successMsg.getText());
				
			}else {
				
				//click the Remove button
				WebElement remove = driver.findElement(By.xpath("//a[@title='Remove Item']"));
				js.executeScript("arguments[0].click();", remove);
				
				Thread.sleep(3000);
				
				//Press the Enter button for confirmation
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				
				Thread.sleep(3000);
				
				//getting Success Msg
				WebElement msg = driver.findElement(By.xpath("//div[contains(text(), 'removed from your Wish List.')] "));
				
				if (msg.isDisplayed()) {
					
					System.out.println("Product deleted successfully");
					Assert.assertTrue(true);
					
				} else {
					
					System.out.println("Product deleted successfully");
					Assert.assertTrue(false);
					
				}
			
			}
			
			
		} else {

			//user likes to added product is mismatch in wishlist else block execute
			//Print the actual Product and apply the Assert False condition
			System.out.println("User Likes Product is not added in Wish List");
			System.out.println(ActualProduct);
			Assert.assertTrue(false);

		}
		
	}
	
	
	@AfterClass
	private void end() {
    
		driver.quit();
		
	}

}
