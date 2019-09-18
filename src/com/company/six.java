package com.company;

import java.util.Scanner;

public class six {




    public static void fun6() {

        System.out.println("Question 6 :");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);


        if(ch>='A' && ch<='Z'){
            System.out.println("Capital letter");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Small letter");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("It's a Number");
        }
        else{
            System.out.println("Special Symbol");
        }




    }



}
