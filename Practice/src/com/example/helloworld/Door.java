package com.example.helloworld;

/**
 * Created by OlhaY on 9/15/2015.
 */
public class Door {
    //color - переменная. должна быть public, чтобы к ней можно быдо обращаться из другого класса!!! и должна быть НЕ static, если бы она была static,
    //то была бы в шаблоне - поменяли в шаблоне, поменялась переменная везде.
    public String color = "Wood";
    public String changeStateVar = "Closed";
    public static String made = "China";

    public String getColorValue(){
      return color;
    }

    public String state(){
        return changeStateVar;
    }

    public String open(){
        changeStateVar = "Open";
        return changeStateVar;
    }


}
