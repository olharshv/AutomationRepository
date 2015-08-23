package com.example.helloworld;

import org.openqa.selenium.By;
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
        findElement("//*[@name = 'site']", drv).sendKeys(" ");
        drv.quit();

    }

    public static WebElement findElement(String targetXPath, WebDriver wdr) {
        for (int i = 0; i < 600; i++)
        {
            if (wdr.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            Practice8.slp(100);
        }
        return wdr.findElement(By.xpath(targetXPath));
    }
}
