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
        //1. Открьій сайт https://stage.tether.to
        drv.get("https://stage.tether.to");
        System.out.println(drv.getTitle()); //в консоль выведется "Google"
        //2. Заполнить в логин пустую строку, и в пароль пустую строку
        findElement("//input[@name = 'username']", drv).sendKeys(" ");
        findElement("//input[@name = 'password']", drv).sendKeys(" ");
        //3. Напечатать в консоль сообщение об ошибке от логина
        System.out.println(findElement("//md-input-container[1]//*[@class='ng-scope']", drv).getText());
        //4. Нажать TAB в поле пароля
        findElement("//input[@name = 'password']", drv).sendKeys(Keys.TAB);
        //5. Напечатать в консоль сообщение об ошибке от пароля
        System.out.println(findElement("//md-input-container[2]/div/*[@class = 'ng-scope']", drv).getText());
        //6. Заполнить пароль строкой "asd"
        findElement("//input[@name = 'username']", drv).sendKeys("asd");
        //7. Напечатать в консоль сообщение об ошибке от пароля (должно бьіть другое)
        System.out.println(findElement("//md-input-container[1]/div/*[@class = 'ng-scope']", drv).getText());
        //8. Дописать в пароль еще "fff"
        findElement("//input[@name = 'username']", drv).sendKeys("fff");
        //9. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 5 и 7.
        // (findElements .... .size())

        //10. Заполнить в логин "a"
        findElement("//input[@name = 'username']", drv).clear();
        slpMs(2000);
        findElement("//input[@name = 'username']", drv).sendKeys("a");
        //11. Напечатать в консоль сообщение об ошибке от логина
        System.out.println(findElement("//md-input-container[1]/div/*[@class = 'ng-scope']", drv).getText());
        //12. Дописать в логин "qwe"
        findElement("//input[@name = 'username']", drv).sendKeys("qwe");
        //13. Напечатать в консоль количество вебєлементов найденньіх по XPath которьій использовали в шагах 3 и 11.
        // (findElements .... .size())

        //14. Нажать Log In
        findElement("//button/span", drv).click();


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
