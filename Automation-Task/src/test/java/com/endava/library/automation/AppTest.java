package com.endava.library.automation;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.endava.library.automation.config.SeleniumTestCaseContext;

import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SeleniumTestCaseContext.class)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
public class AppTest {

	// @Value("${liblogo}")
	private String xpath = "/html/body/div[1]/div/div[1]/a";
	
	private String rolesMenuBarItem = "/html/body/div[1]/div/div[2]/ul[1]/li[2]/a";

	@Autowired
	private WebDriver webDriver;

	@Test
	public void test() {
		System.out.println(xpath);
		webDriver.get("https://localhost:44300");

		waitElement(xpath);
		WebElement logo = webDriver.findElement(By.xpath(xpath));
		
		assertThat("Logo image is displayed", logo.isDisplayed());
		
		logo.click();
		waitElement(xpath);
		
		WebElement roles = webDriver.findElement(By.xpath(rolesMenuBarItem));
		
		assertThat("Role page is not available.", roles == null);
		System.out.println(xpath + " was clicked");
	}

	private void waitElement(String element) {
		WebDriverWait wait = new WebDriverWait(webDriver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
		System.out.println(element + " has loaded...");
	}

}
