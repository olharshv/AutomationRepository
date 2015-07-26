package com.example.helloworld;

/**
 * Created by Оля on 19.07.2015.
 */
public class Practice3 {
    public static void main(String[] args) {
        int a = 20;
        int b = a + 5;
        String s = "Test String";
        while (a > 0) {
            System.out.println("Recycle " + b);
            a = a - 10;
        }
        String t = "Hello Class";
        String ts = ", and Student!";
        System.out.println(t + ts);
        String[] u = {"Hello!", "Student", "Under key one but three","Class", "Audience", "Under key five"};
        System.out.println(u[5]);
        System.out.println(u[3-1]);

        for (int x = 8; x < 11; x++) {
            System.out.println(x);
        }

        String[] ss = {"How", "are", "you"};
        for (int i = 0; i < 3; i++) {
            System.out.println(ss[i]);
        }
//задание
        int[] m = {10, 20, 25, 30};
        int i = 0;
        int bb = 25;
        while (i < 4) {
            if (m[i] == bb) {
                break;
            }
            System.out.println(m[i]);
            i++;
        }
//задание

        int[] n = {10, 20, 25, 30};
        int j = 0;
        int d = 10;
        while (j < 4) {
            if (n[j] == d) {
                j++;
                continue;
            }
            System.out.println(n[j]);
            j++;
        }

        // числа от 0 до 1000, пропуская те, что делятся на 4: 123 567 91011
        for (int jj = 0; jj < 1000; jj++) {
            if (jj%4==0) {
                continue;
            }
            System.out.print("Next is " + jj);
        }
        System.out.println();

        //задание
       // boolean oper = true;
        //int aa = 10;
        //int bbbb = -8;
        boolean oper = false;
        int aa = 0;
        int bbbb = -200;
        if (oper == true){
            System.out.println(aa + bbbb);
        }else {
            System.out.println (aa - bbbb);
        }

        boolean anti = false;
        boolean oper1 = false;
        if (oper1 && anti){
            System.out.println(oper1&&anti);
        } else {
            System.out.println (oper1);
        }




    }
}
