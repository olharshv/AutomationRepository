package com.example.helloworld;

/**
 * Created by OlhaY on 9/22/2015.
 */
public class BookingUzGovUA {

    private static String elementFrom = "//div[contains(@class, 'stations')]/div[1]/input";
    private static String elementTo = "//div[contains(@id, 'station_till')]/input";

    private static String elementDate = "//div[contains(@class, 'options')]/div/label/input";

    private static String elementSearchButton = "//*[@id=\"content\"]/form/p/button";
    private static String elementTrainRoute = "";
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
        String elementDateNumber = "//*[text()=\"" + dateMonth + "\" and \"" + dateYear + "\"]/..//..//..//tr/td/a[contains(text(),\"" +dateNumber + "\")]";
        /*old code*/
        //String elementDateNumber = "//*[text()= '" + dateMonth + " " + dateYear + "']/..//td[text()='" + dateNumber + "']";
        TestHelper.findElement(elementDate).click();
        TestHelper.findElement(elementDateNumber).click();
        TestHelper.slpMs(5000);
    }

    static void pushSearchButton(){
        TestHelper.findElement(elementSearchButton).click();
        TestHelper.slpMs(5000);
    }

    static void chooseTrain(String train){
        String elementTrain = "//*[@id=\"ts_res_tbl\"]/.//tr/td/a[contains(text(),\"" + train +"\")]";
        TestHelper.findElement(elementTrain).click();
    }

    static void closeTrainRoute(){
        String elementTrainRouteOk = "//a[@title=\"close\"]";
        TestHelper.findElement(elementTrainRouteOk).click();
        TestHelper.slpMs(5000);
    }

    static void choosePlaceType(String trainNumber, String placeType){
        String elementTrainPlaceType = "//a[text()=\"" + trainNumber + "\"]/../..//div[@title=\"" + placeType + "\"]/button";
        TestHelper.slpMs(2000);
        TestHelper.findElement(elementTrainPlaceType).click();
    }

    //rewrite to be able to put a place number here
    public static void choosePlaceNumber(){
        String elementPlaceNumber = "//*[@id=\"places\"]/p[6]/a[1]/span";
        TestHelper.slpMs(2000);
        TestHelper.findElement(elementPlaceNumber).click();
    }

    /*public static setLastName (lastName){
        String elementLastName = "";
        TestHelper.slpMs(2000);
        TestHelper.findElement(elementLastName).click();
    }

    public static setFirstName (firstName){
        String elementFirstName = "";
        TestHelper.slpMs(2000);
        TestHelper.findElement(elementFirstName).click();
    }*/
}
