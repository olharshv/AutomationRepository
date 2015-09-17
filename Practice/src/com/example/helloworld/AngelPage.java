package com.example.helloworld;

import org.openqa.selenium.Keys;

/**
 * Created by OlhaY on 9/10/2015.
 */
public class AngelPage {
    //функция  - заполнить первое поле
    static void setMaster(String filledString){
        TestHelper.findElement("//tr[1]/td/input").sendKeys(filledString);
    }

    //функция - заполнить второе поле
    static void setSitename(String filledString){
        TestHelper.findElement("//tr[2]/td/input").sendKeys(filledString);;
    }

    public static String getMaster(){
        return TestHelper.findElement("//tr[1]/td/input").getAttribute("value");
    }

    public static String getSitename(){
        return TestHelper.findElement("//tr[2]/td/input").getAttribute("value");
    }

    //функция - нажать кнопку Generate
    static void generate(){
        TestHelper.findElement("//td/input[@value = 'Generate']").click();
    }

    //функция  - достать из 3го
    static String getPassword(){
        return TestHelper.findElement("//tr[4]/td/input").getAttribute("value");
    }

    //Enter function
    static void submitEnter(){
        TestHelper.findElement("//tr[2]/td/input").sendKeys(Keys.ENTER);
    }

    static boolean MasterEnable(){
        return TestHelper.findElement("//tr[1]/td/input").isEnabled();
    }

    static boolean PasswordEnable(){
        return TestHelper.findElement("//tr[2]/td/input").isEnabled();
    }

    static boolean GeneratedPasswordEnable(){
        return TestHelper.findElement("//tr[4]/td/input").isEnabled();
    }

    static String getMasterFieldName(){
        return TestHelper.findElement("//tr[1]/td").getText();
    }

    static String getSiteFieldName(){
        return TestHelper.findElement("//tr[2]/td").getText();
    }

    static String getGenerateButtonName(){
        return TestHelper.findElement("//tr[3]/td/input").getAttribute("value");
    }

    static String getGeneratedPasswordName(){
        return TestHelper.findElement("//tr[4]/td").getText();
    }

    static void waitForGeneratedPassword() { TestHelper.waitForValue("//tr[4]/td/input");    }
}
