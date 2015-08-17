package com.example.helloworld;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by OlhaY on 8/16/2015.
 */
public class Practice8 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\libJava\\chromedriver.exe");

        ChromeDriver drv = new ChromeDriver();

        drv.get("http://google.com");

        System.out.println(drv.getTitle()); //в консоль выведется "Google"

        WebElement j = drv.findElementByName("q");
        j.sendKeys("котята");
        j.sendKeys(Keys.ENTER);

        drv.findElementByName("btnG").click();

        System.out.println(j.getAttribute("value")); //у всех текстовых полей есть атрибут value.
                                                        // внутри этого атрибута лежит то, что написано в поле
                                                        // в консоли появится "котятя"

        slp(3);

        //1st variant: поиск внутри веб драйвера
       /* List<WebElement> res = drv.findElementsByTagName("a");//посмотреть через Inspect element, что "a" - это ссылка
                                                                //findElementsByTagName - найдет не один, а все эллементы, вернет
                                                                // список всех эллементов
        for (WebElement w : res) {
            System.out.println(w.getText()); //достаем текст из ссылки
        }*/

        //2nd variant: поиск внутри div

        /*WebElement k = drv.findElementByClassName("srg"); //find elements by class name. получить ссылки, которые внутри div лежат
        List<WebElement> res = k.findElements(By.tagName("a"));//будут только ссылки на котят

        for (WebElement w : res) {
            System.out.println(w.getText()); //достаем текст из ссылки
        }*/

        //3nd variant: напечатать 1й из найденных результатов, т.е. только первую ссылку
        WebElement k = drv.findElementByClassName("srg"); //find elements by class name. получить ссылки, которые внутри div лежат
        List<WebElement> res = k.findElements(By.tagName("a"));//будут только ссылки на котят
        System.out.println(res.get(0).getText()); //достаем текст из ссылки
        slp(2);
        //перейти по 1ой ссылке
        res.get(0).click();
        slp(4);
        //достать title - не ссылки, а веб драйвера!!!
        System.out.println(drv.getTitle());
        //вернуться назад
        drv.navigate().back();
        slp(3);
        drv.quit();

    }

    public static void slp(long sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

