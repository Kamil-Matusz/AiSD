package com.company;

import java.util.Arrays;

public class Produkcja_lodów {
    static final int[][] czasy = {
            {0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};
    static final int N = 6;
    static final int[] L = new int[N+1];
    static int najlepszyCzas = Integer.MAX_VALUE;
    static int[] najlepszaKolejnosc = new int[N+1];

    public static void run(int i) {
        lody(i);
        System.out.println("Kombinacja z minimalnym czasem to: ");
        for (int j=0; j<N+1; j++) {
            System.out.print(najlepszaKolejnosc[j] + " ");
        }
        System.out.println();
        System.out.println("Czas ten wynosi: " + najlepszyCzas);
    }

    static void lody(int i) {
        int obecnyCzas = 0;
        if (i == N) {                               // Zmienna "i" kiedy osiagnie wartosc 6 nakazuje sprawdzenie aktualnego czasu
            L[N] = L[0];
            for (int j=0; j<N; j++) {
                obecnyCzas += czasy[L[j]-1][L[j+1]-1];
            }
            if (obecnyCzas < najlepszyCzas) {
                najlepszyCzas = obecnyCzas;
                najlepszaKolejnosc = Arrays.copyOf(L, L.length);
            }
        } else {
            for (int j = 1; j <= N; j++) {          // Zmienna "j" sluzy do wybrania konkretnej liczby do wstawienia
                int k;
                for (k = 0; k < i; k++) {           // Zmienna "k" Sluzy do znalezienia indeksu w tablicy gdzie potencjalnie mozna wstawic
                    if (L[k] == j) break;           // Ten if sluzy optymalizaji czasu
                }
                if (k == i) {                       // Zmienna "k" jesli zgadza sie z "i" decyduje o wstawieniu na konkretny indeks (k)
                    L[k] = j;
                    lody(i + 1);
                }
            }
        }
    }
}
