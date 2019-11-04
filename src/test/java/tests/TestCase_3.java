package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.BrowserUtils;
import utilities.VerifyStringEquality;

public class TestCase_3 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/button[1]")).click();
        String expectedResultMessage = "Clicked on button one!";
        String actualResultMessage = driver.findElement(By.id("result")).getText();
        VerifyStringEquality.verifyStrings(expectedResultMessage, actualResultMessage);
        BrowserUtils.wait(1);
        driver.close();
    }
}
