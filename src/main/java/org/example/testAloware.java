package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;
public class testAloware {

    public static void main (String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\thiag\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //TC0010
        driver.manage().window().maximize();
        driver.get("https://aloware.com/");
        Thread.sleep(5000);
        page_objects_aloware.lnk_solutions(driver).click();
        Thread.sleep(5000);
        String pageName =  driver.getTitle();
        String solutionPageName = "Solutions - Aloware";
        Assert.assertEquals(pageName, solutionPageName);
        driver.quit();
    }
}
