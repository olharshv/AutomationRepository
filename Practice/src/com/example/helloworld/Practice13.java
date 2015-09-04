package com.example.helloworld;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by OlhaY on 9/3/2015.
 */
public class Practice13 {
    public static void main() {
        //убираем блок из главной функции
        // и переносим в тесты. из main убрали аргументы - чтобы запускать все тесты сразу, нажав на Practice13>run class

       /* System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        WebDriver drv = new ChromeDriver();
        drv.get("http://angel.net/~nic/passwd.current.html");
        setMaster("master", drv);
        setSitename("google.com", drv);
        generate(drv);
        getPassword(drv);
        slpMs(5000);
        drv.quit(); */
    }

    @Test
    public void test1() {
        setMaster("master", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
        slpMs(5000);
    }

    @Test
    public void test2() {
        setMaster("hello", drv);
        setSitename("google.com", drv);
        generate(drv);
        System.out.println(getPassword(drv));
        slpMs(5000);
    }
//
    @Test
    public void test3() {
        setMaster("qwe123", drv);
        setSitename("gmail.com", drv);
        submitEnter(drv);
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPassword(drv));
        slpMs(5000);
    }

    @Test
    public void test4(){
        setMaster("qwe123", drv);
        setSitename("gmail.com", drv);
        generate(drv);
        Assert.assertEquals("mKJAakDvwbhi6@1a", getPassword(drv));
        slpMs(5000);
    }

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
//функция  - заполнить первое поле
    public static void setMaster(String filledString, WebDriver wdr){
         findElement("//td/input[@name='master']", wdr).sendKeys(filledString);
    }

    //функция - заполнить второе поле
    public static void setSitename(String filledString, WebDriver wdr){
        findElement("//td/input[@name='site']", wdr).sendKeys(filledString);;
    }

    //функция - нажать кнопку Generate
    public static void generate(WebDriver wdr){
        findElement("//td/input[@value = 'Generate']", wdr).click();
    }

    //функция  - достать из 3го
    public static String getPassword(WebDriver wdr){
        return findElement("//td/input[@name= 'password']", wdr).getAttribute("value");
    }

    //Enter function
    public static void submitEnter(WebDriver wdr){
        findElement("//td/input[@name= 'password']", wdr).sendKeys(Keys.ENTER);
    }

    @Before
    public void funcBeforeEveryTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        //Записали в переменную drv значение
        drv = new ChromeDriver();
        drv.get("http://angel.net/~nic/passwd.current.html");
    }
    //надо в самом классе создать переменную, чтобы все функции получили доступ к этой переменной.
    // Но нужен именно Before - чтобы заранее объявить хромдрайвер и дальше все тесты будут использовать drv
    //объявили переменную drv, которая есть WebDriver
    public WebDriver drv;

    //чтобы после каждого теста закрывался браузер. Иначе при фейле будет открыт браузер
    // и следующие тесты - браузеры открыты, но не закрыты
    @After
    public void funcAfterEveryTest() {
        drv.quit();
    }
}
