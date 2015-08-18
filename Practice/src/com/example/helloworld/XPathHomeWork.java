package com.example.helloworld;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by OlhaY on 8/17/2015.
 */
public class XPathHomeWork {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\libJava\\chromedriver.exe");

        ChromeDriver drv = new ChromeDriver();

        drv.get("https://stage.tether.to");

        System.out.println(drv.getTitle()); //в консоль выведется название сайта
        WebElement j = drv.findElementByXPath("//div/a[text() = 'Request access']");
        //расносильно записи  j = drv.findElement(By.xpath("//*[@name = 'q']"));
        j.click();
        Practice8.slp(2);
        WebElement EnterField = drv.findElementByXPath("//label");
        System.out.println(EnterField.getText());
        WebElement AlreadyLink = drv.findElementByXPath("//div/a[text() = 'Already have an invite code?']");
        //расносильно записи  j = drv.findElement(By.xpath("//*[@name = 'q']"));
        AlreadyLink.click();
        Practice8.slp(2);

        List<WebElement> res = drv.findElementsByXPath("//md-input-container/label");
        for (WebElement w : res) {
            System.out.println(w.getText());
        }
            drv.quit();

    }
}
