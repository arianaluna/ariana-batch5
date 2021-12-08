package selenium.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExerciseTwo {

	public static void main(String[] args) throws InterruptedException {
		

		String url = "http://demo.guru99.com/test/newtours/";
		
		//set system property for chromedriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\estra\\OneDrive\\Desktop\\Selenium\\chromedriver.exe");
		
		//create object of webdriver
		WebDriver driver = new ChromeDriver();
		
		//maximize window 
		driver.manage().window().maximize();
		
		//navigate to url 
		driver.get(url);
		
		//Click Register
		driver.findElement(By.linkText("REGISTER")).click();
		
		//Enter first name
		driver.findElement(By.name("firstName")).sendKeys("Ariana");
		
		//Enter last name
		driver.findElement(By.name("lastName")).sendKeys("Luna");
		
		//Enter phone number
		driver.findElement(By.name("phone")).sendKeys("4103306388");
		
		//Enter email
		driver.findElement(By.name("userName")).sendKeys("ari.luna.lopez@gmail.com");	
		
		//Enter address
		driver.findElement(By.name("address1")).sendKeys("123 laurel st");
		
		//Enter city
		driver.findElement(By.name("city")).sendKeys("Columbia");
		
		//Enter state
		driver.findElement(By.name("state")).sendKeys("Maryland");
		
		//Enter zip code
		driver.findElement(By.name("postalCode")).sendKeys("20794");
		
		//Enter username
		driver.findElement(By.name("email")).sendKeys("ariana.luna");
		
		//Enter password
		driver.findElement(By.name("password")).sendKeys("lolopo");
		
		//Enter password in confirm password field
		driver.findElement(By.name("confirmPassword")).sendKeys("lolopo");
		
		//Click submit button
		driver.findElement(By.name("submit")).click();
		
		//Time open 3sec
		Thread.sleep(3000);
		//close the browser
		driver.quit();
		
	}
}
