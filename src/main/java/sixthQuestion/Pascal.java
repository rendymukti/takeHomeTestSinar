package sixthQuestion;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Pascal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        Integer givenLevel = 0;

        Map<String, Integer> counter = new TreeMap<>();

        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Pascal's Triangle");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                scanner.nextLine();
                if (mode == 1) {
                    System.out.print("Masukan kedalaman level : ");
                    givenLevel = scanner.nextInt();

                    if (givenLevel <= 0)
                        throw new RuntimeException("forbidden number");

                    pascal(givenLevel);

                }
                else {
                    if (mode != -1)
                        System.out.println("Please input the right mode!");
                }

            }catch (Exception e) {
                System.out.println("WARNING !!!");
                System.out.println("You should give input integer only !!!");
                System.out.println("Only accept positive number on level !!!");
                return ;
            }
        }


    }

    private static void pascal(int level) {
        // Calculate Pascal's Triangle
        int[][] segitigaSisi = new int[level][level];
        System.out.println("Hasil :");
        for (int i = 0; i < level; i++) {
            // First column is 1
            segitigaSisi[i][0] = 1;
            // Diagonal  always 1
            segitigaSisi[i][i] = 1;
            for (int j = 1; j < i; j++) {
                segitigaSisi[i][j] = segitigaSisi[i - 1][j - 1] + segitigaSisi[i - 1][j];
            }
        }

        // Print Pascal's Triangle pattern
        for (int i = 0; i < level; i++) {
            for (int b = level - 1; b > i; b--) {
                System.out.print(" ");
                // To provide space to the right
            }

            for (int c = 0; c <= i; c++) {
                System.out.print(segitigaSisi[i][c] + " ");
                // Displaying Pascal's Triangle values
            }

            // New line or enter
            System.out.println();

        }
    }


}
