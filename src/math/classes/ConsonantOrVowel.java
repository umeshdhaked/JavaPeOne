package math.classes;

import java.util.Scanner;

public class ConsonantOrVowel {



    public static void fun(){

        System.out.println("3. Consonant Or Vowel :");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();


        char ch;

        for( int i=0;i<str.length();i++) {
            if ((str.charAt(i) > 'a' && str.charAt(i) < 'z') || (str.charAt(i) > 'A' && str.charAt(i) < 'Z')) {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U') {
                    System.out.print(" " + str.charAt(i) + "-Vowel");
                } else {
                    System.out.print(" " + str.charAt(i) + "-Consonant");
                }

            }
            else{
                System.out.println("Not a alphabet");
            }

        }



    }


}
