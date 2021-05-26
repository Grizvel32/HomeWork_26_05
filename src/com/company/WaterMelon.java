package com.company;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {

        int countsMelons;
        int maxWeight = 0;
        int minWeight = 0;
        int currentWeight;

        Scanner input = new Scanner(System.in);

        countsMelons = input.nextInt();

        for(int i=0; i<countsMelons;i++)
        {
            currentWeight = input.nextInt();

            if(i==0) {
                maxWeight = currentWeight;
                minWeight = currentWeight;
            }
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
