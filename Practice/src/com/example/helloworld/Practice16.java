package com.example.helloworld;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by OlhaY on 9/22/2015.
 */
public class Practice16 {

    public static String url = "http://booking.uz.gov.ua/";

    public static void main() {    }

    @Test
    public void test1(){
        BookingUzGovUA.setElementFrom("Kyi");
        BookingUzGovUA.chooseElementFrom("Kyiv");
        BookingUzGovUA.setElementTo("Ivano");
        BookingUzGovUA.chooseElementTo("Ivano-Frankivsk");
        BookingUzGovUA.setElementDate("20", "April", "2016");
        BookingUzGovUA.pushSearchButton();
        BookingUzGovUA.chooseTrain("043 К");
        BookingUzGovUA.closeTrainRoute();
        BookingUzGovUA.choosePlaceType("043 К", "Coupe / coach with compartments");
        BookingUzGovUA.choosePlaceNumber();
        TestHelper.slpMs(5000);

    }

    @Before
    public void funcBeforeEveryTest() {
        TestHelper.setupUrl(Practice16.url);
    }

    @After
    public void funcAfterEveryTest() { TestHelper.quit(); }
}
