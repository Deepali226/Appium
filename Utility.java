package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Utility {
	static AppiumDriver<MobileElement> driver;
	Utility(AppiumDriver<MobileElement> appiumDriver){
		Utility.driver = appiumDriver;
	}
	
	
	public static AppiumDriver<MobileElement> setPreRequisites() throws MalformedURLException {
		DesiredCapabilities cap = new DesiredCapabilities();
		/*starts setting desired capabilities for mobile phone*/
		cap.setCapability("deviceName","Galaxy M31s");
		cap.setCapability("udid","RZ8N82FQN9K");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","11");
		/*setting desired capabilities for mobile application which we are going to test*/
		// For this we have to download apk info where we can find appPakage and AppActivity
		cap.setCapability("appPackage","com.sec.android.app.popupcalculator");
		cap.setCapability("appActivity","com.sec.android.app.popupcalculator.Calculator");
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver = new AppiumDriver<MobileElement>(url,cap);

		return driver;
	}
	
	public static MobileElement getMobileElements(By locator) {
		MobileElement mElement = driver.findElement(locator);
		return mElement;
	}

}
