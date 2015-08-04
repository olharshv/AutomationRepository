package com.example.helloworld;

/**
 * Created by OlhaY on 8/4/2015.
 */
public class Practice5 {
    public static void main(String[] args) {
        checkResult(1, square(1));
        checkResult(4, square(2));
        checkResult(100, square(10));
        checkResult(100, square(-10));

        checkResult("HelloHelloHello", multiString(3, "Hello"));
        checkResult("Privet", multiString(1, "Privet"));
        checkResult("Aloha! Aloha! ", multiString(2, "Aloha! "));
        checkResult("", multiString(0, "ThisOneWillNotShow"));

        checkResult(true, compare5ElArrays(new int[]{1, 2, 3, 4, 6}, new int[]{1, 2, 3, 4, 6}));
        checkResult(true, compare5ElArrays(new int[]{10, 500, 0, 0, -100}, new int[]{10, 500, 0, 0, -100}));
        checkResult(false, compare5ElArrays(new int[]{1, 2, 3, 4, 6}, new int[]{1, 3, 2, 4, 6}));
        checkResult(false, compare5ElArrays(new int[]{1, 3, 2, 4, 6}, new int[]{1, 2, 3, 4, 6}));

        checkResult(true, compareArrays(new int[]{1, 2, 3, 4, 6}, new int[]{1, 2, 3, 4, 6}));
        checkResult(false, compareArrays(new int[]{1, 2, 3, 4, 6, 7}, new int[]{1, 2, 3, 4, 6}));
        checkResult(true, compareArrays(new int[]{}, new int[]{}));
        checkResult(false, compareArrays(new int[]{1}, new int[]{-1}));
    }

    // ������� ��������� �����, � ���������� ������� ��� ����� ���������� �� ����.
    public static int square(int value) {
        return value * value;
    }

    // ������� ��������� ����� � ������, � ���������� ������� ��� ������ ����������� ����� ���.
    public static String multiString(int times, String value) {
        String result = "";
        for (int i = 0; i < times; i++) {
            result += value;
        }
        return result;
    }

    // ������� ��������� 2 ������� ������� 5, � ���������� ������ ��������� �� � ��� ��� �������� (true/false).
    public static boolean compare5ElArrays(int[] arr1, int[] arr2) {
        for (int i = 0; i < 5; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // ������� ��������� 2 ������� ����� �������, � ������� � ���������� ����������� �� ��� �� ��������.
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    // Helper functions for beautiful output.
    public static void checkResult(int expected, int actual) {
        if (expected == actual) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }

    public static void checkResult(String expected, String actual) {
        if (expected.equals(actual)) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }

    public static void checkResult(boolean expected, boolean actual) {
        if (expected == actual) {
            System.out.println("Test PASSED.");
        } else {
            System.out.println("Expected: " + expected + " Actual: " + actual + " Test FAILED.");
        }
    }
}
