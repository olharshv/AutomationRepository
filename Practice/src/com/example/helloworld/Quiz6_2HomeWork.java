package com.example.helloworld;
import java.util.ArrayList;
import java.util.Arrays;
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
        test(Arrays.asList(6), stringsLength(Arrays.asList("Jordan")));
        // Test PASSED.
        test(Arrays.asList(5, 3, 8), stringsLength(Arrays.asList("Harry", "Ron", "Hermione")));
        // Test PASSED.
        test("[5, 5]", stringsLength(Arrays.asList("Jinny", "Lupin")).toString());
        // Test PASSED.
        test(Arrays.asList(3, 6, 1, -60), reverseInts(Arrays.asList(-60, 1, 6, 3)));
        // Test PASSED.
        prettyPrint(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge"), true);
        // Vernon
        //  Dudley
        //   Petunia
        //    Madge
        prettyPrint(reverse(Arrays.asList("Vernon", "Dudley", "Petunia", "Madge")), false);
        //    Madge
        //   Petunia
        //  Dudley
        // Vernon
    }
    // ������ �������
    public static void sayHello() {
        System.out.println("Hello Class!");
    }

    // ������ �������
    public static String hello() {
        return "Hello Engineers!";
    }

    public static void test(String expected, String actual) {
        // �������� ��� ����
    }

    public static String hello(String who) {
        // �������� ��� ����
    }

    public static String hello(int howMany) {
        // �������� ��� ����
    }
    public static String hello(int howMany, String whom) {
        // �������� ��� ����
    }

    // �������� ������� ����
}

