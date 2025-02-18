package selinium.SeliniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//ELEMENT: Dropdown

//HTML Dropdown using Select Class
public class Example3_1_1 {
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		//Create an object of Select class and pass the dropdown of type WebElement as an argument.	
		WebElement dropdown1 = driver.findElement(By.id("searchDropdownBox"));
		Select dropdown = new Select(dropdown1);
		dropdown.selectByVisibleText("Books");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.ENTER);
	}
}
