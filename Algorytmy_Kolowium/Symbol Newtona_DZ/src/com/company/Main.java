package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(newton(5,2));
    }

    static int newton(int n, int k) {
        if(n == k || k == 0) {
            return  1;
        }
        else  {
            return  newton(n-1,k-1) + newton(n-1,k);
        }
    }
}
