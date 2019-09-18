package com.company;

import java.util.Scanner;

public class two {


    public static void fun2() {
        System.out.println("Question 2 :");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        if (input > 20 && input < 30) {
            if (input % 2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }


    }


}
