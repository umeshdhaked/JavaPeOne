package com.company;

import java.util.Scanner;

public class Qten {

    public static void method(){


        System.out.println("Question 10 :");

        Scanner sc = new Scanner(System.in);
        String inputOne = sc.nextLine();

        int inputTwo = sc.nextInt();


        int len=inputOne.length();

        String ans=inputOne;


        for(int i=0;i<inputTwo;i++)
            ans = ans + inputOne.substring(len-inputTwo);


        System.out.println(ans);




    }


}
