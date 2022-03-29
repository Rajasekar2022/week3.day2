package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//		ChromeDriver driver = new ChromeDriver();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(option);

		//	Open URL
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		WebElement search = driver.findElement(By.name("searchVal"));
		search.sendKeys("Bags",Keys.ENTER);

		//	Thread.sleep(200);
		// Select Gender - Men
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(200);
		// Select category - Fashion Bags
		driver.findElement(By.xpath("//label[@for= 'Men - Fashion Bags']")).click();
		
		Thread.sleep(2000);
		//	Print the total item count
		String TotalItems = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of item : "+TotalItems);
		
		// Get the list of brand and printing the list
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		brandList.size();
		System.out.println("List of Brand Names: "+brandList.size());
		
		for (WebElement webElement : brandList) {
			String brandName = webElement.getText();
			System.out.println(brandName);
		}
		
		// Get the list of names and printing the list
				List<WebElement> productNameList = driver.findElements(By.className("nameCls"));
				productNameList.size();
				System.out.println("List of Brand Names: "+productNameList.size());
				
				for (WebElement webElement : productNameList) {
					String productName = webElement.getText();
					System.out.println(productName);
				}
		
	}
}
