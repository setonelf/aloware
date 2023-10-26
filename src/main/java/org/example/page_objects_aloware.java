package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class page_objects_aloware {

    private static WebElement element = null;


    //Solutions
    public static WebElement lnk_solutions(WebDriver driver) {
        element = driver.findElement(By.xpath("//*[@href=\"https://aloware.com/solution/\"]"));
        return element;
    }

}
