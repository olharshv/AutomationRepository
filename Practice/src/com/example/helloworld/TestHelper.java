package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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

    //функция  - заполнить первое поле
    static void setMaster(String filledString){
        findElement("//tr[1]/td/input").sendKeys(filledString);
    }

    //функция - заполнить второе поле
    static void setSitename(String filledString){
        findElement("//tr[2]/td/input").sendKeys(filledString);;
    }

    public static String getMaster(){
        return findElement("//tr[1]/td/input").getAttribute("value");
    }

    public static String getSitename(){
        return findElement("//tr[2]/td/input").getAttribute("value");
    }

    //функция - нажать кнопку Generate
    static void generate(){
        findElement("//td/input[@value = 'Generate']").click();
    }

    //функция  - достать из 3го
    static String getPassword(){
        return findElement("//tr[4]/td/input").getAttribute("value");
    }

    //Enter function
    static void submitEnter(){
        findElement("//tr[2]/td/input").sendKeys(Keys.ENTER);
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

    static boolean MasterEnable(){
        return findElement("//tr[1]/td/input").isEnabled();
    }

    static boolean PasswordEnable(){
        return findElement("//tr[2]/td/input").isEnabled();
    }

    static boolean GeneratedPasswordEnable(){
        return findElement("//tr[4]/td/input").isEnabled();
    }

    static String getMasterFieldName(){
        return findElement("//tr[1]/td").getText();
    }

    static String getSiteFieldName(){
        return findElement("//tr[2]/td").getText();
    }

    static String getGenerateButtonName(){
        return findElement("//tr[3]/td/input").getAttribute("value");
    }

    static String getGeneratedPasswordName(){
        return findElement("//tr[4]/td").getText();
    }
}
