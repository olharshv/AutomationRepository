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
        String elementDateNumber = "//*[text()='" + dateMonth + " " + dateYear + "']/..//td[text()='" + dateNumber + "']";
             //   "/html/body/div[2]/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td[3]";
           //     "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/tbody/tr/td[text()='" + dateNumber + "']";
        //String elementDateMonthYear = "//div[@class=\"rui-re-anchor\"]/div[1]/table/tbody/tr/td[2]/table/caption[text() = '" + dateMonth + " " + dateYear + "']";
        //String elementDateMonthYear =
         //       "//div[@class=\"rui-re-anchor\"]/div[@class=\"rui-calendar rui-panel\"]/table/tbody/tr/td/table/caption[text() = '" + month + " 2015']";

        TestHelper.findElement(elementDate).click();
        TestHelper.findElement(elementDateNumber).click();
        TestHelper.slpMs(5000);
    }

    static void pushSearchButton(){
        TestHelper.findElement(elementSearchButton).click();
        TestHelper.slpMs(5000);
    }

    static void chooseTrain(String train){
        String elementTrain = "//*[@id=\"ts_res_tbl\"]/tbody/tr[2]/td[1]/a";
        TestHelper.findElement(elementTrain).click();
    }

    static void closeTrainRoute(){
        String elementTrainRouteOk = "//a[@title=\"close\"]";
        TestHelper.findElement(elementTrainRouteOk).click();
        TestHelper.slpMs(5000);
    }

    static void choosePlace(String trainNumber, String placeType){
        String elementTrainPlace = "//a[text()=\"" + trainNumber + "\"]/../..//div[@title=\"" + placeType + "\"]/button";
        TestHelper.findElement(elementTrainPlace).click();
    }
    /*public static void listOfFoundTrains(List<String> trains){
    TestHelper.findElements(By.tagName("a"));
    }*/
}
