package com.sgtesting.actitime.utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class ApplicationDependent {
	
	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public static void waitForElement(WebDriver oBrowser,final By by)
	{
		try
		{
			Wait<WebDriver> wait=new FluentWait<WebDriver>(oBrowser)
					.withTimeout(Duration.ofSeconds(10))
					.pollingEvery(Duration.ofSeconds(2))
					.ignoring(NoSuchElementException.class);
			
			WebElement oEle=wait.until(new Function<WebDriver, WebElement>()
			{
				public WebElement apply(WebDriver driver)
				{
					return driver.findElement(by);
				}
			});
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static boolean isObjectPresent(WebDriver oBrowser,By by)
	{
		boolean status=false;
		try
		{
			oBrowser.findElement(by);
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}

	/**
	 * Created By:
	 * Created Date:
	 * Reviewed By:
	 * Reviewed Date:
	 * Parameters:
	 * Return Type:
	 * Description:
	 * Purpose:
	 */
	public static boolean isAlertPresent(WebDriver oBrowser)
	{
		boolean status=false;
		try
		{
			oBrowser.switchTo().alert();
			status=true;
		}catch(Exception e)
		{
			status=false;
		}
		return status;
	}
}
