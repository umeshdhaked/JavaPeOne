package com.company;
import math.classes.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        System.out.println("1.integerPalindrome \n2.TomJerry \n3.ConsonantOrVowel \n4.repeatingNum \n5.unspecifiedNumber \n6.charCase \n7.sortingAnumber \n8.guessNumber \n9.reverseString \n10.repeatStringEnd \n");


        int n = 10;

        while (n != 0) {
            System.out.println("");
            System.out.println("Enter Question number or press 0 for exit : ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();


            if (n > 10 && n < 0) {
                System.out.println("wrong input");
                continue;
            }

            switch (n) {
                case 1: {
                    integerPalindrome.fun();
                    break;
                }
                case 2: {
                    TomJerry.fun();
                    break;
                }
                case 3: {
                    ConsonantOrVowel.fun();
                    break;
                }
                case 4: {
                    repeatingNum.fun();
                    break;
                }
                case 5: {
                    unspecifiedNumber.fun();
                    break;
                }
                case 6: {
                    charCase.fun();
                    break;
                }
                case 7: {
                    sortingAnumber.fun();
                    break;
                }
                case 8: {
                    guessNumber.fun();
                    break;
                }
                case 9: {

                    reverseString.fun();
                    break;
                }
                case 10: {

                    repeatStringEnd.fun();
                    break;
                }
                default: {
                    System.out.println("exit");
                }


            }


        }


    }


}