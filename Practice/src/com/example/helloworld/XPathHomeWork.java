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
//6. Напечатать в консоль заголовки всех полей кроме вьібора страньі.
        List<WebElement> res = drv.findElementsByXPath("//md-input-container/label");
        for (WebElement w : res) {
            System.out.println(w.getText());
            //ng-pristine ng-valid md-input ng-touched class name

            WebElement Country = drv.findElementByXPath("//md-input-container/label[text() = 'State/Province']");
            if (Country.isDisplayed()) {
                continue;
            }
        }
        Practice8.slp(2);
       // 7. Заполнить первьіе 3 поля.
        WebElement firstField = drv.findElementByXPath("//md-input-container/input[@name = 'inviteCode']");
        firstField.sendKeys("12345");
        Practice8.slp(2);
        WebElement secondField = drv.findElementByXPath("//md-input-container/input[@name = 'firstname']");
        secondField.sendKeys("Olha");
        Practice8.slp(2);
        WebElement thirdField = drv.findElementByXPath("//md-input-container/input[@name = 'lastname']");
        thirdField.sendKeys("Yershova");
        Practice8.slp(2);
        //8. Напечатать в консоль ошибку которая появилась возле первого поля.
        WebElement error = drv.findElementByXPath("//md-input-container[1]//*[@class='ng-scope']");
        System.out.println(error.getText());
        Practice8.slp(2);
        drv.quit();


    }
}
