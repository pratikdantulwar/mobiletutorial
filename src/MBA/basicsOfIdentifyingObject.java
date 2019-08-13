package MBA;

import java.net.MalformedURLException;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class basicsOfIdentifyingObject extends BaseMobile {
	
	public static void main(String[] args) throws MalformedURLException {
		
		//setting capabilities
		AndroidDriver<AndroidElement> driver = capabilities();
		System.out.println("invoking chrome browser");
		driver.get("http://www.google.com");
		System.out.println("chrome browser invoked");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//xpath id, className, androidUiautomator
		//xpath syntax  ---		//tagName[@attribute='value']
		
		//driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.close();
		System.out.println("chrome browser closed");
		
	}

}
