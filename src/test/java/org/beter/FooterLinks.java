package org.beter;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {

	WebDriver driver;
	
	@BeforeClass
	private void start() throws InterruptedException {
    

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://upg-dev.betterlife.ae/");

		driver.manage().window().maximize();
		
	//	Thread.sleep(50000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(1));
		
		WebElement acceptCookies = driver.findElement(By.xpath("//span[text()='I Agree']"));
		acceptCookies.click();
	}
	
	
	
	@Test(priority=1,enabled=true)
	private void buildIn() throws InterruptedException {
		
		WebElement buildIn = driver.findElement(By.xpath("//a[text()='Built-in']"));
		buildIn.click();
		
		Thread.sleep(5000);	
		
		 String title = driver.getTitle();
	        
	        if (title.equals("Buy Built-in Kitchen Appliances in Dubai & UAE")) {
				
	        	System.out.println("User clicked the Built-in link is properly redirect to Built-in page");
	        	Reporter.log("User clicked the Built-in link is redirect to Built-in page");
	        	Assert.assertTrue(true);
	        	
			} else {

				System.out.println("User clicked the Built-in link is not redirect to Built-in page");
	        	Reporter.log("User clicked the Built-in link is not redirect to Built-in page");
	        	Assert.assertTrue(false);
				
			}
	        
	        Thread.sleep(3000);	
	}
	
	@Test(priority=2,enabled=true)
	private void smallAppliances() throws InterruptedException {
    
		WebElement smalAppliances = driver.findElement(By.xpath("//a[text()='Small Appliances']"));
		smalAppliances.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Buy Small Appliances in Dubai & UAE | Better Life")) {
			
        	System.out.println("User clicked the small Appliances link is properly redirect to small Appliances page");
        	Reporter.log("User clicked the small Appliances link is redirect to small Appliances page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the small Appliances link is not redirect to small Appliances page");
        	Reporter.log("User clicked the small Appliances link is not redirect to small Appliances page");
        	Assert.assertTrue(false);
			
		}
        
        Thread.sleep(3000);	
		
	}
	
	@Test(priority=3,enabled=true)
	private void refridgerators() throws InterruptedException {
     
		WebElement refridgerators = driver.findElement(By.xpath("//a[text()='Refrigerators']"));
		refridgerators.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Refrigerators")) {
			
        	System.out.println("User clicked the Refrigerators link is properly redirect to Refrigerators page");
        	Reporter.log("User clicked the Refrigerators link is redirect to Refrigerators page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Refrigerators link is not redirect to Refrigerators page");
        	Reporter.log("User clicked the Refrigerators link is not redirect to Refrigerators page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(3000);	
		
	}
	
	@Test(priority=4,enabled=true)
	private void cookers() throws InterruptedException {
    
		WebElement cookers = driver.findElement(By.xpath("//a[text()='Cookers']"));
		cookers.click();
		
	    Thread.sleep(5000);	
		
         String title = driver.getTitle();
        
        if (title.equals("Cookers: Shop for Cookers in Dubai & UAE")) {
			
        	System.out.println("User clicked the cookers link is properly redirect to cookers page");
        	Reporter.log("User clicked the cookers link is redirect to cookers page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the cookers link is not redirect to cookers page");
        	Reporter.log("User clicked the cookers link is not redirect to cookers page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=5,enabled=true)
	private void laundry() throws InterruptedException {
    
		WebElement laundry = driver.findElement(By.xpath("//a[text()='Laundry']"));
		laundry.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Buy Laundry Appliances in Dubai & UAE | Better Life UAE")) {
			
        	System.out.println("User clicked the Laundry link is properly redirect to Laundry page");
        	Reporter.log("User clicked the Laundry link is redirect to Laundry page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Laundry link is not redirect to Laundry page");
        	Reporter.log("User clicked the Laundry link is not redirect to Laundry page");
        	Assert.assertTrue(false);
			
		}
	
        Thread.sleep(5000);	
	}
	
	@Test(priority=6,enabled=true)
	private void dishWasher() throws InterruptedException {
    
		WebElement dishWasher = driver.findElement(By.xpath("//a[text()='Dishwashers']"));
		dishWasher.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Buy Dishwashers at the Best Prices in Dubai & UAE")) {
			
        	System.out.println("User clicked the Dishwashers link is properly redirect to Dishwashers page");
        	Reporter.log("User clicked the Dishwashers link is redirect to Dishwashers page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the small Appliances link is not redirect to small Appliances page");
        	Reporter.log("User clicked the Dishwashers link is not redirect to Dishwashers page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
        
	}
	
	
	@Test(priority=7,enabled=true)
	private void airConditioner() throws InterruptedException {
    
		WebElement airConditioner = driver.findElement(By.xpath("//a[text()='Air Conditioners']"));
		airConditioner.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Air Conditioners (AC) - Buy Air Conditioners in UAE")) {
			
        	System.out.println("User clicked the Air Conditioners link is properly redirect to Air Conditioners page");
        	Reporter.log("User clicked the Air Conditioners link is redirect to Air Conditioners page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Air Conditioners link is not redirect to Air Conditioners page");
        	Reporter.log("User clicked the Air Conditioners link is not redirect to Air Conditioners page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=8,enabled=true)
	private void waterCare() throws InterruptedException {
    
		WebElement waterCare = driver.findElement(By.xpath("//a[text()='Water Care']"));
		waterCare.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Water Care Appliances")) {
			
        	System.out.println("User clicked the Water Care link is properly redirect to Water Care page");
        	Reporter.log("User clicked the Water Care link is redirect to Water Care page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Water Care link is not redirect to Water Care page");
        	Reporter.log("User clicked the Water Care link is not redirect to Water Care page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=9,enabled=true)
	private void vaccumCleaner() throws InterruptedException {
    
		WebElement vaccumCleaner = driver.findElement(By.xpath("//a[text()='Vacuum Cleaners']"));
		vaccumCleaner.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Vacuum Cleaners: Buy Vacuums in Dubai & UAE")) {
			
        	System.out.println("User clicked the Vaccum Cleaner link is properly redirect to Vaccum Cleaner page");
        	Reporter.log("User clicked the Vaccum Cleaner link is redirect to Vaccum Cleaner page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Vaccum Cleaner link is not redirect to Vaccum Cleaner page");
        	Reporter.log("User clicked the Vaccum Cleaner link is not redirect to Vaccum Cleaner page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=10,enabled=true)
	private void kettles() throws InterruptedException {
    
		WebElement kettles = driver.findElement(By.xpath("//a[text()='Kettles']"));
		kettles.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Kettles: Shop for Electric Kettles in Dubai & UAE")) {
			
        	System.out.println("User clicked the Kettles link is properly redirect toKettles page");
        	Reporter.log("User clicked the Kettles link is redirect to Kettles page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Kettles link is not redirect to Kettles page");
        	Reporter.log("User clicked the Kettles link is not redirect to Kettles page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=11,enabled=true)
	private void coffee() throws InterruptedException {
    
		WebElement coffee = driver.findElement(By.xpath("//a[text()='Coffee']"));
		coffee.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Buy Coffee & Tea Appliances in Dubai & UAE | Better Life")) {
			
        	System.out.println("User clicked the Coffee link is properly redirect to Coffee page");
        	Reporter.log("User clicked the Coffee link is redirect to Coffee page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Coffee link is not redirect to Coffee page");
        	Reporter.log("User clicked the Coffee link is not redirect to Coffee page");
        	Assert.assertTrue(false);
			
		}
        
        Thread.sleep(5000);	
		
	}
	
	
	@Test(priority=12,enabled=true)
	private void washingMachines() throws InterruptedException {
    
		WebElement washingMachines = driver.findElement(By.xpath("//a[text()='Washing Machines']"));
		washingMachines.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Washing Machines: Buy Washers Online")) {
			
        	System.out.println("User clicked the Washing Machines link is properly redirect to Washing Machines page");
        	Reporter.log("User clicked the Washing Machines link is redirect to Washing Machines page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Washing Machines link is not redirect to Washing Machines page");
        	Reporter.log("User clicked the Washing Machines link is not redirect to Washing Machines page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=13,enabled=true)
	private void juicers() throws InterruptedException {
    
		WebElement juicers = driver.findElement(By.xpath("//a[text()='Juicers']"));
		juicers.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Juicers: Buy Electric Juicer Machines & Makers")) {
			
        	System.out.println("User clicked the Juicers link is properly redirect to Juicers page");
        	Reporter.log("User clicked the Juicers link is redirect to Juicers page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Juicers link is not redirect to Juicers page");
        	Reporter.log("User clicked the Juicers link is not redirect to Juicers page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
		
	}
	
	@Test(priority=14,enabled=true)
	private void foodProcessors() throws InterruptedException {
    
		WebElement foodProcessors = driver.findElement(By.xpath("//a[text()='Food Processors']"));
		foodProcessors.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Food Processors for Your Kitchen")) {
			
        	System.out.println("User clicked the Food Processors link is properly redirect to Food Processors page");
        	Reporter.log("User clicked the Food Processors link is redirect to Food Processors page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Food Processors link is not redirect to Food Processors page");
        	Reporter.log("User clicked the Food Processors link is not redirect to Food Processors page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=15,enabled=true)
	private void blenders() throws InterruptedException {
    
		WebElement blenders = driver.findElement(By.xpath("//a[text()='Blenders']"));
		blenders.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
       
        
        if (title.equals("Blenders: Buy Blender Machines in Dubai & UAE")) {
			
        	System.out.println("User clicked the Blenders link is properly redirect to Blenders page");
        	Reporter.log("User clicked the Blenders link is redirect to Blenders page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Blenders link is not redirect to Blenders page");
        	Reporter.log("User clicked the Blenders link is not redirect to Blenders page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=16,enabled=true)
	private void mixers() throws InterruptedException {
    
		WebElement mixers = driver.findElement(By.xpath("//a[text()='Mixers']"));
		mixers.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Mixers: Buy Kitchen Mixers in Dubai & UAE")) {
			
        	System.out.println("User clicked the Mixers link is properly redirect to Mixers page");
        	Reporter.log("User clicked the Mixers link is redirect to Mixers page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Mixers link is not redirect to Mixers page");
        	Reporter.log("User clicked the Mixers link is not redirect to Mixers page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
		
	}
	
	
	@Test(priority=17,enabled=true)
	private void siemens() throws InterruptedException {
    
		WebElement siemens = driver.findElement(By.xpath("(//a[text()='Siemens'])[19]"));
		siemens.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Siemens Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the Siemens link is properly redirect to Siemens page");
        	Reporter.log("User clicked the Siemens link is redirect to Siemens page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Siemens link is not redirect to Siemens page");
        	Reporter.log("User clicked the Siemens link is not redirect to Siemens page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=18,enabled=true)
	private void smeg() throws InterruptedException {
    
		WebElement smeg = driver.findElement(By.xpath("(//a[text()='Smeg'])[24]"));
		smeg.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Shop Smeg Products")) {
			
        	System.out.println("User clicked the Smeg link is properly redirect to Smeg page");
        	Reporter.log("User clicked the Smeg link is redirect to Smeg page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Smeg link is not redirect to Smeg page");
        	Reporter.log("User clicked the Smeg link is not redirect to Smeg page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=19,enabled=true)
	private void zanussi() throws InterruptedException {
    
		WebElement zanussi = driver.findElement(By.xpath("//a[text()=' Zanussi']"));
		zanussi.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Zanussi Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the Zanussi link is properly redirect to Zanussi page");
        	Reporter.log("User clicked the Zanussi link is redirect to Zanussi page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Zanussi link is not redirect to Zanussi page");
        	Reporter.log("User clicked the Zanussi link is not redirect to Zanussi page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=20,enabled=true)
	private void terim() throws InterruptedException {
    
		WebElement terim = driver.findElement(By.xpath("(//a[text()='Terim'])[11]"));
		terim.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Terim Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the Terim link is properly redirect to Terim page");
        	Reporter.log("User clicked the Terim link is redirect to Terim page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Terim link is not redirect to Terim page");
        	Reporter.log("User clicked the Terim link is not redirect to Terim page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=21,enabled=true)
	private void forbes() throws InterruptedException {
    
		WebElement Forbes = driver.findElement(By.xpath("(//a[text()='Forbes'])[4]"));
		Forbes.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Forbes Water Purifiers - Better Life UAE")) {
			
        	System.out.println("User clicked the Forbes link is properly redirect to Forbes page");
        	Reporter.log("User clicked the Forbes link is redirect to Forbes page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Forbes link is not redirect to Forbes page");
        	Reporter.log("User clicked the Forbes link is not redirect to Forbes page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=22,enabled=true)
	private void vestfrost() throws InterruptedException {
    
		WebElement vestfrost = driver.findElement(By.xpath("(//a[text()='Vestfrost'])[2]"));
		vestfrost.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Vestfrost")) {
			
        	System.out.println("User clicked the Vestfrost link is properly redirect to Vestfrost page");
        	Reporter.log("User clicked the Vestfrost link is redirect to Vestfrost page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Vestfrost link is not redirect to Vestfrost page");
        	Reporter.log("User clicked the Vestfrost link is not redirect to Vestfrost page");
        	Assert.assertTrue(false);
			
		}
	
        Thread.sleep(5000);	
	}
	
	@Test(priority=23,enabled=true)
	private void hostess() throws InterruptedException {
    
		WebElement hostess = driver.findElement(By.xpath("//a[text()='Hostess']"));
		hostess.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        
        if (title.equals("Shop Appliances by Brand")) {
			
        	System.out.println("User clicked the Hostess link is properly redirect to Hostess page");
        	Reporter.log("User clicked the Hostess link is redirect to Hostess page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Hostess link is not redirect to Hostess page");
        	Reporter.log("User clicked the Hostess link is not redirect to Hostess page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=24,enabled=true)
	private void wolfPower() throws InterruptedException {
    
		WebElement wolfPower = driver.findElement(By.xpath("(//a[text()='Wolf Power'])[3]"));
		wolfPower.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                
        if (title.equals("Wolf Power Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the WolfPower link is properly redirect to WolfPower page");
        	Reporter.log("User clicked the WolfPower link is redirect to WolfPower page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the WolfPower link is not redirect to WolfPower page");
        	Reporter.log("User clicked the WolfPower link is not redirect to WolfPower page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=25,enabled=true)
	private void gorenje() throws InterruptedException {
    
		WebElement gorenje = driver.findElement(By.xpath("(//a[text()='Gorenje'])[18]"));
		gorenje.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
       
        
        if (title.equals("Gorenje Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the Gorenje link is properly redirect to Gorenje page");
        	Reporter.log("User clicked the Gorenje link is redirect to Gorenje page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Gorenje link is not redirect to Gorenje page");
        	Reporter.log("User clicked the Gorenje link is not redirect to Gorenje page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=26,enabled=true)
	private void serviceCenter() throws InterruptedException {
    
		WebElement serviceCenter = driver.findElement(By.xpath("(//a[text()='Service Center'])[2]"));
		serviceCenter.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Better Life Service Center in Dubai, UAE")) {
			
        	System.out.println("User clicked the Service Center link is properly redirect to Service Center page");
        	Reporter.log("User clicked the Service Center link is redirect to Service Center page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Service Center link is not redirect to Service Center page");
        	Reporter.log("User clicked the Service Center link is not redirect to Service Center page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=27,enabled=true)
	private void deliveyAndInstall() throws InterruptedException {
    
		WebElement deliveyAndInstall = driver.findElement(By.xpath("//a[text()='Deliver & Install']"));
		deliveyAndInstall.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Our Services")) {
			
        	System.out.println("User clicked the Delivey And Install link is properly redirect to Delivey And Install page");
        	Reporter.log("User clicked the Service Delivey And Install is redirect to Delivey And Install page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Delivey And Install link is not redirect to Delivey And Install page");
        	Reporter.log("User clicked the Delivey And Install link is not redirect to Delivey And Install page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=28,enabled=true)
	private void productionDemonstration() throws InterruptedException {
    
		WebElement productionDemonstration = driver.findElement(By.xpath("//a[text()='Product Demonstration']"));
		productionDemonstration.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Our Services")) {
			
        	System.out.println("User clicked the Production Demonstration link is properly redirect to Production Demonstration page");
        	Reporter.log("User clicked the Service Production Demonstration is redirect to Production Demonstration page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Production Demonstration link is not redirect to Production Demonstration page");
        	Reporter.log("User clicked the Production Demonstration link is not redirect to Production Demonstration page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=29,enabled=true)
	private void pricePromise() throws InterruptedException {
    
		WebElement pricePromise = driver.findElement(By.xpath("//a[text()='Price Promise']"));
		pricePromise.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Price Promise")) {
			
        	System.out.println("User clicked the Price Promise link is properly redirect to Price Promise page");
        	Reporter.log("User clicked the Service Price Promise is redirect to Price Promise page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Price Promise link is not redirect to Price Promise page");
        	Reporter.log("User clicked the Price Promise link is not redirect to Price Promise page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=30,enabled=true)
	private void easyInstallPlan() throws InterruptedException {
    
		WebElement easyInstallPlan = driver.findElement(By.xpath("//a[text()='Easy Installment Plan']"));
		easyInstallPlan.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Easy Payment Plan")) {
			
        	System.out.println("User clicked the easy Install Plan link is properly redirect to easy Install Plan page");
        	Reporter.log("User clicked the easy Install Plan is redirect to easy Install Plan page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the easy Install Plan link is not redirect to easy Install Plan page");
        	Reporter.log("User clicked the easy Install Plan link is not redirect to easy Install Plan page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=31,enabled=true)
	private void talkToUs() throws InterruptedException {
    
		WebElement talkToUs = driver.findElement(By.xpath("(//a[text()='Talk to us: 04 404 2020'])[2]"));
		talkToUs.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Assistance")) {
			
        	System.out.println("User clicked the Talk To Us link is properly redirect to Talk To Us page");
        	Reporter.log("User clicked the Talk To Us is redirect to Talk To Us page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Talk To Us link is not redirect to Talk To Us page");
        	Reporter.log("User clicked the Talk To Us link is not redirect to Talk To Us page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=32,enabled=true)
	private void catalogues() throws InterruptedException {
    
		WebElement catalogues = driver.findElement(By.xpath("(//a[text()='Catalogues'])[2]"));
		catalogues.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Catalogues")) {
			
        	System.out.println("User clicked the Catalogues link is properly redirect to Catalogues page");
        	Reporter.log("User clicked the Catalogues is redirect to Catalogues page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Catalogues link is not redirect to Catalogues page");
        	Reporter.log("User clicked the Catalogues link is not redirect to Catalogues page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=33,enabled=true)
	private void paymentMethods() throws InterruptedException {
    
		WebElement paymentMethods = driver.findElement(By.xpath("(//a[text()='Payment Methods'])[2]"));
		paymentMethods.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Assistance")) {
			
        	System.out.println("User clicked the Payment Methods link is properly redirect to Payment Methods Assistance page");
        	Reporter.log("User clicked the Payment Methods is redirect to Payment Methods Assistance page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Payment Methods link is not redirect to Payment Methods page");
        	Reporter.log("User clicked the Payment Methods link is not redirect to Payment Methods page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=34,enabled=true)
	private void faqs() throws InterruptedException {
    
		WebElement faqs = driver.findElement(By.xpath("(//a[text()='FAQs'])[3]"));
		faqs.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        System.out.println(title);
       
        
        if (title.equals("Gorenje Home Appliances - Better Life UAE")) {
			
        	System.out.println("User clicked the FAQs link is properly redirect to FAQs page");
        	Reporter.log("User clicked the FAQs is redirect to FAQs page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the FAQs link is not redirect to FAQs page");
        	Reporter.log("User clicked the FAQs link is not redirect to FAQs page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=35,enabled=true)
	private void whoWeAre() throws InterruptedException {
    
		WebElement whoWeAre = driver.findElement(By.xpath("//a[text()='Who We Are?']"));
		whoWeAre.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("About Us")) {
			
        	System.out.println("User clicked the Who We Are link is properly redirect to Who We Are page");
        	Reporter.log("User clicked the Who We Are is redirect to Who We Are page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Who We Are link is not redirect to Who We Are page");
        	Reporter.log("User clicked the Who We Are link is not redirect to Who We Are page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=36,enabled=true)
	private void ourStores() throws InterruptedException {
    
		WebElement ourStores = driver.findElement(By.xpath("(//a[text()='Our Stores'])[2]"));
		ourStores.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Our Stores")) {
			
        	System.out.println("User clicked the Our Stores link is properly redirect to Our Stores page");
        	Reporter.log("User clicked the Our Stores is redirect to Our Stores page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Our Stores link is not redirect to Our Stores page");
        	Reporter.log("User clicked the Our Stores link is not redirect to Our Stores page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=37,enabled=true)
	private void companyNews() throws InterruptedException {
    
		WebElement companyNews = driver.findElement(By.xpath("//a[text()='Company News']"));
		companyNews.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Better Life News")) {
			
        	System.out.println("User clicked the Company News link is properly redirect to Company News page");
        	Reporter.log("User clicked the Company News link is redirect to Company News page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Company News link is not redirect to Company News page");
        	Reporter.log("User clicked the Company News link is not redirect to Company News page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=38,enabled=true)
	private void socialOutReach() throws InterruptedException {
    
		WebElement socialOutReach = driver.findElement(By.xpath("//a[text()='Social Outreach']"));
		socialOutReach.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("About Us")) {
			
        	System.out.println("User clicked the Social Out Reach link is properly redirect to Social Out Reach page");
        	Reporter.log("User clicked the Social Out Reach link is redirect to Social Out Reach page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Social Out Reach link is not redirect to Social Out Reach page");
        	Reporter.log("User clicked the Social Out Reach link is not redirect to Social Out Reach page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=39,enabled=true)
	private void careers() throws InterruptedException {
    
		WebElement careers = driver.findElement(By.xpath("//a[text()='Careers']"));
		careers.click();
		
	    Thread.sleep(5000);	     
               
        Set<String> windows = driver.getWindowHandles();
        
        List<String> li = new ArrayList<String>(windows);
        
        driver.switchTo().window(li.get(1));
        
        String title = driver.getTitle();
                
        if (title.equals("Human Capital - Easa Saleh Al Gurg Group")) {
			
        	System.out.println("User clicked the Careers link is properly redirect to Careers page");
        	Reporter.log("User clicked the Careers link is redirect to Careers page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Careers link is not redirect to Careers page");
        	Reporter.log("User clicked the Careers link is not redirect to Careers page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(2000);	
     
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(3000);	
        
       // WebElement cancel = driver.findElement(By.xpath("(//span[text()='Cancel'])[2]"));
        //cancel.click();
        
        Thread.sleep(3000);	
	}
	
	
	@Test(priority=40,enabled=true)
	private void easaSalehAlGurgGroup() throws InterruptedException {
    
		WebElement easaSalehAlGurgGroup = driver.findElement(By.xpath("//a[text()='Easa Saleh Al Gurg Group']"));
		easaSalehAlGurgGroup.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("About Us")) {
			
        	System.out.println("User clicked the Easa Saleh AlGurg Group link is properly redirect to Easa Saleh AlGurg Group page");
        	Reporter.log("User clicked the Easa Saleh AlGurg Group link is redirect to Easa Saleh AlGurg Group page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Easa Saleh AlGurg Group link is not redirect to Easa Saleh AlGurg Group page");
        	Reporter.log("User clicked the Easa Saleh AlGurg Group link is not redirect to Easa Saleh AlGurg Group page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(3000);	
	}
	
	
	@Test(priority=41,enabled=true)
	private void siteMap() throws InterruptedException {
    
		WebElement siteMap = driver.findElement(By.xpath("(//a[text()='Sitemap'])[1]"));
		siteMap.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("HTML sitemap")) {
			
        	System.out.println("User clicked the SiteMap link is properly redirect to SiteMap page");
        	Reporter.log("User clicked the SiteMap link is redirect to SiteMap page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the SiteMap link is not redirect to SiteMap page");
        	Reporter.log("User clicked the SiteMap link is not redirect to SiteMap page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=42,enabled=true)
	private void deliveryPolicy() throws InterruptedException {
    
		WebElement deliveryPolicy = driver.findElement(By.xpath("(//a[text()='Delivery Policy'])[1]"));
		deliveryPolicy.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Delivery Returns")) {
			
        	System.out.println("User clicked the Delivery Policy link is properly redirect to Delivery Policy page");
        	Reporter.log("User clicked the Delivery Policy link is redirect to Delivery Policy page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Delivery Policy link is not redirect to Delivery Policy page");
        	Reporter.log("User clicked the Delivery Policy link is not redirect to Delivery Policy page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=43,enabled=true)
	private void returnsAndRefunds() throws InterruptedException {
    
		WebElement returnsAndRefunds = driver.findElement(By.xpath("(//a[text()='Returns & Refunds'])[1]"));
		returnsAndRefunds.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Delivery Returns")) {
			
        	System.out.println("User clicked the Returns & Refunds link is properly redirect to Returns & Refunds page");
        	Reporter.log("User clicked the Returns & Refunds link is redirect to Returns & Refunds page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Returns & Refunds link is not redirect to Returns & Refunds page");
        	Reporter.log("User clicked the Returns & Refunds link is not redirect to Returns & Refunds page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=44,enabled=true)
	private void termsAndCondition() throws InterruptedException {
    
		WebElement termsAndCondition = driver.findElement(By.xpath("(//a[text()='Terms & Conditions'])[1]"));
		termsAndCondition.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Terms and Conditions")) {
			
        	System.out.println("User clicked the Terms & Conditions link is properly redirect to Terms & Conditions page");
        	Reporter.log("User clicked the Terms & Conditions link is redirect to Terms & Conditions page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Terms & Conditions link is not redirect to Terms & Conditions page");
        	Reporter.log("User clicked the Terms & Conditions link is not redirect to Terms & Conditions page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=45,enabled=true)
	private void privacyPolicy() throws InterruptedException {
    
		WebElement privacyPolicy = driver.findElement(By.xpath("(//a[text()='Privacy Policy'])[1]"));
		privacyPolicy.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("Privacy Policy")) {
			
        	System.out.println("User clicked the Privacy Policy link is properly redirect to Privacy Policy page");
        	Reporter.log("User clicked the Privacy Policy link is redirect to Privacy Policy page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Privacy Policy link is not redirect to Privacy Policy page");
        	Reporter.log("User clicked the Privacy Policy link is not redirect to Privacy Policy page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=46,enabled=true)
	private void uae() throws InterruptedException {
    
		WebElement uae = driver.findElement(By.xpath("(//a[text()='UAE Consumer Rights'])[1]"));
		uae.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
               
        
        if (title.equals("UAE Consumer")) {
			
        	System.out.println("User clicked the UAE Consumer Rights link is properly redirect to UAE Consumer Rights page");
        	Reporter.log("User clicked the UAE Consumer Rights link is redirect to UAE Consumer Rights page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the UAE Consumer Rights link is not redirect to UAE Consumer Rights page");
        	Reporter.log("User clicked the UAE Consumer Rights link is not redirect to UAE Consumer Rights page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=47,enabled=true)
	private void facebook() throws InterruptedException {
    
		WebElement facebook = driver.findElement(By.xpath("//a[@title='Facebook']"));
		facebook.click();
		
	    Thread.sleep(5000);	
	    
	    Set<String> windows = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList<String>(windows);
		
	    driver.switchTo().window(li.get(2));
	    
	    Thread.sleep(3000);
	    
        String title = driver.getTitle();
               
        
        if (title.equals("Better Life Kitchen Appliances - Home | Facebook")) {
			
        	System.out.println("User clicked the Facebook link is properly redirect to Facebook page");
        	Reporter.log("User clicked the Facebook link is redirect to Facebook page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Facebook link is not redirect to Facebook page");
        	Reporter.log("User clicked the Facebook link is not redirect to Facebook page");
        	Assert.assertTrue(false);
			
		}
		
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=48,enabled=true)
	private void instagram() throws InterruptedException {
    
		WebElement instagram = driver.findElement(By.xpath("//a[@title='Instagram']"));
		instagram.click();
		
	    Thread.sleep(5000);	
	    
	    Set<String> windows = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList<String>(windows);
		
	    driver.switchTo().window(li.get(3));
	    
        String title = driver.getTitle();       
        
        if (title.equals("www.instagram.com")) {
			           //Better Life UAE (@betterlifeuae) • Instagram photos and videos
        	
        	System.out.println("User clicked the Instagram link is properly redirect to Instagram page");
        	Reporter.log("User clicked the Instagram link is redirect to Instagram page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Instagram link is not redirect to Instagram page");
        	Reporter.log("User clicked the Instagram link is not redirect to Instagram page");
        	Assert.assertTrue(false);
			
		}
		
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(3000);	
	}
	
	@Test(priority=49,enabled=true)
	private void linkedIn() throws InterruptedException {
    
		WebElement linkedIn = driver.findElement(By.xpath("//a[@title='linkedin']"));
		linkedIn.click();
		
	    Thread.sleep(5000);	
	    
	    Set<String> windows = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList<String>(windows);
		
	    driver.switchTo().window(li.get(4));
	    
        String title = driver.getTitle();       
        
        if (title.equals("Better Life UAE | LinkedIn")|title.equals("Sign In | LinkedIn")) {
			
        	System.out.println("User clicked the LinkedIn link is properly redirect to LinkedIn page");
        	Reporter.log("User clicked the LinkedIn link is redirect to LinkedIn page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the LinkedIn link is not redirect to LinkedIn page");
        	Reporter.log("User clicked the LinkedIn link is not redirect to LinkedIn page");
        	Assert.assertTrue(false);
			
		}
		
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(3000);	
	}
	
	@Test(priority=50,enabled=true)
	private void youTube() throws InterruptedException {
    
		WebElement youTube = driver.findElement(By.xpath("//a[@title='YouTube']"));
		youTube.click();
		
	    Thread.sleep(5000);	
	    
	    Set<String> windows = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList<String>(windows);
		
	    driver.switchTo().window(li.get(5));
	    
        String title = driver.getTitle();
               
        
        if (title.equals("Better Life Kitchen Appliances and Accessories - YouTube")) {
			
        	System.out.println("User clicked the YouTube link is properly redirect to YouTube page");
        	Reporter.log("User clicked the YouTube link is redirect to YouTube page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the YouTube link is not redirect to YouTube page");
        	Reporter.log("User clicked the YouTube link is not redirect to YouTube page");
        	Assert.assertTrue(false);
			
		}
		
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(5000);	
	}
	

	@Test(priority=51,enabled=true)
	private void register() throws InterruptedException {
    
		WebElement register = driver.findElement(By.xpath("//a[text()='Register']"));
		register.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Create New Customer Account")) {
			
        	System.out.println("User clicked the Register link is properly redirect to Register page");
        	Reporter.log("User clicked the Register link is redirect to Register page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Register link is not redirect to Register page");
        	Reporter.log("User clicked the Register link is not redirect to Register page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=52,enabled=true)
	private void login() throws InterruptedException {
    
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
                       
        if (title.equals("Customer Login")) {
			
        	System.out.println("User clicked the Login link is properly redirect to Login page");
        	Reporter.log("User clicked the Login link is redirect to Login page");
        	Assert.assertTrue(true);
        	
        	Thread.sleep(3000);
        	
        	WebElement userName = driver.findElement(By.xpath("//input[@name='login[username]']"));
        	userName.sendKeys("balaji.p@sysfore.com");
        	
        	Thread.sleep(3000);

        	WebElement password = driver.findElement(By.xpath("//input[@name='login[password]']"));
        	password.sendKeys("Balaji@123");
        	
        	Thread.sleep(3000);

        	WebElement submit = driver.findElement(By.xpath("(//button[@name='send'])[1]"));
        	submit.click();
        	
		} else {

			System.out.println("User clicked the Login link is not redirect to Login page");
        	Reporter.log("User clicked the Login link is not redirect to Login page");
        	Assert.assertTrue(false);
			
		}
		
        Thread.sleep(5000);	
	}
	
	@Test(priority=53,enabled=true)
	private void myOrders() throws InterruptedException {
    
		WebElement myOrders = driver.findElement(By.xpath("//a[text()='My Orders']"));
		myOrders.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("My Orders")) {
			
        	System.out.println("User clicked the MyOrders link is properly redirect to MyOrders page");
        	Reporter.log("User clicked the MyOrders link is redirect to MyOrders page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the MyOrders link is not redirect to MyOrders page");
        	Reporter.log("User clicked the MyOrders link is not redirect to MyOrders page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=54,enabled=true)
	private void myaddress() throws InterruptedException {
    
		WebElement myaddress = driver.findElement(By.xpath("//a[text()='My Addresses']"));
		myaddress.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("Add New Address")) {
			
        	System.out.println("User clicked the My Addresses link is properly redirect to My Addresses page");
        	Reporter.log("User clicked the My Addresses link is redirect to My Addresses page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the My Addresses link is not redirect to My Addresses page");
        	Reporter.log("User clicked the My Addresses link is not redirect to My Addresses page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
	}
	
	@Test(priority=55,enabled=true)
	private void myWishList() throws InterruptedException {
    
		WebElement myWishList = driver.findElement(By.xpath("//a[text()='My Wishlist']"));
		myWishList.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        if (title.equals("My Saved Items (3)")) {
			
        	System.out.println("User clicked the My Wishlist link is properly redirect to My Wishlist page");
        	Reporter.log("User clicked the My Wishlist link is redirect to My Wishlist page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the My Wishlist link is not redirect to My Wishlist page");
        	Reporter.log("User clicked the My Wishlist link is not redirect to My Wishlist page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
	}
	
	@Test(priority=56,enabled=true)
	private void accountSetting() throws InterruptedException {
    
		WebElement accountSetting = driver.findElement(By.xpath("//a[text()='Account Settings']"));
		accountSetting.click();
		
	    Thread.sleep(5000);	
		
        String title = driver.getTitle();
        
        System.out.println();
        
        if (title.equals("My Account")) {
			
        	System.out.println("User clicked the Account Settings link is properly redirect to Account Settings page");
        	Reporter.log("User clicked the Account Settings link is redirect to Account Settings page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the Account Settings link is not redirect to Account Settings page");
        	Reporter.log("User clicked the Account Settings link is not redirect to Account Settings page");
        	Assert.assertTrue(false);
			
		}
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=57,enabled=true)
	private void eSAGLogo() throws InterruptedException {
    
		WebElement accountSetting = driver.findElement(By.xpath("//img[@alt='ESAG logo']"));
		accountSetting.click();
		
	    Thread.sleep(5000);	
	    
        Set<String> windows = driver.getWindowHandles();
	    
	    List<String> li = new ArrayList<String>(windows);
		
	    driver.switchTo().window(li.get(6));
		
        String url = driver.getCurrentUrl();
        
        if (url.equals("https://www.algurg.com/")) {
			
        	System.out.println("User clicked the ESAG logo link is properly redirect to ESAG logo page");
        	Reporter.log("User clicked the ESAG logo link is redirect to ESAG logo page");
        	Assert.assertTrue(true);
        	
		} else {

			System.out.println("User clicked the ESAG logo link is not redirect to ESAG logo page");
        	Reporter.log("User clicked the ESAG logo link is not redirect to ESAG logo page");
        	Assert.assertTrue(false);
			
		}
        
        driver.switchTo().window(li.get(0));
        
        Thread.sleep(5000);	
	}
	
	
	@Test(priority=58,enabled=true)
	private void stayUptoDate() throws InterruptedException {
    
		
		WebElement newsLetter = driver.findElement(By.xpath("(//input[@id='newsletter_footer'])[2]"));
		newsLetter.sendKeys("Test123@mailinator.com");
		
		Thread.sleep(2000);
		
		WebElement newsLetterSubmit = driver.findElement(By.xpath("(//button[@title='Subscribe'])[2]"));
		newsLetterSubmit.click();
		
		try {
			
			WebElement newsletterPopup = driver.findElement(By.xpath("//div[text()='This email address is already assigned to another user.']"));
			
			if (newsletterPopup.isDisplayed()) {
				
				System.out.println("user entered existing email address in to news letter subscription its throwsing throwing in the err msg");
				Assert.assertTrue(false);
				Reporter.log("user entered existing email address in to news letter subscription its throwing in the err msg");
				
			}
			
		} catch (Exception e) {
			
			System.out.println("user entered new email address in to news letter subscription, it not throwing in the err msg");
			Assert.assertTrue(true);
			Reporter.log("user entered new email address in to news letter subscription, it not throwing in the err msg");
			
		}
		

		Thread.sleep(10000);
		
	}
	
}
