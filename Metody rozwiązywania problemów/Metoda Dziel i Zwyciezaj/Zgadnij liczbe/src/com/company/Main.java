package com.company;

import java.util.Random;

public class Main {

    static Random random = new Random();
    static int liczba = random.nextInt(1000)+0;
    static int proba=1;

    public static void main(String[] args) {
	szukanie(0,1000);
    }

    public static void szukanie(int a, int b) {

        int propozycja = ((a+b)/2) ;
        if(propozycja==liczba) {
            System.out.println("propozycja to: " + propozycja);
            System.out.println("zgadles za : "+proba+" razem! twoja liczba to: " + liczba);
            System.out.println();
        }
        else if(propozycja>liczba) {
            System.out.println("propozycja to: "+propozycja);
            System.out.println("za dużo!");
            System.out.println();
            proba++;
            szukanie(a,((a+b)/2)-1);
        }
        else if(propozycja<liczba){
            System.out.println("propozycja to: "+propozycja);
            System.out.println("za mało! ");
            System.out.println();
            proba++;
            szukanie(((a+b)/2)+1,b);
        }
    }
}
