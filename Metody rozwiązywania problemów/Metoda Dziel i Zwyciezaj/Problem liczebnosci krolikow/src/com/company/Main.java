package com.company;

public class Main {

    public static void main(String[] args) {
        final int N = 5; // n-ty wyraz ciągu
        System.out.println(fibo(N));
    }
    static int fibo(int n)
    {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibo(n-1) + fibo(n-2);
    }

    static int fibo2(int n) {
        if(n==1 || n==2 || n==3) {
            return 2;
        }
        else {
            return (fibo(n-1) + fibo(n-2))/fibo(n-3);
        }
    }
}
