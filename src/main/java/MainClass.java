
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MainClass {
    static WebDriver driver;
    static WebDriverWait wait1;
    static WebDriverWait wait2;

    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\nazhivka.by\\IdeaProjects\\testselenium\\drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://plavnik.by/simpleregister/");
        wait1=(new WebDriverWait(driver, 5));
        wait2=(new WebDriverWait(driver, 10));
        wait1.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//h1")));
        selectoption("Минская область");

    }
    public static void selectoption(String value){
        driver.findElement(By.xpath("//select[@class=\"form-control\"]")).click();


        String valueXPath=String.format("//option[@value='%s']", value);
        driver.findElement(By.xpath(valueXPath)).click();



    }


}
