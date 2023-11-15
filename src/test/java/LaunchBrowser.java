import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.hc.core5.util.Asserts;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LaunchBrowser {

	public WebDriver driver;
	public String baseUrl = "https://www.automationanywhere.com";

	@BeforeTest
	public void intializeBrowser() {
		driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}


	@Test
	public void LaunchAndVerifyElements() throws InterruptedException {

		driver.get(baseUrl);
		WebElement logo = driver.findElement(By.xpath("//img[@class=\"coh-image coh-image-responsive-xl\" and @alt=\"Automation Anywhere\"]"));
		System.out.println(logo.isDisplayed());
		WebElement cookie = driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]"));
		cookie.click();
		Thread.sleep(3000);
		WebElement demoBtn = driver.findElement(By.xpath("//a[@class=\"coh-link coh-style-solid-orange-button btn-link\"]"));
		System.out.println(demoBtn.isDisplayed());
		demoBtn.click();
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
