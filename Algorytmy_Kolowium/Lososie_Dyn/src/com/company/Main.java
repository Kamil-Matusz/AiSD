package com.company;

public class Main {

    private static final double EULER = Math.exp(0.003);
    private static final int POPULATION = 1000000;


    private static void populationDynamicProgramming(int t) {
        int[] population = new int[100];
        population[0] = 1000000;

        for (int i = 1; i <= t; i++) {
            population[i] = (int) ((population[i - 1] * EULER) - (population[i - 1] * (4 * i * 0.001)));
        }

        for (int i = 0; i <= t; i++) {
            System.out.print(population[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
	// write your code here
    }
}
