package Hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise1 {

	public static void main(String[] args) throws Exception {
		// Create a new instance of Chrome driver
		WebDriver driver = new ChromeDriver();
		
		//Open google.com
		
		String URL = "https://google.com";
		driver.get(URL);
		
		String actualUrl = driver.getCurrentUrl();
		
		if (actualUrl.equals(URL)){
			System.out.println("Test PASSED");
			}
			else { 
			System.out.println("Test FAILED");
			//In case  of Fail, you like to print the actual and expected URL for the record purpose
			//System.out.println("Actual URL is: " + actualUrl);
			//System.out.println("Expected URL is: " + URL);	
			}
		
		// Accept cookies
		driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]")).click();
		
		//Enter text in the Search field
		driver.findElement(By.cssSelector("body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.RNNXgb > div > div.a4bIc > input")).sendKeys("Automation");
		Thread.sleep(1000);
				
		
		//Close the browser
		driver.quit();

	}
	}
