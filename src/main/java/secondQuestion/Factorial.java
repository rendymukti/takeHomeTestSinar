package secondQuestion;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        Integer factorial = 0;
        Map<Integer, BigInteger> memo = new HashMap<>();
        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Faktorial");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                if (mode == 1) {
                    System.out.print("Masukan nilai faktorial : ");
                    factorial = scanner.nextInt();
                    // we can see the recursive logic on factorialRes method
                    System.out.println("Nilai desimalnya adalah " + factorialRes(factorial, memo));
//                    System.out.println(memo);
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

    private static BigInteger factorialRes(Integer factorial, Map<Integer, BigInteger> memo) {
        if (factorial < 0) {
            throw new IllegalArgumentException("Angka tidak boleh negative");
        }
        // base case
        else if (factorial <= 1) return BigInteger.valueOf(1);

        // using memorization method, we can optimize performance of our factorial method
        // we expect the program will run continuously, so if user a input 3 we can capture 3! and 2!
        // , so if second user give us 4, we can immediately get 3! from memo and
        // multiply 3! with 4, so it will increase the performance
        else if (memo.get(factorial) != null) {
            return memo.get(factorial);
        }

        // for the result, i am using bigInteger, in case user will input big number, we can't
        // return correct answer if we are using integer, so we use big integer instead
        BigInteger result = BigInteger.valueOf(factorial).multiply(factorialRes(factorial - 1, memo));
        memo.put(factorial, result);

        return result;

    }
}
