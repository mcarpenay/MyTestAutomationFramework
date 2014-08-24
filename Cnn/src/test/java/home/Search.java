package home;

import common.CommonApi;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

/**
 * Created by EZPZTAXES on 8/12/2014.
 */
public class Search extends CommonApi {

    @Test
    public void searchBox() throws InterruptedException {
       // driver.findElement(By.cssSelector("#hdr-search-box")).sendKeys("politics", Keys.ENTER);
        type("#hdr-search-box","politics");
        clickByCss(".ftr-search-sicon>input");
        sleep(3);
        navigateBack();
        clearTextBox("html/body/div[5]/div[2]/div/div[4]/form/div/div[1]/input");
        type("#hdr-search-box","money");
        clickByXPATH("html/body/div[5]/div[2]/div/div[4]/form/div/div[2]/input");
        sleep(3);
    }

//    @Test
//    public void searchBoxTest2() throws InterruptedException {
//        System.out.println("here");
//        type("#hdr-search-box","politics");
//        clickByXPATH("html/body/div[5]/div[2]/div/div[4]/form/div/div[2]/input");
//        sleep(3);
//
//    }


}
