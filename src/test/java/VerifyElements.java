import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.util.List;


public class VerifyElements {
    public WebDriver driver;
    public String baseUrl = "https://www.automationanywhere.com";

    @BeforeTest
    public void intializeBrowser() {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
    }
    @Test(priority = 1,enabled = true)
    public void verifyElements() {
        driver.get(baseUrl);
        WebElement cookie = driver.findElement(By.xpath("//button[text()=\"Accept All Cookies\"]"));
        cookie.click();
      //  List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d\"]/li"));
        WebElement products = driver.findElement(By.xpath("//a[@href=\"/products\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(products.isDisplayed(), "Element is not displayed");
        products.click();
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title, "https://www.automationanywhere.com/products");
        driver.navigate().back();
        WebElement beyondRpa = driver.findElement(By.xpath("//a[@href=\"/rpa/robotic-process-automation\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(beyondRpa.isDisplayed(), "Element is not displayed");
        beyondRpa.click();
        String title1 = driver.getCurrentUrl();
        Assert.assertEquals(title1, "https://www.automationanywhere.com/rpa/robotic-process-automation");
        driver.navigate().back();
        WebElement aboutUs = driver.findElement(By.xpath("//a[@href=\"/company/about-us\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(aboutUs.isDisplayed(), "Element is not displayed");
        aboutUs.click();
        String title2 = driver.getCurrentUrl();
        Assert.assertEquals(title2, "https://www.automationanywhere.com/company/about-us");
        driver.navigate().back();
        WebElement resources = driver.findElement(By.xpath("//a[@href=\"https://www.automationanywhere.com/resources\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(resources.isDisplayed(), "Element is not displayed");
        resources.click();
        String title3 = driver.getCurrentUrl();
        Assert.assertEquals(title3, "https://www.automationanywhere.com/resources");
        driver.navigate().back();
        WebElement solutions = driver.findElement(By.xpath("//a[@href=\"/solutions\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(solutions.isDisplayed(), "Element is not displayed");
        solutions.click();
        String title4 = driver.getCurrentUrl();
        Assert.assertEquals(title4, "https://www.automationanywhere.com/solutions");
        driver.navigate().back();
    }

    @Test(timeOut = 2000, priority = 0)
    public void verifyElementsWithTimeout() {
        driver.get(baseUrl);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d\"]/li"));
        WebElement products = driver.findElement(By.xpath("//a[@href=\"/products\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(products.isDisplayed(), "Element is not displayed");
        products.click();
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title, "https://www.automationanywhere.com/products");
        driver.navigate().back();
        WebElement beyondRpa = driver.findElement(By.xpath("//a[@href=\"/rpa/robotic-process-automation\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(beyondRpa.isDisplayed(), "Element is not displayed");
        beyondRpa.click();
        String title1 = driver.getCurrentUrl();
        Assert.assertEquals(title1, "https://www.automationanywhere.com/rpa/robotic-process-automation");
        driver.navigate().back();
        WebElement aboutUs = driver.findElement(By.xpath("//a[@href=\"/company/about-us\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(aboutUs.isDisplayed(), "Element is not displayed");
        aboutUs.click();
        String title2 = driver.getCurrentUrl();
        Assert.assertEquals(title2, "https://www.automationanywhere.com/company/about-us");
        driver.navigate().back();
        WebElement resources = driver.findElement(By.xpath("//a[@href=\"https://www.automationanywhere.com/resources\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(resources.isDisplayed(), "Element is not displayed");
        resources.click();
        String title3 = driver.getCurrentUrl();
        Assert.assertEquals(title3, "https://www.automationanywhere.com/resources");
        driver.navigate().back();
        WebElement solutions = driver.findElement(By.xpath("//a[@href=\"/solutions\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(solutions.isDisplayed(), "Element is not displayed");
        solutions.click();
        String title4 = driver.getCurrentUrl();
        Assert.assertEquals(title4, "https://www.automationanywhere.com/solutions");
        driver.navigate().back();
    }

    @Test(priority = 2, enabled = false)
    public void verifyElementsWithEnabled() {
        driver.get(baseUrl);
        List<WebElement> list = driver.findElements(By.xpath("//ul[@class=\"coh-menu-list-container coh-unordered-list menu-level-1 coh-ce-646fa54d\"]/li"));
        WebElement products = driver.findElement(By.xpath("//a[@href=\"/products\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(products.isDisplayed(), "Element is not displayed");
        products.click();
        String title = driver.getCurrentUrl();
        Assert.assertEquals(title, "https://www.automationanywhere.com/products");
        driver.navigate().back();
        WebElement beyondRpa = driver.findElement(By.xpath("//a[@href=\"/rpa/robotic-process-automation\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(beyondRpa.isDisplayed(), "Element is not displayed");
        beyondRpa.click();
        String title1 = driver.getCurrentUrl();
        Assert.assertEquals(title1, "https://www.automationanywhere.com/rpa/robotic-process-automation");
        driver.navigate().back();
        WebElement aboutUs = driver.findElement(By.xpath("//a[@href=\"/company/about-us\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(aboutUs.isDisplayed(), "Element is not displayed");
        aboutUs.click();
        String title2 = driver.getCurrentUrl();
        Assert.assertEquals(title2, "https://www.automationanywhere.com/company/about-us");
        driver.navigate().back();
        WebElement resources = driver.findElement(By.xpath("//a[@href=\"https://www.automationanywhere.com/resources\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(resources.isDisplayed(), "Element is not displayed");
        resources.click();
        String title3 = driver.getCurrentUrl();
        Assert.assertEquals(title3, "https://www.automationanywhere.com/resources");
        driver.navigate().back();
        WebElement solutions = driver.findElement(By.xpath("//a[@href=\"/solutions\" and @class=\"coh-link nav-head-link js-coh-menu-item-link \"]"));
        Assert.assertTrue(solutions.isDisplayed(), "Element is not displayed");
        solutions.click();
        String title4 = driver.getCurrentUrl();
        Assert.assertEquals(title4, "https://www.automationanywhere.com/solutions");
        driver.navigate().back();
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}


