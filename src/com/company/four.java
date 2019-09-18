package com.company;

import java.util.Scanner;

public class four {


    public static void fun4() {

        System.out.println("Question 4 :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }


        }
    }



}
