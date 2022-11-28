package com.company;

public class Main {

    private static long[] sick = new long[50];
    private static long[] notSick = new long[50];

    private static void epidemicDynamicProgramming(int day) {
        long[] sickPeople = new long[day+1];
        long[] notSickPeople = new long[day+1]; // ozdrowiency
        sickPeople[1] = 10; // first day
        if(day < 7) {
            for(int i = 1; i <= day; i++) {
                notSickPeople[i] = 0;
            }
        } else {
            for(int i = 1; i <= 7; i++) {
                notSickPeople[i] = 0;
            }
        }
        for(int i = 2; i <= day; i++) {
            if(i >= 8) {
                notSickPeople[i] = sickPeople[i - 7] + notSickPeople[i-1];
                sickPeople[i] = 3 * sickPeople[i-1] - notSickPeople[i];
                if(sickPeople[i] > 100000) {
                    sickPeople[i] = 100000;
                }
                if(notSickPeople[i] > 100000) {
                    notSickPeople[i] = 100000;
                }
                if(sickPeople[i] - notSickPeople[i] == 0) {
                    System.out.println("Epidemia zakończona, w dniu: " + i + ", ponieważ wszycy zyskali status ozdrowieńca");
                    break;
                }
            } else {
                sickPeople[i] = 3 * sickPeople[i-1];
            }
        }
        for(int i = 1; i <= day; i++) {
            System.out.print(sickPeople[i] + " ");
        }
        System.out.println();
        for(int i = 8; i <= day; i++) {
            System.out.print(notSickPeople[i] + " ");
        }
    }
}
