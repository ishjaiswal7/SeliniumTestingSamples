package selinium.SeliniumTestingSamples.Examples;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Dropdown by Value or Index
public class Example3_1_2 {
	
	public static void main(String[] args) {
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.leafground.com/select.xhtml");
			driver.manage().window().maximize();
	
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6000));
			
			WebElement dropDown1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
			Select select = new Select(dropDown1);
			
			select.selectByIndex(1);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			
			select.selectByVisibleText("Cypress");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
			
			List<WebElement> listOfOptions = select.getOptions();
			int size = listOfOptions.size();
			System.out.println("Number of Elements : " + size);
			
			//Using Sendkeys()
			dropDown1.sendKeys("Playwright");
	}
}
