package com.codeexercises.factorial;

public class Main {

    public static void main(String[] args) {

        int n = 6;
        int factorial = n;

        for (int j = n - 1; j > 0; j--) {
            factorial = factorial * j;
        }
        System.out.println(factorial);

    }
}
