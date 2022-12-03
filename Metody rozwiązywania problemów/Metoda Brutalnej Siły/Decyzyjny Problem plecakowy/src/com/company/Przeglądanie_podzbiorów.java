package com.company;

public class Przeglądanie_podzbiorów {
    final static int N = 6;
    final static int MAX_V = 10;
    final static int[] V = {6, 2, 3, 2, 3, 1};
    final static int[] W = {6, 4, 5, 7, 10, 2};
    public void Przeglądanie_podzbiorów() {
        int[] tab = new int[N+1];
        int[] rozwiązanie = new int[N]; // najlepsze możliwe rozwiązanie
        int maxW = 0;
        int s = (int) Math.pow(2,N);
        for(int l = 0;l<s;l++) {
            int v = 0; // aktualna objętość
            for (int k=0;k<N;k++) v = v + tab[k] * V[k]; // czy k-ty przedmiot został wzięty
            if(v <= MAX_V) {
                int w = 0;
                for(int k =0;k <N;k++) {
                    w = w+ tab[k] * W[k]; // sumowanie wartości przedmiotów
                }
                if(w >maxW) {
                    maxW = w; // podmiana wartości plecaka
                    for(int k =0;k<N;k++) {
                        rozwiązanie[k] = tab[k]; // podmiana rozwiązania
                    }
                }
            }
            int i =0;
            do{
                if(tab[i] == 1) {
                    tab[i] = 0;
                    i++;
                }
                else {
                    tab[i] = 1;
                    break;
                }
            }while (true);
        }
        System.out.println("Optymalna wartość plecaka: " + maxW);
        System.out.println("Przedmioty w plecaku: ");
        for(int i=0;i<N;i++) {
            if(rozwiązanie[i] == 1) {
                System.out.println(i + " ");
            }
        }
    }
}
