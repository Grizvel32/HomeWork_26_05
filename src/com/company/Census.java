package com.company;

import java.util.Scanner;

public class Census {
    public static void main(String[] args) {
        int n;
        int currentAge;
        int lastAge = 0;
        int sex;
        int minNumber;
        int saveIndex=0;
        final int NOMEN = -1;

        Scanner input = new Scanner(System.in);
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            currentAge = input.nextInt();
            sex = input.nextInt();
            if (sex == 1) {
                if (currentAge > lastAge) {
                    lastAge = currentAge;
                    saveIndex = i;
                }
            }
        }
        if(lastAge!=0)
        {
            System.out.println(saveIndex);
        }
        else {
            System.out.println(NOMEN);
        }


    }
}
