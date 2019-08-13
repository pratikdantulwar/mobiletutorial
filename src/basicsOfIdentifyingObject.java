import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basicsOfIdentifyingObject extends base {
	
	public static void main(String[] args) throws MalformedURLException {
		
		//setting capabilities
		AndroidDriver<AndroidElement> driver = capabilities();
		//driver.get("http://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id, className, androidUiautomator
		//xpath syntax  ---		//tagName[@attribute='value']
		
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		
	}

}
