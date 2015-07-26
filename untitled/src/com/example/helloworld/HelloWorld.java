package com.example.helloworld;

/**
 * Created by Оля on 19.07.2015.
 */
public class HelloWorld {
    public static void main(String[] args) {
        int a = 10;
        if (a < 10) {
            System.out.println("a < 10");
        } else {
            System.out.println("a>=10");
        }

        int xy = 0;
        while (xy < 10){// только это ус-е, тогда цикл никода не закончится! пишем что-угодно, что превратиться в true or false
            xy += 5; //xy = xy + 5 <=> xy +=5
            xy = xy - 4;
            System.out.println("xy = " + xy);
        }
        //for cicle example
        for (int b = 0; b < 10; b = b +5){
            System.out.println("b = " + b);
        }
        //Fibbonachi with for
        for (int a1=0, a2=1, a3=0, a4=0; a4<20; a4+=1){
            System.out.print(a1 + " ");
            a3 = a1;
            a1 = a2;
            a2 = a1 + a3;
            // System.out.println(a4); //a4 - это счетчик
        }
        System.out.println();

        //вывести строку 1001 раз с помощью for
        String S = "Hello Class! ";
        for (int i = 0; i < 1001; i+=1){
            System.out.print(S);
        }

        //задание
        int[] m2 = {0,1,2,3,4,5,6,7,8,9,10,11};
        for (int i=0; i<12; i = i+1) {
            if (m2[i] == 8) {
                break; //прекращает работу на 8ом эл-те массива
            }
            System.out.print(m2[i]);
        }
        System.out.println();
        //
        for (int i=0; i<12; i++){
            if (m2[i] == 6){
                continue; //пропускает 6й эл-т массива
            }
            System.out.println(m2[i]);
        }





       }
}

