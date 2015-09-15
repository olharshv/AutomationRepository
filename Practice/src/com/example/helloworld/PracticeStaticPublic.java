package com.example.helloworld;

/**
 * Created by OlhaY on 9/15/2015.
 */
//public private | static not static
public class PracticeStaticPublic {

    public static int publicStaticVar = 0;
    public int publicNonStaticVar = 1;
    private static int privateStaticVar = 2;
    private int privateNonStaticVar = 3;
//public ф-и, возвращающие значения private переменных
    public static int getStaticVar(){
        return privateStaticVar;
    }

    public int getNonStaticVar(){
        return privateNonStaticVar;
    }
}
