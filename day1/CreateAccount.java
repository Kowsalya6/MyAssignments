package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create Account")).click();
		driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//*[@id=\"groupNameLocal\"]")).sendKeys("Kowsi");
		driver.findElement(By.xpath("//*[@id=\"officeSiteName\"]")).sendKeys("park plaza");
		driver.findElement(By.xpath("//*[@id=\"annualRevenue\"]")).sendKeys("4.5L");
		WebElement drop = driver.findElement(By.name("industryEnumId"));
		Select dropDown = new Select(drop);
		dropDown.selectByVisibleText("Computer Software");
		WebElement drop1=driver.findElement(By.name("ownershipEnumId"));
		Select dropDown1= new Select(drop1);
		dropDown1.selectByVisibleText("S-Corporation");
		WebElement drop2 = driver.findElement(By.id("dataSourceId"));
		Select dropDown2 = new Select(drop2);
		dropDown2.selectByValue("LEAD_EMPLOYEE");
		WebElement drop3=driver.findElement(By.id("marketingCampaignId"));
		Select dropDown3=new Select(drop3);
		dropDown3.selectByIndex(6);
		WebElement drop4=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dropDown4=new Select(drop4);
		dropDown4.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();	
		driver.findElement(By.xpath("//*[@id=\"accountName\"]")).clear();
		driver.findElement(By.xpath("//*[@id=\"accountName\"]")).sendKeys("debit Limit account");
		driver.findElement(By.className("smallSubmit")).click();
			}
	}
/*  
 ng Xpath Locator*/