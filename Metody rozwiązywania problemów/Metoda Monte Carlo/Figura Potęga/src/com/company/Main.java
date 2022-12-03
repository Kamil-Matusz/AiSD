package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

            Random los = new Random();
            int licz= 0;
            for(int i=0;i<100;i++) {
                double x = los.nextInt(701)/1000.0;
                double y = 0.4 + los.nextInt(701)/1000.0;
                if( y <= Math.pow(x/10.0,x)) {
                    licz++;
                }
            }
            System.out.println("Pole wynosi: " + (licz/100.0));
        }
}
