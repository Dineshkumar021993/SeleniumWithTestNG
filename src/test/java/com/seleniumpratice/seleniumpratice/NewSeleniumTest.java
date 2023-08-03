package com.seleniumpratice.seleniumpratice;


import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;


public class NewSeleniumTest {
	private WebDriver driver;

	@BeforeTest
	public void setUp() {
		// Initialize WebDriver
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void ExploreButtonTest() {
		driver.get("https://finsights.biz/");
		WebElement exploreButton = driver.findElement(By
				.xpath("/html/body/div[1]/section[1]/div/div[1]/div/div[7]/div/div/a"));

		// Wait for the "Explore" button to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(exploreButton));

		// Perform mouse hover on the "Explore" button
		Actions actions = new Actions(driver);
		actions.moveToElement(exploreButton).perform();

		// Click on the "Explore" button
		exploreButton.click();
	}
	
	
	

	@Test(priority = 2)
	public void DownloadForFreeButtonTest() {
		// Wait for the new page to load
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait1.until(ExpectedConditions.numberOfWindowsToBe(2));

		// Switch to the new page
		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}

		// Now, find the "Download for Free" button on the new page
		WebElement downloadForFree = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[1]/header[1]/div/div[3]/div/div/div/div/a")));

		// Perform mouse hover on the "Download for Free" button (optional)
		Actions actions1 = new Actions(driver);
		actions1.moveToElement(downloadForFree).perform();

		// Click on the "Download for Free" button
		downloadForFree.click();
	}

	@Test(priority = 3)
	public void DownloadDesktopAppButtonTest() {
		WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait2.until(ExpectedConditions.numberOfWindowsToBe(3));

		// Switch to the new page
		for (String windowHandle : driver.getWindowHandles()) {
			driver.switchTo().window(windowHandle);
		}

		// Find the "Download Now(for desktop app)" button using its XPath
		WebElement downloaddesktopapp = driver.findElement(By.xpath("//*[@id=\"elementor-tab-content-6261\"]/div/section/div/div/div/div[2]/div/div/a/span/span"));

		// Click on the "Explore" button
		downloaddesktopapp.click();


		// Perform mouse hover on the "Explore" button
		Actions actions2 = new Actions(driver);
		actions2.moveToElement(downloaddesktopapp).perform();
	}

	@Test(priority = 4)
	public void GstItRecButtonTest() {
		// Find the "GSTITREC" button using its XPath
		WebElement GSTITREC = driver.findElement(By
				.xpath("//*[@id=\"menu-1-2c896bb\"]/li[2]/a"));

		// Wait for the "signUp" button to be clickable
		WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait3.until(ExpectedConditions.elementToBeClickable(GSTITREC));

		// Perform mouse hover on the "signUp" button
		Actions actions3 = new Actions(driver);
		actions3.moveToElement(GSTITREC).perform();

		// Click on the "signUp" button
		GSTITREC.click();
	}

	@Test(priority = 5)
	public void SignUpButtonTest() {
		// Find the "signUp" button using its XPath
		WebElement Signup = driver.findElement(By.
				xpath("/html/body/div[1]/section[1]/div/div/div/div/div/div/div/header[1]/div/div[4]/div/div/div/div/a/span/span"));

		// Wait for the "signUp" button to be clickable
		WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait4.until(ExpectedConditions.elementToBeClickable(Signup));

		// Perform mouse hover on the "signUp" button
		Actions actions4 = new Actions(driver);
		actions4.moveToElement(Signup).perform();

		// Click on the "signUp" button
		Signup.click();

		driver.navigate().back();



		WebElement ScheduleFreeInstallation = driver.findElement(By
				.xpath("/html/body/div[1]/section[2]/div/div[1]/div/section/div/div[2]/div/div/div/div/a/span/span"));

		// Wait for the "Explore" button to be clickable
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(ScheduleFreeInstallation));

		// Perform mouse hover on the "Explore" button
		Actions actions = new Actions(driver);
		actions.moveToElement(ScheduleFreeInstallation).perform();

		// Click on the "Explore" button
		ScheduleFreeInstallation.click();
		
		
//		try {
//		    Thread.sleep(20000); // 20,000 milliseconds = 20 seconds
//		} catch (InterruptedException e) {
//		    e.printStackTrace();
//		}


		try {
		    TimeUnit.SECONDS.sleep(20); // 20 seconds
		} catch (InterruptedException e) {
		    e.printStackTrace();
		}


	}



	@AfterTest
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}



