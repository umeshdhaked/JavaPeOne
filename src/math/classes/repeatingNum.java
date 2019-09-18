package math.classes;

import java.util.Scanner;

public class repeatingNum {


    public static void fun() {

        System.out.println("4. repeating n number n times :");

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();


        for (int i = 1; i <= n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }


        }
    }



}
