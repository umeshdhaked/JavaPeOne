package com.company;

import java.util.Scanner;

public class five {


    public static void fun5() {

        System.out.println("Question 5 :");

        Scanner sc = new Scanner(System.in);
        String str = "0";

        int sum = 0;


        System.out.println("please number one by one : ");
        boolean flag = true;

        while (flag) {


            try {
                int d = Integer.parseInt(str);
            } catch (NumberFormatException nfe) {
                System.out.println(nfe.toString());
                flag = false;
            }
            if (flag) {
                sum = sum + Integer.parseInt(str);
                str = sc.nextLine();
            }

        }




        System.out.println("sum = " + sum);

    }

}
