package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        double[] masiv = new double[15];


        masiv[0] = 1.2;
        masiv[1] = 2.11;
        masiv[2] = -11.2;
        masiv[4] = 21.1;
        masiv[5] = 32.22;
        masiv[6] = -10.30;
        masiv[7] = -3.2;
        masiv[8] = -1.4;
        masiv[9] = 1.10;
        masiv[10] = 8.2;
        masiv[11] = -11.2;
        masiv[12] = -7.6;
        masiv[13] = 12.1;
        masiv[14] = 15.9;

        boolean isNegativeNum = false;
        double result = 0;
        double result2 = 0;
        int counter2 = 0;
        int counter = 0;

        for (double d : masiv) {
            if (d < 0){
                isNegativeNum = true;
            }
         if (isNegativeNum){
             if (d > 0){
                 result += d;
                 counter++;
             }
             if (isNegativeNum){
                 if (d < 0){
                     result2 += d;
                     counter2++;
                 }
             }

         }


        }
        System.out.println("Сумма массива = " + result);
        System.out.println("Среднее арифмитическое массива " + result/counter);
        System.out.println("Сумма массива отриц = " + result2);
        System.out.println("Среднее арифмитическое массива отриц " + result2/counter2);


    }
}

