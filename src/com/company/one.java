package com.company;

import java.util.Scanner;
import java.util.Vector;

public class one {



    public static void fun1() {

        System.out.println("Question 1 :");

        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int t = input;
        int reverse = 0;
        // reverse the number;
        while (t != 0) {
            reverse = reverse * 10;
            reverse = reverse + t % 10;
            t = t / 10;
        }

// Checking if sum is greater than 25.

        int sum = 0;

        if (reverse != input) {

            System.out.println(input + " is not palindrome");
        } else {

            Vector<Integer> var = new Vector<Integer>();

            while (input != 0) {

                var.add(input % 10);
                input = input / 10;

            }

            for (int i = 0; i < var.size(); i++) {
                if (var.get(i) % 2 == 0) {
                    sum = sum + var.get(i);
                }
            }
            if (sum > 25)
                System.out.println(reverse + " is palindrome and the sum of even numbers is greater than 25");
            else
                System.out.println(reverse + " is palindrome and the sum of even numbers is less than 25");


        }
    }





}
