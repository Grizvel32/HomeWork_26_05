package com.company;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {

        int n;
        int maxWeight = 0;
        int minWeight = 1;
        int currentWeight;

        Scanner input = new Scanner(System.in);

        n = input.nextInt();

        for(int i=0; i<n;i++)
        {
            currentWeight = input.nextInt();

            if(currentWeight>maxWeight)
            {
                maxWeight = currentWeight;
            }
            if(currentWeight<minWeight)
            {
                minWeight = currentWeight;
            }

        }
        System.out.print(minWeight+" "+maxWeight);


    }
}
