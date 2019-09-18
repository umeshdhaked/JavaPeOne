package math.classes;

import java.util.Random;
import java.util.Scanner;

public class guessNumber {


   public static void fun() {

        System.out.println("Question 8 :");

        Random r= new Random();

        int num= r.nextInt(50);

        System.out.println("ans = "+num);

        Scanner sc = new Scanner(System.in);

        int n=52;
        while(n!=num) {
            n = sc.nextInt();
            if(n>50)
                System.out.println("Please guess a number between 1 and 50");
            else{
                if(n<num)
                    System.out.println("Number guessed is less than original number");
                else if(n>num)
                    System.out.println("Number guessed is more than original number");

            }


        }
        System.out.println("Number guessed matches the original number");







    }






}
