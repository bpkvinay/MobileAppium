package com.CustApp.NeoGrowth;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;


public class appiumBasics {
	
	@Test
	public void appiumTest() throws MalformedURLException {
		
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Pavan.Joshi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		.withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		
		UiAutomator2Options options=new UiAutomator2Options();
		options.setDeviceName("PavanDevice API 31");
		options.setApp("C:\\Users\\Pavan.Joshi\\eclipse-workspace\\com.CustApp.appium\\src\\test\\ResourceFiles\\ApiDemos-debug.apk");
		
		
		
		
		AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		
		
		
		
	}

}
