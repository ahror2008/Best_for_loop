package com.company;

public class Main1 {
    public static void main(String[] args) {
        int n = 10;
        for (int i = 1; i <n; i++) {



            for (int j = n; j >= 1; j--) {


                if (i >= j) {
                    System.out.print(j);



                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
}
