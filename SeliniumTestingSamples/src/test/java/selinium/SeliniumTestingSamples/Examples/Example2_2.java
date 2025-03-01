package selinium.SeliniumTestingSamples.Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

// Facebook on Firefox
public class Example2_2 {
	public static void main(String[] args) {
		
		WebDriver driver = new FirefoxDriver();
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Facebook – log in or sign up";
		
		if(actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("Verification is successful");
			System.out.println("Home page title is: " + actualTitle);
				
		}
		else {
			System.out.println("Verification is failed, Match not found");
		}
		driver.close();
		
	}
}
