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
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProductPurchase {

	static WebDriver driver;
	JavascriptExecutor js;
	String Customer;

	@BeforeClass
	private void start() throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://upg-dev.betterlife.ae/");

		driver.manage().window().maximize();

		// Thread.sleep(50000);

		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));

		WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='I Agree']"));
		acceptCookies.click();
	}

	@Test(priority = 1, enabled = true)
	private void Login() throws InterruptedException {

		Customer = "Guest";

		if (Customer.equals("user")) {

			// click the sign logo
			WebElement sign = driver.findElement(By.xpath("(//a[@title='Login'])[1]"));
			sign.click();

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
	}

	@Test(priority = 2, enabled = true)
	private void targetForCategory() throws InterruptedException {

		String Selection = "yes";

		String generalSearch = "";
		String Categorywise = "";
		String categoryPageWise = "yes";

		// general search is equals to yes if block will execute,otherwise else block
		// will execute

		if (Selection.equals("yes")) {

			if (generalSearch.equals("yes")) {

				WebElement search = driver.findElement(By.xpath("//input[@id='search']"));
				search.sendKeys("Terim - 7 Kg Washing Machine, TERFL71200");

				Thread.sleep(3000);

				WebElement searchBtn = driver.findElement(By.xpath("//button[@class='action search']"));
				searchBtn.click();

			} else if (Categorywise.equals("yes")) {

				/**/ String Categories = "deals";

				// categories is equals to shopByCategory if block will execute (or)
				// categories is equals to brands elseif block will execute (or)
				// categories is equals to Deals else block will execute.

				if (Categories.equals("shopByCategory")) {

					WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop By Category']"));
					Actions a = new Actions(driver);
					a.moveToElement(shopByCategory).perform();

					Thread.sleep(3000);

					WebElement airConditioners = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
					airConditioners.click();

					Thread.sleep(3000);

				} else if (Categories.equals("brands")) {

					WebElement brands = driver.findElement(By.xpath("//span[text()='Brands']"));
					Actions a = new Actions(driver);
					a.moveToElement(brands).perform();

					Thread.sleep(3000);

					WebElement zanussi = driver.findElement(By.xpath("//img[@alt='Zanussi']"));
					zanussi.click();

					Thread.sleep(3000);

				} else if (Categories.equals("deals")) {

					WebElement deals = driver.findElement(By.xpath("//span[text()='Deals']"));
					deals.click();

					Thread.sleep(3000);

				}

			}

			int productNum = 4;

			List<WebElement> addToCart = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
			addToCart.get(productNum).click();

			Thread.sleep(3000);

		}

		/*****/
		if (categoryPageWise.equals("yes")) {

			String Categories = "brands";

			if (Categories.equals("shopByCategory")) {

				WebElement shopByCategory = driver.findElement(By.xpath("//span[text()='Shop By Category']"));
				Actions a = new Actions(driver);
				a.moveToElement(shopByCategory).perform();

				Thread.sleep(3000);

				WebElement airConditioners = driver.findElement(By.xpath("(//a[text()='Air Conditioners'])[1]"));
				airConditioners.click();

				Thread.sleep(3000);

			} else if (Categories.equals("brands")) {

				WebElement brands = driver.findElement(By.xpath("//span[text()='Brands']"));
				Actions a = new Actions(driver);
				a.moveToElement(brands).perform();

				Thread.sleep(3000);

				WebElement siemens = driver.findElement(By.xpath("(//img[@alt='Siemens'])[1]"));
				siemens.click();

				Thread.sleep(3000);

			} else if (Categories.equals("deals")) {

				WebElement deals = driver.findElement(By.xpath("//span[text()='Deals']"));
				deals.click();

				Thread.sleep(3000);

			}

			String ExpectedProduct = "Siemns - 9 Kg Dryer, WT46G40SGC";

			PurchasePoj p = new PurchasePoj(driver);

			for (int k = 0; k < p.ProductsName.size(); k++) {

				String specificProductName = p.ProductsName.get(k).getText();

				if (specificProductName.equalsIgnoreCase(ExpectedProduct)) {

					List<WebElement> addToCart = driver.findElements(By.xpath("//span[text()='Add to Cart']"));
					addToCart.get(k).click();
					break;

				}

				if (k == p.ProductsName.size() - 1) {

					try {
						WebElement nextBtn = driver.findElement(By.xpath("(//a[@title='Next'])[2]"));
						nextBtn.click();
						k = -1;
						Thread.sleep(5000);
					} catch (Exception e) {

						System.out.println("User Expected Product is not Available");

					}

				}

			}

		}

	}

	@Test(priority = 3, enabled = false)
	private void goToCart() throws InterruptedException {

		WebElement cartIcon = driver.findElement(By.xpath("(//span[@class='price'])[1]"));
		cartIcon.click();

		Thread.sleep(3000);

		String discountCoupon = "yes";

		if (discountCoupon.equals("No")) {

			WebElement discountCode = driver.findElement(By.xpath("//input[@id='coupon_code']"));
			discountCode.sendKeys("Test@123");

			Thread.sleep(2000);

			WebElement apply = driver.findElement(By.xpath("//span[text()='Apply ']"));
			apply.click();

			Thread.sleep(2000);
		}

		WebElement proceedToCheckout = driver.findElement(By.xpath("//span[text()='Proceed to Checkout']"));
		proceedToCheckout.click();
	}

	@Test(priority = 4, enabled = false)
	private void checkout() throws InterruptedException {

		if (Customer.equals("Guest")) {

			WebElement fullName = driver.findElement(By.xpath("//input[@id='additional-firstname']"));
			fullName.sendKeys("Test");

			Thread.sleep(2000);

			WebElement phoneNumber = driver.findElement(By.xpath("//input[@id='additional-mobile-no']"));
			phoneNumber.sendKeys("987654321");

			Thread.sleep(2000);

			WebElement email = driver.findElement(By.xpath("//input[@id='additional-email']"));
			email.sendKeys("test@mailinator.com");

			Thread.sleep(2000);

			WebElement flatNo = driver.findElement(By.xpath("(//input[@class='input-text'])[5]"));
			flatNo.sendKeys("A/001");

			Thread.sleep(2000);

			WebElement street = driver.findElement(By.xpath("(//input[@class='input-text'])[6]"));
			street.sendKeys("abc Street");

			Thread.sleep(2000);

			WebElement landmark = driver.findElement(By.xpath("(//input[@class='input-text'])[7]"));
			landmark.sendKeys("oppsite abc mall");

			Thread.sleep(2000);

			WebElement city = driver.findElement(By.xpath("//select[@class='select btl-city']"));
			Select s = new Select(city);
			s.selectByIndex(7);

			Thread.sleep(2000);

			WebElement uae = driver.findElement(By.xpath("//select[@class='select btl-country_id']"));
			Select s1 = new Select(uae);
			s1.selectByIndex(0);
		}

		WebElement uae = driver.findElement(By.xpath("//select[@class='select btl-country_id']"));
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", uae);

		Thread.sleep(2000);

		WebElement proceedToPayment = driver.findElement(By.xpath("//span[text()='PROcEED TO PAYMENT']"));
		proceedToPayment.click();

		Thread.sleep(3000);

		String paymentType = "card";

		if (paymentType.equals("cashOnDelivery")) {

			WebElement selectCashType = driver.findElement(By.xpath("//span[text()='Cash On Delivery']"));
			selectCashType.click();

			Thread.sleep(3000);

			WebElement placeorder = driver.findElement(By.xpath("(//span[text()='Place Order'])[2]"));
			placeorder.click();

		} else {

			WebElement selectCardType = driver.findElement(By.xpath("//span[text()='Pay by Credit or Debit Card']"));
			selectCardType.click();

			Thread.sleep(3000);

			WebElement placeorder = driver.findElement(By.xpath("(//span[text()='Place Order'])[1]"));
			placeorder.click();

			Thread.sleep(5000);

			WebElement scrollDown = driver.findElement(By.xpath("(//div[@class='span6'])[2]"));
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView(true)", scrollDown);

			Thread.sleep(3000);

			WebElement creditCardNumber = driver.findElement(By.xpath("//input[@id='creditCardNumber']"));
			creditCardNumber.sendKeys("5123450000000008");

			Thread.sleep(2000);

			WebElement expireMonth = driver.findElement(By.xpath("//select[@id='expiryMonthCreditCard']"));
			Select s = new Select(expireMonth);
			s.selectByIndex(1);

			// enter the expire year
			WebElement expireYear = driver.findElement(By.xpath("//select[@id='expiryYearCreditCard']"));
			Select s1 = new Select(expireYear);
			s1.selectByVisibleText("2039");

			// enter the CCV number
			WebElement ccvNumber = driver.findElement(By.xpath("//input[@id='CVVNumberCreditCard']"));
			ccvNumber.sendKeys("100");

			// click the submit button
			WebElement submit = driver.findElement(By.xpath("(//span[text()='Make Payment'])[1]"));
			submit.click();

			Thread.sleep(6000);

			// click the send Any way from submit button
			WebElement submitBtn = driver.findElement(By.xpath("//input[@value='Submit']"));
			submitBtn.click();

			Thread.sleep(8000);

		}

	}

	@AfterClass
	private void end() {

		// driver.quit();

	}

}
