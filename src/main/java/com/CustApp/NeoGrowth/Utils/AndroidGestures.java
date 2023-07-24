package com.CustApp.NeoGrowth.Utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class AndroidGestures {
	AndroidDriver driver;
	

	
	
	/**
	 * @author Pavan.Joshi
	 * This generic method use for android longPress
	 * @param ele
	 */
	public void LongpressAction(WebElement ele) {
	 
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",ImmutableMap.of("elementId", 
				((RemoteWebElement)ele).getId(),"duration",2000));
		
	}
	
	/**
	 * @author Pavan.Joshi
	 * This generic method use to swipe action
	 * @param ele
	 * @param direction
	 */
	public void swipeaction(WebElement ele,String direction) {
		
		((JavascriptExecutor)driver).executeScript("mobile: swipeGesture",ImmutableMap.of("elementId", 
				((RemoteWebElement)ele).getId(),
				"direction",direction,
				"precent",0.75
				));
	}
	
	/**
	 * @author Pavan.Joshi
	 * This method used for Scroll till particular text
	 * @param text
	 */
	public void ScrollTOtext(String text) {
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+text+"\"));"));
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
