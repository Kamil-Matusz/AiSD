package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random los = new Random();
        int licz= 0;
        for(int i=0;i<100;i++) {
            double x = los.nextInt(1001)/1000.0;
            double y = los.nextInt(1001)/1000.0;
            if( y <= Math.sin(x)) {
                licz++;
            }
        }
        System.out.println("Pole wynosi: " + (licz/100.0));
    }
}
