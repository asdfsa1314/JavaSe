package com.SchoolHomeWork;

public class SumTest002 {
    public static void main(String[] args) {
        int sum = 0;


        for (int number = 0; number < 101; number++) {
            if (number % 5 != 0 && number % 3 == 0) {
                sum = sum + number;
            }

        }

        System.out.println(sum);

    }
}