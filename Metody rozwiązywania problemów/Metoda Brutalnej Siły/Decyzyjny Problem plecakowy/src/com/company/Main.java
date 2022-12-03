package com.company;

public class Main {

    final static int N = 6;
    final static int MAX_V = 10;
    final static int[] V = {6, 2, 3, 2, 3, 1};
    final static int[] W = {6, 4, 5, 7, 10, 2};
    public static void main(String[] args) {
        int[] przedmioty = new int[N];
        int v, w;
        int Max_W = 0;
        int p0, p1, p2, p3, p4, p5;
        for (p0 = 0; p0 <= 1; p0++) {
            for (p1 = 0; p1 <= 1; p1++) {
                for (p2 = 0; p2 <= 1; p2++) {
                    for (p3 = 0; p3 <= 1; p3++) {
                        for (p4 = 0; p4 <= 1; p4++) {
                            for (p5 = 0; p5 <= 1; p5++) {
                                v = p0 * V[0] + p1 * V[1] + p2 * V[2] + p3 * V[3] + p4 * V[4] + p5 * V[5];
                                if (v <= MAX_V) {
                                    w = p0 * W[0] + p1 * W[1] + p2 * W[2] + p3 * W[3] + p4 * W[4] + p5 * W[5];
                                    if (w > Max_W) {
                                        Max_W = w;
                                        przedmioty[0] = p0;
                                        przedmioty[1] = p1;
                                        przedmioty[2] = p2;
                                        przedmioty[3] = p3;
                                        przedmioty[4] = p4;
                                        przedmioty[5] = p5;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println("Wartosc przedmiotów w plecaku, to:  " + Max_W);
        if (przedmioty[0] == 1) {System.out.println("p0 "); }
        if (przedmioty[1] == 1) {System.out.println("p1 "); }
        if (przedmioty[2] == 1) {System.out.println("p2 "); }
        if (przedmioty[3] == 1) {System.out.println("p3 "); }
        if (przedmioty[4] == 1) {System.out.println("p4 "); }
        if (przedmioty[5] == 1) {System.out.println("p5 "); }

        System.out.println();
    }
}