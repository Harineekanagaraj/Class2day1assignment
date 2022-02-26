package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
	    ChromeDriver driver=new ChromeDriver();
	    driver.get("http://leaftaps.com/opentaps/control/main");
	    driver.manage().window().maximize();
	    WebElement elementUsername = driver.findElement(By.id("username"));
	    elementUsername.sendKeys("Demosalesmanager");
	    WebElement elementPassword = driver.findElement(By.id("password"));
	    elementPassword.sendKeys("crmsfa");
	    WebElement elementLoginButton = driver.findElement(By.className("decorativeSubmit"));
	    elementLoginButton.click();
	    WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
	    elementCRMSFA.click();
	    WebElement elementLeadsButton = driver.findElement(By.linkText("Leads"));
	    elementLeadsButton.click();
	    WebElement elementCreateLeadButton = driver.findElement(By.linkText("Create Lead"));
	    elementCreateLeadButton.click();
	    WebElement elementcompanyName = driver.findElement(By.id("createLeadForm_companyName"));
	    elementcompanyName.sendKeys("RRD");
	    WebElement elementfirstName = driver.findElement(By.id("createLeadForm_firstName"));
	    elementfirstName.sendKeys("Harinee");
	    WebElement elementlastName = driver.findElement(By.id("createLeadForm_lastName"));
	    elementlastName.sendKeys("K");
	    WebElement elementfirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
	    elementfirstNameLocal.sendKeys("Hari");
	    WebElement elementdepartmentName = driver.findElement(By.id("createLeadForm_departmentName"));
	    elementdepartmentName.sendKeys("Testing");
	    WebElement elementdescription = driver.findElement(By.id("createLeadForm_description"));
	    elementdescription.sendKeys("xyz");
	    WebElement elementemailAddress = driver.findElement(By.id("createLeadForm_primaryEmail"));
	    elementemailAddress.sendKeys("harineekanagaraj@gmail.com");
	    WebElement elementstateProvince = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
	    elementstateProvince.sendKeys("NewYork");
	    WebElement elementCreateButton = driver.findElement(By.className("smallSubmit"));
	    elementCreateButton.click();
	    WebElement elementEditLeadButton = driver.findElement(By.linkText("Edit"));
        elementEditLeadButton.click();
        driver.findElement(By.id("updateLeadForm_description")).clear();
        WebElement elementImportantNote = driver.findElement(By.id("updateLeadForm_importantNote"));
	    elementImportantNote.sendKeys("ABC");
	    WebElement elementUpdateButton = driver.findElement(By.className("smallSubmit"));
	    elementUpdateButton.click();

	}

}
