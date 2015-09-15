package com.example.helloworld;

/**
 * Created by OlhaY on 9/15/2015.
 */
public class DoorMain {
    public static void main(String[] args) {

        Door d = new Door();
        System.out.println(d.color);
        //Wood

        Door d2 = new Door();
        System.out.println(d2.color);
        //Wood

        d.color = "Red";
        System.out.println(d.color);
        //Red

        System.out.println(d2.color);
        // Wood

        System.out.println(d.state());
        // Closed
        System.out.println(d2.state());
        // Closed
        d.open();
        System.out.println(d.state());
        // Open
        System.out.println(d2.state());
        // Closed

        System.out.println(Door.made);
        // China
        Door.made = "Japan";
        System.out.println(Door.made);
        // Japan
        //System.out.println(Door.state); // ERROR


    }
}
