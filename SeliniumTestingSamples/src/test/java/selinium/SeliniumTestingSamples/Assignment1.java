package selinium.SeliniumTestingSamples;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;
import java.util.List;

import javax.swing.text.html.HTML;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Exercise: Automate 'Practice Form' with Selenium WebDriver.
 * 
 * 1. Open this below link:
 * https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
 * 
 * 2. Login using the given username and password.
 * 
 * 3. Select My Info Tab from left pane.
 * 
 * 4. Fill all the web elements present in Personal Details form.
 */

public class Assignment1 {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		String Url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.manage().window().maximize();
		
		WebElement username = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		WebElement password = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		
		username.sendKeys("Admin");
//		Thread.sleep(1000);
		password.sendKeys("admin123");
//		Thread.sleep(1000);
		
		WebElement submit = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		submit.click();
//		Thread.sleep(3000);
	
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		
		//Personal Details
		WebElement empFName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[1]/div[2]/input"));
		WebElement empMName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[2]/div[2]/input"));
		WebElement empLName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div/div/div[2]/div[3]/div[2]/input"));
//		WebElement nickName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div[2]/div/div/div[2]/input"));
		
		empFName.sendKeys(Keys.CONTROL + "a");
		empFName.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		empMName.sendKeys(Keys.CONTROL + "a");
		empMName.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		empLName.sendKeys(Keys.CONTROL + "a");
		empLName.sendKeys(Keys.DELETE);
		Thread.sleep(500);
/*
		nickName.sendKeys(Keys.CONTROL + "a");
		nickName.sendKeys(Keys.DELETE);
		Thread.sleep(500);
	*/	
		
		empFName.sendKeys("Ish");
		Thread.sleep(500);
		empMName.sendKeys("S");
		Thread.sleep(500);
		empLName.sendKeys("Jaiswal");
//		Thread.sleep(500);
//		nickName.sendKeys("IJ");
//		Thread.sleep(500);
		
		
		WebElement empId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input"));
		WebElement otherId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[2]/div/div[2]/input"));
		
		empId.sendKeys(Keys.CONTROL + "a");
		empId.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		otherId.sendKeys(Keys.CONTROL + "a");
		otherId.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		empId.sendKeys("20734");
		Thread.sleep(500);
		otherId.sendKeys("XXXX X107");
		Thread.sleep(500);
		
		
		WebElement dLNum = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[1]/div/div[2]/input"));
		WebElement expDate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[2]/div[2]/div/div[2]/div/div/input"));
		
		dLNum.sendKeys(Keys.CONTROL + "a");
		dLNum.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		expDate.sendKeys(Keys.CONTROL + "a");
		expDate.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		dLNum.sendKeys("TN1234567890");
		Thread.sleep(500);
		expDate.sendKeys("2032-11-01");
		Thread.sleep(500);

/*
		WebElement ssnNum = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[1]/div/div[2]/input"));
		WebElement sinNum = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[3]/div[2]/div/div[2]/input"));
		
		ssnNum.sendKeys(Keys.CONTROL + "a");
		ssnNum.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		sinNum.sendKeys(Keys.CONTROL + "a");
		sinNum.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		
		ssnNum.sendKeys("20XX-XXXX-101");
		Thread.sleep(500);
		sinNum.sendKeys("10XX-XXXX-201");
		Thread.sleep(500);

*/		
		

        // Select Nationality
        WebElement nationalityDropdown = driver.findElement(By.xpath("//label[text()='Nationality']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text')]"));
        nationalityDropdown.click();
        Thread.sleep(1000); // Allow dropdown to open

        List<WebElement> nationalityOptions = driver.findElements(By.xpath("//div[@role='option']"));
        for (WebElement option : nationalityOptions) {
            if (option.getText().equals("Indian")) { // Change to desired option
                option.click();
                break;
            }
        }

        Thread.sleep(1000); // Wait before selecting next dropdown

        // Select Marital Status
        WebElement maritalDropdown = driver.findElement(By.xpath("//label[text()='Marital Status']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text')]"));
        maritalDropdown.click();
        Thread.sleep(1000); // Allow dropdown to open

        List<WebElement> maritalOptions = driver.findElements(By.xpath("//div[@role='option']"));
        for (WebElement option : maritalOptions) {
            if (option.getText().equals("Other")) { // Change to desired option
                option.click();
                break;
            }
        }
		
        
        // DoB
		WebElement dob = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[1]/div/div[2]/div/div/input"));
		
		dob.sendKeys(Keys.CONTROL + "a");
		dob.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		dob.sendKeys("2002-08-08");
		Thread.sleep(500);
		
		
		//Radio Button
		//Gender
		WebElement maleRadioBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[1]/div[2]/div/label/span"));
		WebElement femaleRadioBtn = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[3]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/label/span"));
		boolean selectState = maleRadioBtn.isSelected();
		if(!selectState) {
			maleRadioBtn.click();
		}

		
		WebElement saveBtn1 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button"));
		saveBtn1.click();
		Thread.sleep(2000);
		
		//Scroll
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy (0,400)");
		
		//Custom Fields
		// Select Blood Type
        WebElement bloodDropdown = driver.findElement(By.xpath("//label[text()='Blood Type']/ancestor::div[contains(@class, 'oxd-input-group')]//div[contains(@class, 'oxd-select-text')]"));
        bloodDropdown.click();
        Thread.sleep(1000); // Allow dropdown to open

        List<WebElement> bloodOptions = driver.findElements(By.xpath("//div[@role='option']"));
        for (WebElement option : bloodOptions) {
            if (option.getText().equals("B+")) {
                option.click();
                break;
            }
        }
        // Test_Field
		WebElement testField = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[1]/div/div[2]/div/div[2]/input"));
		
		testField.sendKeys(Keys.CONTROL + "a");
		testField.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		testField.sendKeys("101");
		Thread.sleep(500);
		
		WebElement saveBtn2 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[2]/div/form/div[2]/button"));
		saveBtn2.click();
		Thread.sleep(2000);
		
		//Scroll
		jse.executeScript("window.scrollBy (0,400)");
				
		
		//Add Attachment
		WebElement addBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div[1]/div/button"));
		addBtn.click();
		Thread.sleep(500);
		
		/*
		WebElement browseBtn = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[1]/div/div/div/div[2]/div/div[1]"));
		browseBtn.click();
		Thread.sleep(500);
		
		
		String file = "C:\\Users\\lenovo\\Pictures\\Screenshots\\Screenshot 2025-01-31 001850.png";
		StringSelection selection = new StringSelection(file);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Thread.sleep(2000);
		*/
		
		WebElement fileUpload = driver.findElement(By.xpath("//input[@type='file']"));
		fileUpload.sendKeys("C:\\Users\\lenovo\\Pictures\\Screenshots\\Screenshot 2025-01-31 001850.png");
		
		WebElement comment = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[2]/div/div/div/div[2]/textarea"));
		
		comment.sendKeys(Keys.CONTROL + "a");
		comment.sendKeys(Keys.DELETE);
		Thread.sleep(500);
		
		comment.sendKeys("Picture Uploaded");
		Thread.sleep(500);
		
		WebElement saveBtn3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[3]/div/form/div[3]/button[2]"));
		saveBtn3.click();
		Thread.sleep(2000);
		
//		driver.quit();
		
	}
}
