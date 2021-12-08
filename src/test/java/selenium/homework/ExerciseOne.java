package selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseOne {
	public static void main(String[] args) throws InterruptedException {
		
		
		String url = "http://demoqa.com/text-box";
		
		//set system property for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\estra\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		//create object of webdriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//navigate to url 
		driver.get(url);
		
		//enter full name field
		driver.findElement(By.id("userName")).sendKeys("Ariana");
		
		//enter email in field
		driver.findElement(By.id("userEmail")).sendKeys("ari.luna.lopez@gmail.com");
		
		//enter current address
		driver.findElement(By.id("currentAddress")).sendKeys("123 laurel st");
		
		//enter permanent address
		driver.findElement(By.id("permanentAddress")).sendKeys("987 NW Washington");
		
		//enter click
		driver.findElement(By.id("submit")).click();
		
		//Time open 3sec
		Thread.sleep(3000);
		
		//close the browser
		driver.quit();
		
	}

}
