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
        //rewrite this function!!!
        BookingUzGovUA.setElementDate("16", "November", "2015");
        BookingUzGovUA.pushSearchButton();
        TestHelper.slpMs(5000);

    }

    @Before
    public void funcBeforeEveryTest() {
        TestHelper.setupUrl(Practice16.url);
    }

    @After
    public void funcAfterEveryTest() {
        TestHelper.quit();
    }
}
