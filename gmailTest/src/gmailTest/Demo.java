package gmailTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args)throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","E:\\IDM\\New folder\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.gmail.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("identifierId")).sendKeys("akashdasdabu1994@gmail.com");
			Thread.sleep(2000);
			driver.findElement(By.className("VfPpkd-vQzf8d")).click();
			Thread.sleep(2000);
			
			driver.close();

	}

}






