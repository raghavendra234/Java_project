package Syn.SynechronId;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class HomeBaseTestPage {
	final static Logger logger = Logger.getLogger(HomeBaseTestPage.class);
	final String url = "https://eag.synechron.com/SYNE.UI/Account/Common/Account/LogOn?ReturnUrl=%2fSYNE.UI";
	WebDriver driver;

	@FindBy(xpath = "//i[@class='fa fa-caret-down fright']")
	WebElement logout;

	
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/IEDriverServer.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		logger.info(dtf.format(now));

	}

	@AfterTest
	public void After() {
		logout.click();
		Actions actions = new Actions(driver);
		WebElement menu = driver.findElement(By.xpath("//a[text()='Logout']"));
		actions.moveToElement(menu).click().build().perform();

	}

}
