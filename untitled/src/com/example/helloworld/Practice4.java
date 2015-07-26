package com.example.helloworld;

/**
 * Created by Îëÿ on 26.07.2015.
 */
public class Practice4 {
    public static void main(String[] args) {

        int[] operand1 = {76, 90, 4, 87, 70, 57, 45, 70, 31, 69, 18, 40, 76};
        int[] operand2 = {76, 50, 36, 77, 87, 28, 98, 20, 20, 52, 86, 34, 34};
        int[] expectedResults = {152, 140, 40, 164, 157, 85, 146, 90, 51, 121, 104, 74, 110};

        int length1 = operand1.length;
        int length2 = operand2.length;
        int length3 = expectedResults.length;
        int operandSum = 0;

        for (int i = 0; i < length1; i++){
            operandSum = operand1[i] + operand2[i];
            System.out.println(operandSum);
            if (expectedResults[i] == operandSum){
                System.out.println("TestsPassed");
            } else {
                System.out.println("TestsFailed");
                System.out.println("Expected: " + expectedResults[i] + "; " + "Actual: " + operandSum);
            }
        }


    }
}