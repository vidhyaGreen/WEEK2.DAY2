package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDown {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 
		 //Locate elements and how to typea value in the text field
		 
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

        driver.findElement(By.linkText("CRM/SFA")).click();
         driver.findElement(By.linkText("Leads")).click();
         driver.findElement(By.linkText("Create Lead")).click();
       
         driver.findElement(By.id("createLeadForm_companyName")).sendKeys("SBI ");	
	     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vidhya ");
	     driver.findElement(By.name("dataSourceId")).sendKeys("Employee ");
	     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("M");
     
	     //select by visible text
	     
       WebElement eleSource=driver.findElement(By.id("createLeadForm_dataSourceId"));
       Select dropDown1= new Select(eleSource);
       dropDown1.selectByVisibleText("Direct Mail");
      
       //select by visible text
       
       WebElement eleIndustry=driver.findElement(By.id("createLeadForm_industryEnumId"));
       Select dropDown2= new Select(eleIndustry);
       dropDown2.selectByIndex(7);
       
	     
	    //select by visible text
       
       WebElement eleOwnership=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
       Select dropDown3= new Select(eleOwnership);
       dropDown3.selectByValue("OWN_PARTNERSHIP");
       
       //using send keys
       
       driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys(" Affiliate Sites");
	}
	
//h2[contains(text(),'LeafTaps')]
}
