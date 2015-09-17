package com.example.helloworld;

import org.openqa.selenium.Keys;

/**
 * Created by OlhaY on 9/10/2015.
 */
public class AngelPage {
    private static String elementMaster = "//tr[1]/td/input";
    private static String elementSitename = "//tr[2]/td/input";
    private static String elementGenerateButton = "//tr[3]/td/input";
    private static String elementGeneratedPassword = "//tr[4]/td/input";
    private static String elementValueMaster = "//tr[1]/td";
    private static String elementValueSitename = "//tr[2]/td";
    private static String elementValueGeneratedPassword = "//tr[4]/td";

    //функция  - заполнить первое поле
    static void setMaster(String filledString){
        TestHelper.findElement(elementMaster).sendKeys(filledString);
    }

    //функция - заполнить второе поле
    static void setSitename(String filledString){
        TestHelper.findElement(elementSitename).sendKeys(filledString);;
    }

    public static String getMaster(){
        return TestHelper.findElement(elementMaster).getAttribute("value");
    }

    public static String getSitename(){
        return TestHelper.findElement(elementSitename).getAttribute("value");
    }

    //функция - нажать кнопку Generate
    static void generate(){
        TestHelper.findElement(elementGenerateButton).click();
    }

    //функция  - достать из 3го
    static String getPassword(){
        return TestHelper.findElement(elementGeneratedPassword).getAttribute("value");
    }

    //Enter function
    static void submitEnter(){
        TestHelper.findElement(elementSitename).sendKeys(Keys.ENTER);
    }

    static boolean MasterEnable(){
        return TestHelper.findElement(elementMaster).isEnabled();
    }

    static boolean PasswordEnable(){
        return TestHelper.findElement(elementSitename).isEnabled();
    }

    static boolean GeneratedPasswordEnable(){
        return TestHelper.findElement(elementGeneratedPassword).isEnabled();
    }

    static String getMasterFieldName(){
        return TestHelper.findElement(elementValueMaster).getText();
    }

    static String getSiteFieldName(){
        return TestHelper.findElement(elementValueSitename).getText();
    }

    static String getGenerateButtonName(){
        return TestHelper.findElement(elementGenerateButton).getAttribute("value");
    }

    static String getGeneratedPasswordName(){
        return TestHelper.findElement(elementValueGeneratedPassword).getText();
    }

    static void waitForGeneratedPassword() { TestHelper.waitForValue(elementGeneratedPassword);    }

    static void waitForGenerateButton() { TestHelper.waitForValue(elementGenerateButton);    }

}
