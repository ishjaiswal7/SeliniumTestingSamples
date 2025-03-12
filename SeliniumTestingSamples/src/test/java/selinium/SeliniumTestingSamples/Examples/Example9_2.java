package selinium.SeliniumTestingSamples.Examples;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//CONFIRM BOX EXAMPLE 1
public class Example9_2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		WebElement confirmBoxElement = driver.findElement(By.id("confirmexample"));
		confirmBoxElement.click();
		
		Thread.sleep(5000);
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.accept();
		
		//Page scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 550)");
	}
}