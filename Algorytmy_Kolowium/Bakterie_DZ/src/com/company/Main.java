package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(bakterie(1000));
    }

    static int bakterie(float i) {
        if(i <=1) {
            return 0;
        }
        else {
            return bakterie(i/2)+2;
        }
    }
}
