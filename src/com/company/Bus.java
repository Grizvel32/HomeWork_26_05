package com.company;

import java.util.Scanner;

public class Bus {

    public static void main(String[] args) {
        final int highBus = 437;
        int countBridge;
        int n = 1;
        int numbCrash;
        int highBridge;
        int controlCrash = 0;
        final int EXIT_CODE = -1;
        String crashMessage = "";


        Scanner input = new Scanner(System.in);
        countBridge = input.nextInt();

        do {

        highBridge = input.nextInt();

        if(highBridge<=highBus && controlCrash!=EXIT_CODE){
            numbCrash = n;
            controlCrash = EXIT_CODE;
            crashMessage +=  String.format("Crash %d",numbCrash);
        }
            n++;
        } while (n<=countBridge);

        if(controlCrash==EXIT_CODE)
        {
            System.out.println(crashMessage);
        }
        else {
            System.out.println("No crash");
        }
    }
}
