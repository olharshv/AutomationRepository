package com.example.helloworld;

/**
 * Created by OlhaY on 9/15/2015.
 */
public class PracticeStaticPublicMain {
    public static void main (String[] args) {
        System.out.println("publicStaticVar = " + PracticeStaticPublic.publicStaticVar);
        //не можем обращаться к private - т.к. доступ есть только из класса PracticeStaticPublic,
        // за пределами этого класса можем только к public обращаться
        /*System.out.println("privateStaticVar = " + PracticeStaticPublic.privateStaticVar);*/
        //не static - у объектов, созданных по шаблону. так работать не будет
        //System.out.println("publicNonStaticVar = " + PracticeStaticPublic.publicNonStaticVar);

        //надо создать объект:
        PracticeStaticPublic w = new PracticeStaticPublic();
        PracticeStaticPublic w2 = new PracticeStaticPublic();
        System.out.println("publicNonStaticVar = " + w.publicNonStaticVar);
        w.publicNonStaticVar = 10;
        System.out.println("publicNonStaticVar = " + w.publicNonStaticVar);
        System.out.println("publicNonStaticVar = " + w2.publicNonStaticVar);

        System.out.println("publicNonStaticVar = " + w.getNonStaticVar());
        System.out.println("publicNonStaticVar = " + w2.getNonStaticVar());


    }
}
