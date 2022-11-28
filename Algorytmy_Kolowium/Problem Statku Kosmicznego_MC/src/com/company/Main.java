package com.company;

import java.util.Random;

public class Main {

    static final int LOS = 10; // liczba losowan
    public static void main(String[] args) {
        //  A        B        C         D
        int[][] astroSpec = {{1, 4}, {2, 3, 4}, {3, 5}, {1, 2, 5}};
        int[] astro = {1, 2, 3, 4, 5};
        int N = astro.length;
        // parametry rozwiazania optymalnego
        String optKonfig = new String();
        int optAstroLicz = N;

        Random los = new Random();
        for (int i = 0; i < LOS; i++) // 10 prob losowania (10 wygenerowanych rozwiazan)
        {
            System.out.println("Rozwiazanie nr "+(i+1));
            for (int j = 0; j < astro.length; j++) // tasowanie astronautow
            {
                int rndIndex = los.nextInt(N);
                if (rndIndex != j)
                {
                    int pom = astro[j]; // zamiana elementow
                    astro[j] = astro[rndIndex];
                    astro[rndIndex] = pom;
                }
            }
            System.out.print("\tkolejnosc astro po przemieszaniu:\n\t");
            for (int j : astro)
                System.out.print(j+"\t");
            System.out.println("");

            String locKonfig = new String();  // parametry lokalnego rozwiazania
            int astroLicz = 0;
            int[] specStatus = new int[astroSpec.length];
            int j = 0;
            int sumSpec=0;
            while (sumSpec < astroSpec.length)  // pakujemy astro na statek dopoki nie wszystkie spec obsadzone
            {
                for (int k=0; k<astroSpec.length; k++)
                {
                    for (int l=0; l<astroSpec[k].length; l++)
                    {
                        if(astroSpec[k][l] == astro[j])
                            specStatus[k]++;
                    }
                }
                locKonfig = locKonfig + " " + astro[j]; // wsadz na poklad
                astroLicz++; // zlicz astro
                j++;
                sumSpec=0;
                for (int specStat : specStatus) // oblicz ile teraz spec obsadzonych
                    if(specStat>=1)
                        sumSpec++;
                System.out.println("\tastro zabrani: "+locKonfig);
                System.out.print("\tobsadzone specjalnosci:\t"+sumSpec+" :\t");
                for (int specStat : specStatus)
                    System.out.print(specStat+" ");
                System.out.println();
            }
            if (astroLicz < optAstroLicz)    // jesli dane rozwiazanie (lokalne) jest lepsze od dotychczas najlepszego rozwiazania (globalnego)
            { // podmiana wartosci optymalnego rozwiazania
                optKonfig = locKonfig;
                optAstroLicz = astroLicz;
            }
        }
        System.out.println("//////////////////////////////////");
        System.out.println("Moga leciec: "+optKonfig);
    }
}
