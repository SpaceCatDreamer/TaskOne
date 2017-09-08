package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Pancakes");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два чила\n");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println(num1);
        System.out.println(num2);
       // float num3 = in.nextFloat();
       // System.out.println(num3);
        /*for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
*/
        System.out.println(function(num1,num2));
    }
    public static int function(int num1, int num2) {
        return num1*num2;
    }
}

