package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		 ChromeDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		 driver.findElement(By.xpath("//input[@type='submit']")).click();
		 driver.findElement(By.xpath("//a[contains(text(), 'CRM')]")).click();
	     driver.findElement(By.xpath("//a[(text()='Leads')]")).click();
	     
	     driver.findElement(By.xpath("//a[(text()='Create Lead')]")).click();
	     
	     driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SBI");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Vidhya ");
		 driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("M ");
		 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
	}
}

	