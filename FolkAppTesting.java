package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FolkAppTesting {

	WebDriver driver;  //for both mobile and web application
	static AppiumDriver<MobileElement> appiumDriver; //specific to mobile app
	AndroidDriver<MobileElement> androidDriver; // specific to adroid app

	public static void main(String[] str) {
		try {
			openFolkApp();
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static DesiredCapabilities getDesiredCapabilies() {
		DesiredCapabilities cap = new DesiredCapabilities();
		/*starts setting desired capabilities for mobile phone*/
		cap.setCapability("deviceName","Galaxy M31s");
		cap.setCapability("udid","RZ8N82FQN9K");
		cap.setCapability("platformName","Android");
		cap.setCapability("platformVersion","11");
		/*setting desired capabilities for mobile application which we are going to test*/
		// For this we have to download apk info where we can find appPakage and AppActivity
		cap.setCapability("appPackage","in.folknet.folks");
		cap.setCapability("appActivity","in.folknet.folkevents.MainActivity");
		return cap;

	}
	public static void openFolkApp() throws MalformedURLException {
		DesiredCapabilities cap = getDesiredCapabilies();
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		appiumDriver = new AppiumDriver<MobileElement>(url,cap);
		System.out.print("Application started ..");
	}

}
