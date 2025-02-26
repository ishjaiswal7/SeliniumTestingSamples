package selinium.SeliniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


//Dropdown Scenerio to Automate
public class Example3_1_3 {
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		String URL = "https://selenium08.blogspot.com/2019/11/dropdown.html";
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		// Locate dropdown element on web page by By.xpath.
		WebElement dropdown = driver.findElement(By.xpath("//select[@name='country']"));

		// Verify the dropdown is enabled and visible. 
		if(dropdown.isEnabled() && dropdown.isDisplayed()) {
			System.out.println("Dropdown is enabled ad visible");
		}
		else {

			System.out.println("Dropdown is not visible");
		}
		
		// Create an object of Select class and pass the dropdown of type WebElement as an argument.
		Select select = new Select(dropdown);

		// Verify that dropdown does not allow the multiple selections. 
		if(select.isMultiple()) {
			System.out.println("Dropdown list accepts multiple choices");
		}
		else {
			System.out.println("Dropdown list does not accept multiple choices"); 
		}

		// Call getOptions() method to get all get size of list. options of list. size() method is used to
		int listSize = select.getOptions().size();
		System.out.println("List size: " + listSize);

		// Select the option "India" by sending visible text.
		select.selectByVisibleText("India");

		//Check that "India" is selected as an option or not. 
		String getText = select.getFirstSelectedOption().getText();
		System.out.println("Selected option: " + getText);
		
		// Close the browser.
		//driver.close();
	}
}
