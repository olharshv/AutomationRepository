package com.example.helloworld;

/**
 * Created by OlhaY on 7/22/2015.
 */
public class Practice {

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
        String[] u = {"Hello!", "Student", "Under key one but three", "Class", "Audience", "Under key five"};
        System.out.println(u[5]);
        System.out.println(u[3 - 1]);

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

        // числа от 0 до 1000, пропуска€ те, что дел€тс€ на 4: 123 567 91011
        for (int jj = 0; jj < 1000; jj++) {
            if (jj % 4 == 0) {
                continue;
            }
            System.out.print("Next is " + jj);
        }


        //Fibbonachi with for
        for (int a1 = 0, a2 = 1, a3 = 0, a4 = 0; a4 < 20; a4 += 1) {
            System.out.println(a1 + " ");
            a3 = a1;
            a1 = a2;
            a2 = a1 + a3;
             //a4 - это счетчик
        }
        System.out.println("My variant! ");
        //other variant of Fibbonachi
        for (int a1 = 0, a2 = 1, a3 = 0, a4 = 0; a4 < 20; a4 += 1) {
            System.out.println(a1 + " ");
            a3 = a1 + a2;
            a1 = a2;
            a2 = a3;
            //a4 - это счетчик
        }

//задание ÷ель каждого задани€ одна: дописать код в конец программы, так что б мен€€ значени€ заданнь≥х переменнь≥х,
// но оставл€€ неизменнь≥м остальной написаннь≥й код, на выходе получить то что идет после //


        int g = 113;
        int sec = 1;
        System.out.println(g*sec);
//задание
        boolean oper = true;
        int aa = 10;
        int bbb= -8;
        //
        if (aa + bbb == 2) {
            System.out.println(aa + bbb);
        }

 //to do

        String[] strings = {"Hello", "World", "Class", "Guys", "Girls", "Everyone", "Goodbye"};
        int w1 = 1;
        int w2 = 7;
        // Hello Class
        System.out.println(strings[w1-1] +' ' + strings[w2-1]);


        for (i = 0; i < strings.length; i++) {
           // System.out.println("Phrase is " + strings[i]);
            if (i == w1) {
                System.out.println("Phrase is " + strings[i-1] + ' ' + strings[i]);
            }
        }

        //to do
        int[] notstrings = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
        int target = 1;
        for (i = 0; i < strings.length; i++){
        if (notstrings[i] == target) {
            System.out.println(i+1);
        }

        //to do
            int[] input = {1, 2, 3, 4, 1, 3, 1, 6, 6, 1, 1};
            int isAllLessThan = 3;
            System.out.println("new to do = ");
            System.out.println(input[i] > isAllLessThan);



        }
    }
}
