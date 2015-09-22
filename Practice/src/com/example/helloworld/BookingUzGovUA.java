package com.example.helloworld;

/**
 * Created by OlhaY on 9/22/2015.
 */
public class BookingUzGovUA {

    private static String elementFrom = "//div[contains(@class, 'stations')]/div[1]/input";
    private static String elementKyiv = "//div[contains(@class, 'stations')]/div[1]/div[2]/div[1]";
    private static String elementTo = "";
    private static String elementDate = "";
    private static String elementSearch = "";
    private static String elementCoupePlace = "";
    private static String elementPlaceNumber = "";

    static void setElementFrom(String filledString){TestHelper.findElement(elementFrom).sendKeys(filledString);}
    static void chooseElementKyiv(){TestHelper.findElement(elementKyiv).click();}

}
