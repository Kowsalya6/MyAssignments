package week3.day1;

import java.time.Duration;
import java.lang.Thread;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		ChromeOptions option = new ChromeOptions();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Kowsi");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(3000); 
	    driver.findElement(By.xpath("(//a[text()='11119'])[1]")).click();
	    String title = driver.getTitle();
	    if(title.contains("View Lead")) {
	    	System.out.println("yes, It contains");
	    }
	    else
	    {
	    	System.out.println("no,");
	    }
	    driver.findElement(By.xpath("//a[text()='Edit'][1]")).click();
	    driver.findElement(By.id("updateLeadForm_companyName")).clear();
	    driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Kowsi"); 
	    driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
	    driver.close();
	}
}
	    
