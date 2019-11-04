package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utilities.BrowserFactory;
import utilities.VerifyStringEquality;

public class TestCase_4 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com/");
        driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[40]/a")).click();
        driver.findElement(By.name("firstname")).sendKeys("123");
        String expectedErrorMessage = "first name can only consist of alphabetical letters";
        String actualErrorMessage = driver.findElement(By.xpath("//*[@id=\"registrationForm\"]/div[1]/div/small[3]")).getText();
        VerifyStringEquality.verifyStrings(expectedErrorMessage, actualErrorMessage);
        driver.close();
    }
}
