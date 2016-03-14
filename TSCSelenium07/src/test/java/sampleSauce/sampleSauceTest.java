package sampleSauce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
 
import java.net.URL;
 
public class sampleSauceTest {
 
	  public static final String USERNAME = "YOUR_USERNAME";
	  public static final String ACCESS_KEY = "YOUR_ACCESS_KEY";
	  public static final String URL = "http://lannt90:61672102-848f-44b1-afae-41cdcbe2d1aa@ondemand.saucelabs.com:80/wd/hub";
	 
	  public static void main(String[] args) throws Exception {
	 
	    DesiredCapabilities caps = DesiredCapabilities.chrome();
	    caps.setCapability("platform", "Windows 7");
	    caps.setCapability("version", "48.0");
	    caps.setCapability("name", "Sauce Sample Test");
	 
	    WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
	 
	    /**
	 * Goes to Sauce Lab's guinea-pig page and prints title
	 */
	 
	    driver.get("https://saucelabs.com/test/guinea-pig");
	    System.out.println("title of page is: " + driver.getTitle());
	 
	    driver.quit();
  }
}
