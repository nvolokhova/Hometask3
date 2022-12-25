package Hometask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) throws Exception {
	// Create a new instance of Chrome driver
	WebDriver driver = new ChromeDriver();
						
	driver.manage().window().maximize();
						
	driver.navigate().to("https://workoglobe.com/");
	
	//Enter text in the Search field
	driver.findElement(By.cssSelector("#home > div.page.page-1 > div.wrapper.df-c > div.search.df-c.ai-c > div:nth-child(2) > div > form > input")).sendKeys("QA Engineer");
	Thread.sleep(1000);
	
	// Click the Search button
	driver.findElement(By.xpath("//*[@id=\"home\"]/div[1]/div[2]/div[2]/div[2]/div/form/button")).click();
	Thread.sleep(1000);
	
	//Close the browser
	driver.quit();


	}

}
