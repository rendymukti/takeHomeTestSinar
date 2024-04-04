package seventhQuestion;

import java.util.Scanner;


public class Trimmer {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer mode = 0;
        String givenString = "";


        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Trimmer");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                scanner.nextLine();
                if (mode == 1) {
                    System.out.print("Masukan kalimat : ");
                    givenString = scanner.nextLine();

                    // here i assume we just need to trim and only accept alphanumeric characters
                    String replaced = givenString.replaceAll("[^a-zA-Z0-9]", "");
                    System.out.println("Hasil");
                    System.out.println(replaced);

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
}
