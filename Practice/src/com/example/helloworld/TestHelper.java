package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by OlhaY on 9/8/2015.
 */
public class TestHelper {


    //сначала сделали переменную drv static в классе Practice14
    // перенесли переменную drv из класса Practice14: правой кнопкой на переменной > refactor > move
    //в Practice14 уже перед drv появился TestHelper
    static WebDriver drv;

    static void slpMs(long msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static WebElement findElement(String targetXPath) {
        for (int i = 0; i < 600; i++)
        {
            if (drv.findElements(By.xpath(targetXPath)).size() > 0)
            {
                break;
            }
            slpMs(100);
        }
        return drv.findElement(By.xpath(targetXPath));
    }

    //вынесли в отдельную функцию, чтобы не делать каждый раз setProperties
    static void setup(){
        System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        TestHelper.drv = new ChromeDriver();
    }

    static void get(String url){
        drv.get(url);
    }

    static void setupUrl(String abs){
        setup();
        get(abs);
    }

    static void quit (){
        TestHelper.drv.quit();
    }
//добавить эту ф-ю в getPassword
    static WebElement waitForValue(String targetXPath) {
        findElement(targetXPath);
        for (int i = 0; i < 600; i++)
        {
            WebElement inp = TestHelper.drv.findElement(By.xpath(targetXPath));
            if (inp.getAttribute("value").length() > 0)
            {
                break;
            }
            slpMs(100);
        }
        return drv.findElement(By.xpath(targetXPath));
    }

}
