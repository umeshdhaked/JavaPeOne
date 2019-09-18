package math.classes;

import java.util.Scanner;

public class charCase {




    public static void fun() {

        System.out.println("6. check character case :");

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
