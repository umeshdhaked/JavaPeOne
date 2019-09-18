package com.company;

import java.util.*;
import javax.swing.*;

public class Main {

    public static void main(String[] args) {


        int n = 10;

        while (n != 0) {
            System.out.println("Enter Question number or press 0 for exit : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();


            if (n > 10 && n < 0) {
                System.out.println("wrong input");
                continue;
            }

            switch (n) {
                case 1: {
                    one.fun1();
                    break;
                }
                case 2: {
                    two.fun2();
                    break;
                }
                case 3: {
                    three.fun3();
                    break;
                }
                case 4: {
                    four.fun4();
                    break;
                }
                case 5: {
                    five.fun5();
                    break;
                }
                case 6: {
                    six.fun6();
                    break;
                }
                case 7: {
                    seven.fun7();
                    break;
                }
                case 8: {
                    eight.fun8();
                    break;
                }
                case 9: {

                    Qnine.method();
                    break;
                }
                case 10: {

                    Qten.method();
                    break;
                }
                default: {
                    System.out.println("exit");
                }


            }


        }


    }


}