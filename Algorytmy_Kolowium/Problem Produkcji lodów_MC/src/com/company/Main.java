package com.company;

import java.util.Random;

public class Main {

    static final int[][] lodyTab =
            {{0, 7, 20, 21, 12, 23},
            {27, 0, 13, 16, 46, 5},
            {53, 15, 0, 25, 27, 6},
            {16, 2, 35, 0, 47, 10},
            {31, 29, 5, 18, 0, 4},
            {28, 24, 1, 17, 5, 0}};

    public static void main(String[] args) {
        int kosztCzasowy = 0;
        int[] kolejnoscLodow = {1, 2, 3, 4, 5, 6};
        final int liczbaLosowan = 100000;
        Random random = new Random();
        int maksCzasowy = Integer.MAX_VALUE;
        int[] rozw = new int[7];

        for (int i = 0; i < liczbaLosowan; i++) {
            kosztCzasowy = 0;
            int liczbaLodow = 0;
            for (int j = 0; j < kolejnoscLodow.length; j++) {
                int randomIndex = random.nextInt(kolejnoscLodow.length);
                if (randomIndex != j) {
                    int pom = kolejnoscLodow[j];
                    kolejnoscLodow[j] = kolejnoscLodow[randomIndex];
                    kolejnoscLodow[randomIndex] = pom;
                }
            }
            System.out.println("kolejnosc lodow po przemieszaniu: ");
            for (int kol :
                    kolejnoscLodow) {
                System.out.print(kol + " ");
            }
            System.out.println();
            while (liczbaLodow < (lodyTab.length-1)) {
                kosztCzasowy = kosztCzasowy + (lodyTab[kolejnoscLodow[liczbaLodow] - 1][kolejnoscLodow[liczbaLodow + 1] - 1]);
                liczbaLodow++;
            }
            kosztCzasowy = kosztCzasowy + (lodyTab[kolejnoscLodow[5]-1][kolejnoscLodow[0]-1]);
            System.out.println("Tutaj"+kosztCzasowy);
            if (kosztCzasowy<maksCzasowy){
                maksCzasowy=kosztCzasowy;

                for (int j = 0; j < lodyTab.length; j++) {
                    rozw[j]=kolejnoscLodow[j];
                }
                rozw[6]=kolejnoscLodow[0];
            }
        }
        System.out.println("najlpeszy koszt: " + maksCzasowy);
        for (int roz : rozw) {
            System.out.print(roz+" ");

        }
    }
}
