package com.company;

import java.util.ArrayList;

public class Main {

    private static int[] bakterie = new int[50];

    static void licz_bakterie (int minute) {
        bakterie[0] = 1;

        for (int i = 1; i <= minute; i++) {
            if (i % 2 != 0) {
                bakterie[i] = bakterie[i - 1];
            } else {
                bakterie[i] = bakterie[i - 1] * 2;
            }
        }
    }

    public static void main(String[] args) {
        int minute = 28;
        licz_bakterie(minute);
        for (int i = 0; i <= minute; i += 2) {
            System.out.print(bakterie[i] + " ");
        }
        System.out.println();
    }
}
