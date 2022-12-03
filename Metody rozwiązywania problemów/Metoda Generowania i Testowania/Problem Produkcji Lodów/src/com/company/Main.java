package com.company;

import java.util.Arrays;

public class Main {

    final static int N = 6; // permutacje n-elementowe
    private static int[] l = new int[N];
    static int kosztCzasowy=0;
    static int maks=Integer.MAX_VALUE;
    static int[] rozw = new int[7];
    static void permutacje(int i)
    {
        int[][] t={{0,7,20,21,12,23},{27,0,13,16,46,5},{53,15,0,25,27,6},{16,2,35,0,47,10},{31,29,5,18,0,4},{28,24,1,17,5,0}};
        if (i == N)
        {
            for(int j = 0; j < N-1; j++) {
                kosztCzasowy=kosztCzasowy+(t[l[j]-1][l[j + 1]-1]);
                System.out.print(t[l[j] - 1][l[j + 1] - 1] + " ");
            }
            kosztCzasowy=kosztCzasowy+t[l[5]-1][l[0]-1];
            System.out.println("TUTA: " + kosztCzasowy);
            if (kosztCzasowy<maks){
                for (int j = 0; j < N; j++) {
                    rozw[j]=l[j];
                }
                rozw[6]=l[0];
                maks=kosztCzasowy;
            }
            kosztCzasowy=0;
            System.out.println();
        }
        else
        {
            for (int j = 1; j <= N; j++)
            {
                int k;
                for (k = 0; k < i; k++)
                    if (l[k] == j) break;
                if (k == i)
                {
                    l[k] = j;
                    permutacje(i+1);
                }
            }
        }
    }

    public static void main(String[] args)
    {
        permutacje(0);
        System.out.println("koszt najmniejszy:" +maks);
        System.out.println(rozw[0]+" "+rozw[1]+" "+rozw[2]+" "+rozw[3]+" "+rozw[4]+" "+rozw[5]+" "+rozw[6]);
    }
}