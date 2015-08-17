package com.example.helloworld;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by OlhaY on 8/17/2015.
 */
public class XPathPractice {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\libJava\\chromedriver.exe");

        ChromeDriver drv = new ChromeDriver();

        drv.get("http://angel.net/~nic/passwd.current.html");

        System.out.println(drv.getTitle()); //в консоль выведется "Google"
        WebElement j = drv.findElementByXPath("//*[@name = 'master']");
        //расносильно записи  j = drv.findElement(By.xpath("//*[@name = 'q']"));
        j.sendKeys("mypass");

        WebElement k = drv.findElementByXPath("//*[@name = 'site']");
        k.sendKeys("mysite");
        Practice8.slp(2);
        WebElement buttonGenerate = drv.findElementByXPath("//td/input[@value = 'Generate']");
        Practice8.slp(3);
        buttonGenerate.click();
        Practice8.slp(3);
        WebElement GeneratedPass = drv.findElementByXPath("//td/input[@name = 'password']");
        System.out.println(GeneratedPass.getAttribute("value"));
        drv.quit();

    }
}