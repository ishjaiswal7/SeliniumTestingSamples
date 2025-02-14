package selinium.SeliniumTestingSamples.Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//TextBox Example 2
public class Example1_2 {
	public static void main(String args[]) {
		WebDriver driver = new ChromeDriver();
		
		//Go to leafground.com
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		
		WebElement textBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:name\"]"));
		textBox.sendKeys("Ish Jaiswal");
		
		WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt99\"]"));
		emailBox.sendKeys("ish@gmail.com");
		
		WebElement appendBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
		appendBox.sendKeys(", India");
		
		WebElement retriveText = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt97\"]"));
		String value = retriveText.getAttribute("value");
		System.out.println(value);
		
		WebElement clearBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt95\"]"));
		clearBox.clear();
		
		WebElement disabledBox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt93\"]"));
		boolean enabled = disabledBox.isEnabled();
		System.out.println(enabled);
		
		
	}
}
