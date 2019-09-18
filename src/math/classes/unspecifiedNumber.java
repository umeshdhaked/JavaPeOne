package math.classes;

import java.util.Scanner;

public class unspecifiedNumber {


    public static void fun() {

        System.out.println("5. unspecified Number till Character:");

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
