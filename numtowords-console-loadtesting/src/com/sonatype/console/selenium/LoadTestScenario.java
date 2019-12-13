package com.sonatype.console.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoadTestScenario {

	public static WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

	@Test(enabled = true, description = Constants.test0Description)
	static public void testcase0() {

		throw new SkipException(Constants.test0Skip);
	}

	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test1Description)
	static public void testcase1(String URL) {
		// launch browser and direct it to the Base URL
			driver.get(URL);
		// get the actual value of the title
		String actualTitle = driver.getTitle();
		/*
		 * compare the actual title of the page with the expected one and print the
		 * result as "Passed" or "Failed"
		 */
		Assert.assertEquals(actualTitle, Constants.expectedTitleInput, Constants.test1Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test2Description)
	static public void testcase2(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test2Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleOutputTest2, Constants.test2Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test3Description)
	static public void testcase3(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test3Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleInput, Constants.test3Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test4Description)
	static public void testcase4(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test4Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleInvalid, Constants.test4Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test5Description)
	static public void testcase5(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test5Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleOutputTest5, Constants.test5Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test6Description)
	static public void testcase6(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test6Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleInput, Constants.test6Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test7Description)
	static public void testcase7(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test7Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleInput, Constants.test7Error);
	}
	@Parameters({ "url-param" })
	@Test(enabled = true, description = Constants.test8Description)
	static public void testcase8(String URL) {

		driver.get(URL);

		WebElement numberTextBox = driver.findElement(By.id(Constants.inputNumber));
		numberTextBox.sendKeys(Constants.test8Input);
		WebElement submitButton = driver.findElement(By.id(Constants.submitButton));
		submitButton.click();
		String actualTitle = driver.getTitle();
		Assert.assertEquals(actualTitle, Constants.expectedTitleInput, Constants.test8Error);
	}

}