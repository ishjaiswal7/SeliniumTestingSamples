package selinium.SeliniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//Firefox PageSource
public class Example2_3 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.google.com/";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
		String getCurrentUrl = driver.getCurrentUrl();
		System.out.println("Current URL of Home page: "+ getCurrentUrl);
		String getPageSource = driver.getPageSource();
		System.out.println("Page Source:\n" + getPageSource);
		driver.close();
		
	}
}
