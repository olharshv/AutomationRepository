package com.example.helloworld;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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

        drv.quit();

    }
}
