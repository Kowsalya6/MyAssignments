package week2.day1;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;


public class CreateLead {
		
		public static void main(String[] args) {
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			driver.findElement(By.id("username")).sendKeys("demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			driver.findElement(By.partialLinkText("CRM/SFA")).click();
			driver.findElement(By.partialLinkText("Leads")).click();
			driver.findElement(By.partialLinkText("Create Lead")).click();
			driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Organique resources");
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kowsalya");
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvakumar");
			WebElement drop=driver.findElement(By.id("createLeadForm_dataSourceId"));
			Select dropDown=new Select(drop);
			dropDown.selectByVisibleText("Employee");
			WebElement drop1=driver.findElement(By.id("createLeadForm_marketingCampaignId"));
			Select dropDown1=new Select(drop1);
			dropDown1.selectByValue("9001");
			WebElement drop2=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
			Select dropDown2=new Select(drop2);
			dropDown2.selectByIndex(5);
			WebElement drop3=driver.findElement(By.id("createLeadForm_generalCountryGeoId"));	
			Select dropDown3=new Select(drop3);
			dropDown3.selectByVisibleText("India");		
			driver.findElement(By.name("submitButton")).click();
			String title=driver.getTitle();
			System.out.println(title);
		}
	}

			
