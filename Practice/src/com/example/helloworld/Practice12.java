package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by OlhaY on 9/1/2015.
 */
public class Practice12 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.get("https://strahovator.com.ua/kupit_strahovku/avtocivilka_avtograzhdanka_osago_oscpv");



        WebElement s = drv.findElement(By.xpath("//*[@id='ts_type']"));
        //import selenium Select!!!!
        Select sel = new Select(s);
        System.out.println(sel.getFirstSelectedOption().getText());
        sel.selectByVisibleText("мотоцикл или мотороллер");


        WebElement d = drv.findElement(By.xpath("//*[@id='ts_details_type']"));
        Select sel1 = new Select(d);
        System.out.println(sel1.getFirstSelectedOption().getText());
        sel1.selectByVisibleText("объем двигателя до 300 см³ включительно");
        /*List<WebElement> res = drv.findElements(By.xpath("//*[@id='ts_type']"));
        for (WebElement w : res) {
            System.out.println(w.getText());

        }*/
//сделать селекты по индексу или value. index считается с 0, 1, 2 ... A value - Это то, что в селекте написано, атрибут
        sel1.selectByIndex(0);
        slpMs(5000);
        sel1.selectByValue("a2");


        slpMs(5000);
        drv.quit();
    }


    public static void slpMs(long msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
