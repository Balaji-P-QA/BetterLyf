package org.beter;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UserPersonalFunctionalities {

	WebDriver driver;
	String oldPassword;
	JavascriptExecutor js;

	@BeforeClass
	private void start() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://upg-dev.betterlife.ae/");

		driver.manage().window().maximize();

		//Thread.sleep(25000);

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='I Agree']"));
		acceptCookies.click();
	}

	@Test(priority = 1, enabled = true)
	private void Login() throws InterruptedException {

		// click the sign logo
		WebElement sign = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
		sign.click();

		oldPassword = "Balaji@123";

		// enter the username
		WebElement userName = driver.findElement(By.xpath("//input[@name='login[username]']"));
		userName.sendKeys("balaji.p@sysfore.com");

		Thread.sleep(3000);

		// enter the password
		WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
		password.sendKeys(oldPassword);

		Thread.sleep(3000);

		// click the login button
		WebElement submit = driver.findElement(By.xpath("(//button[@name='send'])[1]"));
		submit.click();

	}

	@Test(priority = 2, enabled = true)
	private void myAccount() throws InterruptedException {

		WebElement sign = driver.findElement(By.xpath("//a[@class='myaccount-link']"));
		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();

		Thread.sleep(2000);

		WebElement myAccount = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
		myAccount.click();
	}



	@Test(priority = 3, enabled = false)
	private void myOrder() throws InterruptedException {

		WebElement myOrders = driver.findElement(By.xpath("(//a[text()='My Orders'])[1]"));
		myOrders.click();

		Thread.sleep(3000);

		try {

			List<WebElement> ordersList = driver.findElements(By.xpath("//span[text()='View Order']"));
			System.out.println("\n user order list is showing " + ordersList.size() + " ordres");

			String viewOrder = "yes";

			/**/ int viewOrderNum = 3;

			if (viewOrder.equals("yes")) {

				ordersList.get(viewOrderNum).click();

				WebElement productName = driver
						.findElement(By.xpath("//strong[@class='product name product-item-name']"));
				System.out.println("\n user ordered Product Name is : " + productName.getText());
			}

		} catch (Exception e) {

			System.out.println("\n user didn't ordered Products");

		}

	}

	@Test(priority = 4, enabled = false)
	private void wishList() throws InterruptedException {

		WebElement wishList = driver.findElement(By.xpath("//a[text()='Wish List']"));
		wishList.click();

		Thread.sleep(3000);

		try {

			WebElement errMsg = driver.findElement(By.xpath("//span[text()='You have no items in your wish list.']"));

			if (errMsg.isDisplayed()) {

				System.out.println(errMsg.getText());

			}

		} catch (Exception e) {

			WebElement wishListCount = driver.findElement(By.xpath("//span[@class='base']"));

			System.out.println("\n user have " + wishListCount.getText() + " products in our WishList");

		}
	}

	@Test(priority = 5, enabled = false)
	private void myAddress() throws InterruptedException {

		WebElement myAddress = driver.findElement(By.xpath("(//a[text()='My Addresses'])[1]"));
		myAddress.click();

		Thread.sleep(3000);

		String addAnotherAddress = "yes";

		WebElement scrDown = driver.findElement(By.xpath("//label[@for='primary_shipping']"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", scrDown);

		if (addAnotherAddress.equals("yes")) {

			WebElement addAnotherAddresBtn = driver.findElement(By.xpath("(//span[text()='Add another address'])[2]"));
			addAnotherAddresBtn.click();

			Thread.sleep(2000);

			WebElement flatNo = driver.findElement(By.xpath("(//input[@type='text'])[11]"));
			flatNo.clear();
			flatNo.sendKeys("A-007");

			Thread.sleep(2000);

			WebElement street = driver.findElement(By.xpath("(//input[@type='text'])[12]"));
			street.clear();
			street.sendKeys("Test Street");

			Thread.sleep(2000);

			WebElement landMark = driver.findElement(By.xpath("(//input[@type='text'])[13]"));
			landMark.clear();
			landMark.sendKeys("QA office opposite");

			Thread.sleep(2000);

			WebElement city = driver.findElement(By.xpath("(//select[@name='city'])[2]"));
			Select s = new Select(city);
			s.selectByIndex(3);

			Thread.sleep(2000);

			WebElement deliveryArea = driver.findElement(By.xpath("(//input[@name='city_area'])[2]"));
			deliveryArea.clear();
			deliveryArea.sendKeys("Test Area");

			Thread.sleep(2000);

			WebElement country = driver.findElement(By.xpath("(//select[@name='country_id'])[2]"));
			Select s1 = new Select(country);
			s.selectByIndex(1);

			Thread.sleep(2000);

			WebElement phone = driver.findElement(By.xpath("(//input[@name='telephone'])[2]"));
			phone.clear();
			phone.sendKeys("912345678");

			Thread.sleep(2000);

			WebElement saveBtn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			saveBtn.click();
		}

		Thread.sleep(5000);

	}

	@Test(priority = 6, enabled = false)
	private void storeCredit() throws InterruptedException {

		WebElement storeCredit = driver.findElement(By.xpath("//a[text()='Store Credits']"));
		storeCredit.click();

		Thread.sleep(3000);

		WebElement storeCreditBalance = driver.findElement(By.xpath("//b[text()='AED 0']"));

		System.out.println("\n user have a " + storeCreditBalance.getText() + " Balance in our store credit");

		Thread.sleep(4000);
	}

	@Test(priority = 7, enabled = false)
	private void compareProducts() throws InterruptedException {

		WebElement sign = driver.findElement(By.xpath("//a[@class='myaccount-link']"));
		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();

		Thread.sleep(2000);

		WebElement mycompare = driver.findElement(By.xpath("//a[@title='My Compare Products']"));
		mycompare.click();

		Thread.sleep(4000);

		List<WebElement> comparedproducts = driver
				.findElements(By.xpath("//h2[@class='product name product-item-name product-name']"));

		System.out.println("\nUser have " + comparedproducts.size() + " Products in ourcomparison List");

		for (int i = 0; i < comparedproducts.size(); i++) {

			System.out.println(comparedproducts.get(i).getText());

		}

	}

	
	@Test(priority = 8, enabled = true)
	private void accountInformation() throws InterruptedException {

		WebElement sign = driver.findElement(By.xpath("//a[@class='myaccount-link']"));
		Actions a = new Actions(driver);
		a.moveToElement(sign).perform();

		Thread.sleep(2000);

		WebElement myAccount = driver.findElement(By.xpath("(//a[@title='My Account'])[2]"));
		myAccount.click();

		String newsLetterSubscribtion = "yes";
		
		if (newsLetterSubscribtion.equals("yes")) {
			
			 WebElement confirmNewPassword = driver.findElement(By.xpath("(//input[@type='password'])[3]")); 
		     js= (JavascriptExecutor)driver;
             js.executeScript("arguments[0].scrollIntoView(true)", confirmNewPassword);
			 Thread.sleep(2000);

			WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));

			if (checkbox.isSelected()) {
				
				System.out.println("user already Subscribed the NewsLetter");
				
			} else {
				
				WebElement checkbox1 = driver.findElement(By.xpath("//label[@for='subscription']"));
				checkbox1.click();
				WebElement saveBtn = driver.findElement(By.xpath("(//span[text()='Save'])[3]"));
				saveBtn.click();
				Thread.sleep(2000);
				WebElement succMsg = driver.findElement(By.xpath("//div[text()='We have saved your subscription.']"));
				System.out.println(succMsg.getText());
				
			}

		}

	/**/	String emailAndPassword = " ";

		if (emailAndPassword.equals("Change")) {

			String updatePassword = "Balaji@1234";

			WebElement currentPassword = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
			currentPassword.sendKeys(oldPassword);

			Thread.sleep(2000);

			WebElement newPassword = driver.findElement(By.xpath("(//input[@type='password'])[2]"));
			newPassword.sendKeys(updatePassword);

			Thread.sleep(2000);

			WebElement confirmNewPassword = driver.findElement(By.xpath("(//input[@type='password'])[3]"));
			confirmNewPassword.sendKeys(updatePassword);

			WebElement saveBtn = driver.findElement(By.xpath("(//button[@type='submit'])[3]"));
			saveBtn.click();
			
			Thread.sleep(5000);
			
			// enter the username
			WebElement userName = driver.findElement(By.xpath("//input[@name='login[username]']"));
			userName.sendKeys("balaji.p@sysfore.com");

			Thread.sleep(3000);

			// enter the password
			WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
			password.sendKeys(updatePassword);

			Thread.sleep(3000);

			// click the login button
			WebElement submit = driver.findElement(By.xpath("(//button[@name='send'])[1]"));
			submit.click();
			
			Thread.sleep(3000);	
			
			String title = driver.getTitle();
				
			if (title.equals("My Account")) {
				
				System.out.println(" \n Password Updated Successful");
				Assert.assertTrue(true);
				
			} else {

				System.out.println(" \n Password Update Unsuccessful");
				Assert.assertTrue(false);
	
			}
			
			
		}

	}
	
}
