package com.seleniumpratice.seleniumpratice;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestNGpratice {


	// Initialize WebDriver
	@Test
	public void explorebutton() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://finsights.biz/");

		//2nd task click on explore button for tally on mobile page

		// Find the "Explore" button using its XPath

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
	

}
