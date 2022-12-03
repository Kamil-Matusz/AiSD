package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader str = new InputStreamReader(System.in);
        BufferedReader wejscie = new BufferedReader(str);
        String tekst;

        final int M[] = {500, 200, 100, 50, 20, 10, 5, 2, 1};
        final int L[] = {1, 2, 0, 7, 2, 2, 5, 2, 10};
        final int zliczaj[] = new int[M.length];
        int zl, gr, r, i = 0;
        System.out.println("Podaj reszte..");
        System.out.print("zlotych: ");
        tekst = wejscie.readLine();
        zl = Integer.parseInt(tekst);
        System.out.print("groszy: ");
        tekst = wejscie.readLine();
        gr = Integer.parseInt(tekst);

        System.out.println("Reszta: ");
        r = zl * 100 + gr; // konwersja reszty na grosze
        while (r >0 && i<M.length) {
            if(r >= M[i] && L[i] >0 ){ // jeżeli reszta wieksza/równa danemu nominałowi
                System.out.println(M[i] / 100.0 + " "); // wypisz ten nominał
                zliczaj[i]++;
                r = r - M[i]; // i pomnijesz o wydane monety
                L[i] --;
            }
            else
                i++;
        }
        System.out.println();
        System.out.println("\nWydane monety:\n" + "nominał\tliczba monet");
        for(int j=0;j<M.length;j++)
            System.out.println(M[j]/100.0 + "\t" + zliczaj[j]);

        if(r >0)
            System.out.println("Nie można wydać całej reszty! Zostało: " + r/100.0 + " zł");
    }
}
