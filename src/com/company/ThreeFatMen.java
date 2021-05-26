package com.company;

import java.util.Scanner;

public class ThreeFatMen {
    public static void main(String[] args) {

        int weight_1, weight_2, weight_3;
        int lowWeightBorder = 94 ;
        int highWeightBorder = 1000 ;
        int maxWeight;
        boolean ErrorCheck = false;
        String outputMessage = "";


        Scanner input = new Scanner(System.in);


            weight_1 = input.nextInt();
            if (weight_1 < lowWeightBorder || weight_1 > highWeightBorder)
            {
                outputMessage+="Error";
                ErrorCheck = true;
            }

            weight_2 = input.nextInt();

            if(weight_2 < lowWeightBorder || weight_2 > highWeightBorder)
            {
                outputMessage+="Error";
                ErrorCheck = true;
            }
            weight_3 = input.nextInt();
            if (weight_3 < lowWeightBorder || weight_3 > highWeightBorder)
            {
                outputMessage+="Error";
                ErrorCheck = true;
            }
            if(ErrorCheck!=true) {
                if (weight_1 > weight_2) {
                    maxWeight = weight_1;
                    outputMessage+=maxWeight;

                } else {
                    maxWeight = weight_2;
                    outputMessage ="";
                    outputMessage+=maxWeight;
                }
                if (weight_3 > maxWeight) {
                    maxWeight = weight_3;
                    outputMessage ="";
                    outputMessage+=maxWeight;
                }
                System.out.println(outputMessage);

            }
            else {
                System.out.println(outputMessage);
            }




    }
}
