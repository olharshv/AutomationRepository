package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by OlhaY on 8/20/2015.
 */
public class HomeWork10 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.get("https://stage.tether.to");
        System.out.println(drv.getTitle()); //в консоль выведется "Google"

        findElement("//input[@name = 'username']", drv).sendKeys(" ");
        findElement("//input[@name = 'password']", drv).sendKeys(" ");
        System.out.println(findElement("//md-input-container[1]//*[@class='ng-scope']", drv).getText());
        findElement("//input[@name = 'password']", drv).sendKeys(Keys.TAB);
        System.out.println(findElement("//md-input-container[2]/div/*[@class = 'ng-scope']", drv).getText());

        slpMs(3000);

        drv.quit();

    }

//sleep with milli seconds
    public static void slpMs(long msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)
        {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slpMs(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }
}
