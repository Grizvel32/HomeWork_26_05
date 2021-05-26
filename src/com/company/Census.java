package com.company;

import java.util.Scanner;

public class Census {
    public static void main(String[] args) {
        int countPersons;
        int currentAge;
        int maxAge = 0;
        int sex;
        int saveNumber=-1;


        Scanner input = new Scanner(System.in);
        countPersons = input.nextInt();

        for (int i = 1; i <= countPersons; i++) {
            currentAge = input.nextInt();
            sex = input.nextInt();
            if (sex == 1) {
                if (currentAge > maxAge) {
                    maxAge = currentAge;
                    saveNumber = i;
                }
            }
        }
            System.out.println(saveNumber);



    }
}
