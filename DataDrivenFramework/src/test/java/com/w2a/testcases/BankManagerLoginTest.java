package com.w2a.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestBase;

public class BankManagerLoginTest extends TestBase {

	@Test
	public void loginAsBankManager() throws InterruptedException {

		log.debug("Inside Log Test");
		driver.findElement(By.xpath(OR.getProperty("bmlBtn"))).click();
		Thread.sleep(3000);

		Assert.assertTrue(isElementPresent(By.xpath(OR.getProperty("addCustBtn"))), "Login Not Successful!");
		log.debug("Successfully Test passed");

	}

}
