package com.company;

import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        final int highBus = 437;
        int countBridge;
        int n = 0;
        int highBridge;

        Scanner input = new Scanner(System.in);
        countBridge = input.nextInt();

        do {

        highBridge = input.nextInt();
        if(highBridge<=highBus)
            n++;
        } while (n <= countBridge);
    }
}
