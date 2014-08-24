package common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

/**
 * Created by EZPZTAXES on 8/12/2014.
 */
public class CommonApi {

    public WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to("http://www.cnn.com");
        driver.manage().window().maximize();
    }


    @AfterMethod
    public void tearDown(){

        driver.quit();
    }

    //helper method

    //Used for search box testing
    public void type(String locator, String value ){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }

    public void clickByCss (String locator){
        driver.findElement(By.cssSelector(locator)).click();
    }

    public void clickByXPATH (String locator){
        driver.findElement(By.xpath(locator)).click();
    }

    public void sleep(int second) throws InterruptedException {
        Thread.sleep(1000*second);
    }

    public void navigateBack() {
        driver.navigate().back();
    }

    public void clearTextBox(String xpathLocator){
        driver.findElement(By.xpath(xpathLocator)).clear();
    }
}
