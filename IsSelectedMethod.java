package MainPackage.SeleniumChromeDriver.locators.isSelected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {//TO CHECK RADIO BUTTONS, CHECKBOX AND DROPDOWN WHETHER SELECTED OR NOT
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://courses.letskodeit.com/practice");
        WebElement we = wd.findElement(By.id("bmwradio"));
        WebElement we1 = wd.findElement(By.id("benzradio"));
        WebElement we2 = wd.findElement(By.id("hondaradio"));
        we.click();
        System.out.println(we.isSelected());//true
        we1.click();
        System.out.println(we1.isSelected());//true
        //we2.click();
        System.out.println(we2.isSelected());//false
        Thread.sleep(3000);

        wd.close();
    }
}
