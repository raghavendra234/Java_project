package Syn.SynechronId;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestCaseBase extends HomeBaseTestPage{
	
	
	
	@Test
	public void TestCase_1()
	{
		driver.findElement(By.name("UserName")).sendKeys("raghavendra.Damaraju");
		driver.findElement(By.name("Password")).sendKeys("Syne3009");
		driver.findElement(By.xpath("//input[contains(@value,'Sign In')]")).click();
		
	}

}
