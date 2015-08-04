package com.example.helloworld;

import com.sun.org.apache.bcel.internal.generic.NEW;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by OlhaY on 8/4/2015.
 */
public class Practice6 {
    public static void main(String[] args) {
       // return "abc".length();
        ArrayList<Integer> a = new ArrayList<Integer> ();
        System.out.println(a.size()); //length of the array
        a.add(10);
        System.out.println(a.size());
        a.add(1);
        a.add(5);
        System.out.println(a.size());
        System.out.println(a.get(2)); //get the element of the list following by index 2
        System.out.println(a.remove(0));//delete the element of the list following by index 0
        System.out.println(a.size());


        Integer [] a1 = {1,2,10,20};
        a.addAll(Arrays.asList(a1));//adding to a all elements from a1
        System.out.println(a);

        System.setProperty("webdriver.chrome.driver", "C:\\libJava\\chromedriver.exe");
        ChromeDriver d = new ChromeDriver();
        d.get("http://google.com");
       // d.quit();
        try {
            Thread.sleep(5000);//
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
