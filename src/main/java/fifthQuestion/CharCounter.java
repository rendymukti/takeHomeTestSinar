package fifthQuestion;

import sun.reflect.generics.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        String givenString = "";



        while (mode != -1) {
            try {
                Map<String, Integer> counter = new TreeMap<>();
                System.out.println("Mode 1 - Character counter");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                scanner.nextLine();
                if (mode == 1) {
                    System.out.print("Masukan kalimat : ");
                    givenString = scanner.nextLine();
//                    scanner.nextLine();
                    // normalize the given string


                    // didn't make it lower case, cause i assume a and A is difference here
//                    givenString = givenString.toLowerCase();

                    // replace whitespace
                    String normalizeString = givenString.replaceAll("\\s", "");
//                    System.out.println(normalizeString);

                    charCounter(normalizeString, counter);

                }
                else {
                    if (mode != -1)
                    System.out.println("Please input the right mode!");
                }

            }catch (Exception e) {
                System.out.println("WARNING !!!");
                System.out.println("You should give input integer only on mode !!!");
                System.out.println("You should give input string only on kalimat !!!");
                return ;
            }
        }

        scanner.close();


    }

    private static void charCounter(String givenString, Map<String, Integer> counter) {

        Integer temp = 0;

        for (int i = 0; i < givenString.length() ; i++) {
            if (counter.containsKey(Character.toString(givenString.charAt(i)))) {

                temp = counter.get(Character.toString(givenString.charAt(i))) + 1;
                counter.put(Character.toString(givenString.charAt(i)), temp);
            }else {
                counter.put(Character.toString(givenString.charAt(i)), 1);
            }

        }
        Integer res = 0;

        System.out.println("Hasil:");
        System.out.println("Huruf                               Jumlah");

//        counter.forEach((key, value) -> {
//            System.out.println(key + "                                           " + value);
////            res = res + value;
//        });

        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + "                                        " + entry.getValue());

            res += entry.getValue();
        }

        System.out.println("jumlah huruf yang terpakai              " + res);

    }
}
