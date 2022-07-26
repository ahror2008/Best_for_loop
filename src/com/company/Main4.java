package com.company;

public class Main4 {
    public static void main(String[] args) {
        int n = 15;
        int x = n / 2 + 1;
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == n / 2 + 1 || ((j <= x) != false && j > n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
            if (i <= n / 2) {
                x++;
            } else {
                x--;
            }
        }

    }
}
