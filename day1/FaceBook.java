package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class FaceBook {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		ChromeOptions option = new ChromeOptions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300)); 
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Kowsalya");
		driver.findElement(By.name("lastname")).sendKeys("Selvakumar");
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("8825976636");
		driver.findElement(By.xpath("//input[contains(@id,'password')] ")).sendKeys("Kowsi@123");
		WebElement drop=driver.findElement(By.name("birthday_day"));
		drop.click();
		Select dropDown = new Select(drop);
		dropDown.selectByValue("6");
		WebElement drop1=driver.findElement(By.name("birthday_month"));
		drop1.click();
		Select dropDown1 = new Select(drop1);
		dropDown1.selectByVisibleText("Oct");
		WebElement drop2=driver.findElement(By.name("birthday_year"));	
		drop2.click();
		Select dropDown2=new Select(drop2);
		dropDown2.selectByValue("1996");
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		driver.findElement(By.name("websubmit")).click();
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
	} 
}

