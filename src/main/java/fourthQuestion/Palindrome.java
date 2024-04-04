package fourthQuestion;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        String givenString = "";
        String appender = "";
        char leftChar = 'a';
        char rightChar = 'b';

        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Palindrome");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                scanner.nextLine();
                if (mode == 1) {
                    System.out.print("Masukan kata : ");
                    givenString = scanner.nextLine();
                    // normalize the given string
                    givenString = givenString.toLowerCase();


                    if (isPalindrome(givenString)) {
                        appender = " merupakan palindrome";
                    }
                    else {
                        appender = " bukan merupakan palindrome";
                    }
                    System.out.println("Kata " + '\'' + givenString + '\'' + appender);

                }
                else {
                    if (mode != -1)
                    System.out.println("Please input the right mode!");
                }

            }catch (Exception e) {
                System.out.println("WARNING !!!");
                System.out.println("You should give input integer only on mode !!!");
                System.out.println("You should give input string only on kata !!!");
                System.out.println("We accept alphanumeric only on kata !!!");
                return ;
            }
        }

        scanner.close();

    }

    private static boolean isPalindrome(String givenString) {

//        for (int i = 0 ; i < givenString.length(); i ++) {
//            if (i >= givenString.length() - 1 - i) {
//                break;
//            }
//            else if (givenString.charAt(i) != givenString.charAt(givenString.length() - 1 - i)) {
//                return false;
//            }
//
//        }

        int i = 0;
        // refactor
        while (i < givenString.length() - 1 - i) {
            if (givenString.charAt(i) != givenString.charAt(givenString.length() - 1 - i)) {
                return false;
            }
            i ++;
        }
        return true;

    }
}
