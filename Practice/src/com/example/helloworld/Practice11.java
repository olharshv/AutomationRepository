package com.example.helloworld;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by OlhaY on 8/20/2015.
 */
public class Practice11 {
    //тесты не принимают параметров
    //сказать джаве, что это тест. Нам нужен junit.Test нужен - биб-ка для тестирования
    //@Test - аннотация.
    @Test
    public void test1(){
        //assert нужен который из junit
        Assert.assertEquals(20, 10 + 10);
        //следующие 2 записи равосильны
//        Assert.assertEquals(true, 1 == 2);
//        Assert.assertTrue(1 == 2);

    }

    //PASSED
    @Test
    public void test3(){
        Assert.assertEquals(10, sumAll(new int[] {1, 4, 2, 3, 0}));
    }
    @Test
    public void test4(){
        Assert.assertEquals(0, sumAll(new int[]{0}));
    }

    @Test
    public void test5(){
        Assert.assertEquals(-11, sumAll(new int[]{-1, -2, -10, 2}));
    }

    @Test
    public void test6(){
        Assert.assertEquals(0, sumAll(new int[]{}));
    }

    @Test
    public void test7(){
        Assert.assertEquals(0, sumAll(new int[]{-1, 1, 0, 0}));
    }

    @Test
    public void test8(){
        Assert.assertEquals(325435450, sumAll(new int[]{325435460, -2, -10, 2}));
    }

    @Test
    public void test9(){
        Assert.assertEquals(-325435470, sumAll(new int[]{-325435460, -2, -10, 2}));
    }

    @Test
    public void test10(){
        Assert.assertEquals(0, sumAll(new int[]{0, 0, 0, 0, 0, 0, 0, 0}));
    }

    //FAILED
    @Test
    public void testFailed(){
        Assert.assertEquals(38, sumAll(new int[] {1, 41, 2}));
    }

    @Test
    public void testFailed2(){
        Assert.assertEquals(2, sumAll(new int[]{-3, 2}));
    }

    public static int sumAll(int[] a1){
        int sumElements = 0;
        for (int i = 0; i < a1.length; i++) {
            sumElements = sumElements + a1[i];
        }
        return sumElements;
    }
//second variant sumAll
/*    public static int sumAll(int[] a1){
        int sumElements = 0;
        for (int e : a1) {
            sumElements += e;
        }
        return sumElements;
    }*/
}
