package math.classes;

import java.util.Scanner;

public class TomJerry {


    public static void fun() {
        System.out.println("2. Tom Jerry :");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();


        if (input > 20 && input < 30) {
            if (input % 2 == 0)
                System.out.println("Jerry");
            else
                System.out.println("Tom");
        }


    }


}
