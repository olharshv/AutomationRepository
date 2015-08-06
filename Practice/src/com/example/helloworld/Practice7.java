package com.example.helloworld;

/**
 * Created by OlhaY on 8/6/2015.
 */
public class Practice7 {
    public static void main(String[] args) {
        System.out.println(a);
        int a = 20;
    }

    public static void func(){
        System.out.println(a);
    }
    public static int a = 10;

    public static void func2(){
        int a = 30;
        System.out.println(a);
        func();
    }


}
