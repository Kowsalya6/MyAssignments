package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Kowsi");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kowsalya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvakumar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Kowsi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Grocery");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("All the products are available in our departments.");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("kowsalyaselvakumar@gmail.com");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.partialLinkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Organique resources");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kowsi");
		driver.findElement(By.name("submitButton")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
	}

}

/*
20. Get the Title of Resulting Page using driver.getTitle()*/