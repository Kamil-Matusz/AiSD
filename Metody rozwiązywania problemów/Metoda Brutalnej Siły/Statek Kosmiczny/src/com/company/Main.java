package com.company;

public class Main {

    public static void main(String[] args) {
        int k1, k2, k3, k4, k5, a, b, c, d;
        int ile, minIle = 5;
        int[] k = new int[5]; // rozwiązanie najlepsze

        for (k1 = 0; k1 <= 1; k1++) { // bierzemy kosmonautę lub nie binarnie 0/1
            for (k2 = 0; k2 <= 1; k2++) {
                for (k3 = 0; k3 <= 1; k3++) {
                    for (k4 = 0; k4 <= 1; k4++) {
                        for (k5 = 0; k5 <= 1; k5++) {
                            a = k1 + k4;
                            b = k2 + k3 + k4;
                            c = k3 + k5;
                            d = k1 + k2 + k5;
                            if (a == 0 || b == 0 || c == 0 || d == 0) {
                                continue;
                            }
                            ile = k1 + k2 + k3 + k4 + k5;
                            if (minIle > ile) {
                                minIle = ile; // podmiana
                                k[0] = k1; // zapis stanu kosmonautów
                                k[1] = k2;
                                k[2] = k3;
                                k[3] = k4;
                                k[4] = k5;
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Zabieramy " + minIle + " kosmonautów : ");
        if (k[0] == 1) {System.out.println("k1 "); }
        if (k[1] == 1) {System.out.println("k2 "); }
        if (k[2] == 1) {System.out.println("k3 "); }
        if (k[3] == 1) {System.out.println("k4 "); }
        if (k[4] == 1) {System.out.println("k5 "); }
        }
    }

