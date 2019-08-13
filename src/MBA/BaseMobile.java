package MBA;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.remote.MobileCapabilityType;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BaseMobile {

	public static AndroidDriver<AndroidElement> capabilities() throws MalformedURLException {
		// TODO Auto-generated method stub
		
		//File f = new File("src");
		//File fs = new File(f, "ApiDemos-debug.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Nexus5X");
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel2");
		//cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		//cap.setCapability(MobileCapabilityType.APP, "chrome");
		
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://172.26.62.28:4723/wd/hub"), cap);
		
		return driver;
		
		//AndriodUiAutomator

	}

}
