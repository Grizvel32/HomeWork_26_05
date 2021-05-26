package com.company;

import java.util.Scanner;

public class Lift {
    public static void main(String[] args) {
        final int EXIT_CODE = 0;
        int pressButton;

        Scanner input = new Scanner(System.in);
        int count = 1;
        int lastPress=0;
        do {
            pressButton = input.nextInt();
            if(pressButton!=lastPress) {
                count++;
                lastPress = pressButton;
            }


        }while (pressButton!=0);
        System.out.println(count);
    }
}
