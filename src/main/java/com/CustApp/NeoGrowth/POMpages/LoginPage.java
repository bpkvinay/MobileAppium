package com.CustApp.NeoGrowth.POMpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.utils.ProxyFactory;

public class LoginPage {
	AndroidDriver driver;
	
	//here store element address
	@AndroidFindBy(id="")
	private WebElement enternumber;
	
	
	public LoginPage(AndroidDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver),this);
	}
	
	//Here generate getters and setters
	
	
	
	

}
