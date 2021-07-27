package appiumtests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculatorTest extends Utility {


	WebDriver driver;  //for both mobile and web application
	static AppiumDriver<MobileElement> appiumDriver; //specific to mobile app
	AndroidDriver<MobileElement> androidDriver; // specific to adroid app

	CalculatorTest(AppiumDriver<MobileElement> appiumDriver) {
		super(appiumDriver);
	}

	public static void main(String[] str) throws InterruptedException {
		try {
			testCalculatorFunctios();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

	public static void testCalculatorFunctios() throws MalformedURLException, InterruptedException {
		appiumDriver = setPreRequisites();
		test();
	}

	private static void test() throws InterruptedException {
		System.out.println("...................Cacluator Application is started ..............");
		MobileElement one = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_01"));
		MobileElement plus = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_add"));
	    MobileElement two = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_02"));
		MobileElement fEqual = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));
		
		one.click();
		plus.click();
		two.click();
		fEqual.click();
		
		MobileElement fResult=getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));
		System.out.println("First Result is => "+fResult.getText());
		System.out.println("First Result is completed");
		System.out.println("=========================================================================");
		
		Thread.sleep(5000);
		
		MobileElement five = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_05"));
		MobileElement multi = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_mul"));
		MobileElement six = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_06"));
		MobileElement sEqual = getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_keypad_btn_equal"));

		five.click();
		multi.click();
		six.click();
		sEqual.click();
		
		MobileElement sResult=getMobileElements(By.id("com.sec.android.app.popupcalculator:id/calc_edt_formula"));	
		System.out.println("Second Result is "+sResult.getText());
		System.out.println("Second Result is completed");
		
		System.out.println("...................Cacluator Application is stopped ..............");


	}
}
