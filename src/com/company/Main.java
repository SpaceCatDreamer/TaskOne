package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int i = 0, j = 0;
        System.out.println("Pancakes");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 3 числа\n");
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        float num3 = in.nextFloat();
        System.out.println(num1 + num2 + num3);
       // int num1 = in.nextInt();
       // int num2 = in.nextInt();
       // System.out.println(num1);
       // System.out.println(num2);
       // float num3 = in.nextFloat();
       // System.out.println(num3);
        /*for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
*/
        //////////////
        System.out.println(function(num1,num2, num3));
    }
    public static float function(float num1, float num2, float num3) {
        float multiply =  num1*num2*num3;
        float middleSum = (num1 + num2 + num3)/3;
        int i = 0, j = 0;
        float theBiggest = 0;
        if((num1>num2)&&(num1>num3))
        {
            theBiggest = num1;
        }
        else if ((num2>num1)&&(num2>num3))
        {
            theBiggest = num2;
        }
        else if((num3>num1)&&(num3>num2))
        {
            theBiggest = num3;
        }
        System.out.println(multiply + middleSum + theBiggest);
        return theBiggest;
    }
}

