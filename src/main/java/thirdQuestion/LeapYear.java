package thirdQuestion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.leapYear;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        Integer year = 0;
        String appender = "";
        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Leap year");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                if (mode == 1) {
                    System.out.print("Masukan tahun : ");
                    year = scanner.nextInt();
                    // we can see the recursive logic on factorialRes method
                    if (leapYearConverter(year)) {
                        appender = " merupakan tahun kabisat";
                    }
                    else {
                        appender = " bukan merupakan tahun kabisat";
                    }
                    System.out.println("Tahun " + year + appender);

                }
                else {
                    if (mode != -1)
                    System.out.println("Please input the right mode!");
                }

            }catch (Exception e) {
                System.out.println("WARNING !!!");
                System.out.println("You Should Input Integer Only  !!!");
                return ;
            }
        }

        scanner.close();

    }

    private static boolean leapYearConverter(Integer year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);

    }
}
