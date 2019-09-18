package com.company;

import java.util.Scanner;

public class Qnine {

    public  static void method(){


        System.out.println("Question 9 :");

        Scanner sc = new Scanner(System.in);


        String str= sc.nextLine();

        int len = str.length();



        char[] ch = new char[len];

        for(int i=0;i<len;i++)
        {
            ch[i]=str.charAt(len-1-i);

        }

        String newStr= new String(ch);

        System.out.println(newStr);






    }


}
