package MainPackage.SeleniumChromeDriver.locators.isDisplayed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayedMethod {//TO CHECK WHETHER ELEMENTS ARE DISPLAYED OR NOT

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we=wd.findElement(By.id("displayed-text"));
        WebElement we1=wd.findElement(By.id("hide-textbox"));
        WebElement we2=wd.findElement(By.id("show-textbox"));

        System.out.println(we.isDisplayed());//true
        we1.click();
        System.out.println(we.isDisplayed());//false
        we2.click();
        System.out.println(we.isDisplayed());//true
        Thread.sleep(3000);


    }
}
