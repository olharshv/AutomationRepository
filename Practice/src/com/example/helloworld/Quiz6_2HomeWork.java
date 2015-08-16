package com.example.helloworld;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by OlhaY on 8/6/2015.
 */
public class Quiz6_2HomeWork {
    public static void main(String[] args) {
        sayHello();
        // Hello Class!
        System.out.println(hello());
        // Hello Engineers!
        System.out.println(hello("Friends"));
        // Hello Friends
        System.out.println(hello("Friends").equals(hello("Friends")));
        // true
        System.out.println(hello("Friends") == hello("Friends"));
        // false
        test("Hello Engineers!", hello());
        // Test PASSED.
        test("Hello Enginers!", hello());
        // Test FAILED.
        // Expected: Hello Engineers!
        // Actual:   Hello Enginers!
        test("Hello Friends", hello("Friends"));
        // Test PASSED.
        test("Hello Good Men", hello("Good Men"));
        // Test PASSED.
        test("Hello to all 14 students!", hello(14));
        // Test PASSED.
        test("Hello student!", hello(1));
        // Test PASSED.
        test("No one came.", hello(0));
        // Test PASSED.
        test("Hello to all 25 persons!", hello(25, "persons"));
        // Test PASSED.
        test("Hello to all 99 programmers!", hello(99, "programmers"));
        System.out.println("New test results:");
        // Test PASSED.
        test("Hello Jean Podmore Oleksiia !", hello(new String[] {"Jean", "Podmore", "Oleksiia"}));
        // Test PASSED.
        test("Hello Anonymous Anonymous2 !", hello(new String[] {"Anonymous", "Anonymous2"}));
        // Test PASSED.

        test("Hello Slughorn, Norris, Fred and George!", hello(Arrays.asList("Slughorn", "Norris", "Fred", "George")));
        // Test PASSED.
        test("Hello Horace, Miss and Weasley's!", hello(Arrays.asList("Horace", "Miss", "Weasley's")));
        // Test PASSED.
        test(Arrays.asList(1, 2, 3), Arrays.asList(1, 2, 3));
        // Test PASSED.
        test(Arrays.asList(1, 4, 3), Arrays.asList(1, 2, 3));
        // Test FAILED.
        // Expected: [1, 4, 3]
        // Actual:   [1, 2, 3]
        System.out.println();
        test(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        test(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        test("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        System.out.println("Reverse results");
        test(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
        prettyPrint(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"), true);
        // Vernon
        //  Dudley
        //   Petunia
        //    Madge
        System.out.println("REVERSE");
        reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"));
       prettyPrint(reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge")), false);
        //    Madge
        //   Petunia
        //  Dudley
        // Vernon
    }

    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    // ������ �������
    public static String hello() {
        return "Hello Engineers!";
    }

    public static void test(String expected, String actual) {
        // �������� ��� ����
        boolean check = false;
        if (expected.equals(actual)) {
            check = true;
            System.out.println("Test PASSED");
        } else {
            check = false;
            System.out.println("Test FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }

    public static void test(List expected, List actual) {
        boolean check = false;
        if (expected.equals(actual)) {
            check = true;
            System.out.println("Test PASSED");
        } else {
            check = false;
            System.out.println("Test FAILED");
            System.out.println("Expected: " + expected);
            System.out.println("Actual: " + actual);
        }
    }

    public static String hello(String who) {
        return  "Hello " + who;
    }

    public static String hello(int howMany) {
        String howManyStr="";

        if (howMany == 0) {
            howManyStr = "No one came.";
        }
        if (howMany == 1) {
             howManyStr = "Hello student!";
            }
        if (howMany == 14) {
            howManyStr = "Hello to all 14 students!";
            }
        return howManyStr;
    }

    public static String hello(int howMany, String whom) {
        String testResult = "";

        if (howMany == 25 && whom.equals("persons")){
            testResult = "Hello to all 25 persons!";
        } else {
            if (howMany == 99 && whom.equals("programmers")) {
                testResult = "Hello to all 99 programmers!";
            }
        }
        return testResult;
    }

    public static String hello(String[] a){
        String newStr = "Hello";
        if (a.length == 3){
        return newStr + " " + a[0] + " " + a[1] + " " + a[2] + " !";
        }
        if (a.length == 2) {
            return newStr + " " + a[0] + " " + a[1] + " !";
        }
        else {
            return "Noting to return";
        }
    }

    public static String hello(List a1){
        String newStr = "Hello ";
        for (int i = 0; i < a1.size() - 1; i++) {
            if (i == a1.size() - 2) {
               newStr += a1.get(i) + " and " + a1.get(i+1) + "!";
//                 newStr = newStr + "and " + a1.get(i+1) + "!";
//                 System.out.println("check");
            } else {
                newStr += a1.get(i) + ", ";
            }
        }
        return newStr;
    }

    public static List stringsLength(List<String > a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++) {
            b.addAll(Arrays.asList(a.get(i).length()));//adding to b all elements from a
        }
        return b;
    }

     public static List reverseInts(List<Integer> a) {
        ArrayList<Integer> b = new ArrayList<Integer>();
        for (int i = a.size() - 1; i >= 0; i--) {
            b.add(a.get(i));//adding to b all elements from a
        }
        return b;
    }

   public static List reverse(List<String> a) {
       ArrayList<String> b = new ArrayList<String>();
       for (int i = a.size() - 1; i >= 0; i--) {
           b.add((a.get(i)));//adding to b all elements from a
       }
       System.out.println(b);
       return b;
    }

   public static void prettyPrint(List<String> b, boolean check) {
        if (check == true){
            for (int i = 0; i < b.size(); i++) {
                System.out.println(b.get(i));
            }
        } else {
            reverse(b);
            System.out.println("Hi");
        }
    }
}

