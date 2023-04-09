package MainPackage.SeleniumChromeDriver.locators.isEnabled;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {//TO CHECK TEXT BOX WHETHER ENABLED OR DISABLED

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("enabled-example-input"));
        WebElement we1 = wd.findElement(By.id("disabled-button"));
        WebElement we2 = wd.findElement(By.id("enabled-button"));
        we.click();
        System.out.println(we.isEnabled());//true
        Thread.sleep(3000);
        we1.click();
        System.out.println(we.isEnabled());//false
        Thread.sleep(3000);
        we2.click();
        System.out.println(we.isEnabled());//true
        Thread.sleep(3000);
        wd.close();

    }
}
