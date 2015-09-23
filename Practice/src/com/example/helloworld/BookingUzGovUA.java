package com.example.helloworld;

/**
 * Created by OlhaY on 9/22/2015.
 */
public class BookingUzGovUA {

    private static String elementFrom = "//div[contains(@class, 'stations')]/div[1]/input";
    private static String elementTo = "//div[contains(@id, 'station_till')]/input";

    private static String elementDate = "//div[contains(@class, 'options')]/div/label/input";

    private static String elementSearch = "";
    private static String elementCoupePlace = "";
    private static String elementPlaceNumber = "";

    static void setElementFrom(String filledString){TestHelper.findElement(elementFrom).sendKeys(filledString);}

    static void chooseElementFrom(String townName){
        String elementTown = "//div[contains(@class, 'stations')]/div[1]/div/div[@title='" + townName + "']";
        TestHelper.findElement(elementTown).click();
    }

    static void setElementTo(String filledString){TestHelper.findElement(elementTo).sendKeys(filledString);}

    static void chooseElementTo(String townName){
        String elementTown = "//div[contains(@id, 'station_till')]/div/div[@title='" + townName + "']";
        TestHelper.findElement(elementTown).click();
    }

    static void setElementDate(String dateNumber, String dateMonth, String dateYear) {
        TestHelper.findElement(elementDate).click();
        TestHelper.slpMs(5000);
        String elementDateNumber = "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[text() = '" + dateNumber + "']";
        String elementDateMonthYear = "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/caption[text() = '" + dateMonth + " " + dateYear + "']";
        TestHelper.findElement(elementDateNumber).sendKeys(dateNumber);
        TestHelper.findElement(elementDateMonthYear).sendKeys(dateMonth);
        TestHelper.findElement(elementDateMonthYear).sendKeys(dateYear);


    }
}
