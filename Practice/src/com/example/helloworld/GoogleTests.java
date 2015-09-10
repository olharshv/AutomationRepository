package com.example.helloworld;

import org.junit.Test;

/**
 * Created by OlhaY on 9/10/2015.
 */
public class GoogleTests {
    @Test
    public void searchTest() {
        TestHelper.setup();
        //для тестирования гугла не имеет смысла использование следующего метода. поэтому из TestHelper надо разнести...
        TestHelper.getMaster();
    }
}
