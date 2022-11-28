package com.company;

public class Main {

    static int epidemia(int n) {
        if (n == 1)
            return 10;
        else if (n >= 2 && n <= 8)
            return 2*epidemia(n - 1)+epidemia(n-1);
        else if(n<=14)
            return  (2*epidemia(n - 1) - epidemia(n - 8)+epidemia(n-1));
        else return 2 * (epidemia(n - 1) + epidemia(n - 14));
    }

    static void populacja(int p) {
        int n = 1;
        while (epidemia(n) < p / 2) {
            n++;
        }
        System.out.println("najwiecej chorych bedzie w " + n + " dniu");
        n = 1;
        while (epidemia(n) < p) {
            n++;
        }
        System.out.println("w dniu " + (n + 8) + " zakonczy sie epidemia wszyscy wyzdrowieja");
    }

    public static void main(String[] args) {
        populacja(100000);
        System.out.println(epidemia(10));
    }
}
