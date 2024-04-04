package firstQuestion;

import java.util.Scanner;

public class ConverTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer jumlahJam = 0, jumlahMenit = 0, jumlahDetik = 0;

        Integer jumlahJamInput = 0,jumlahMenitInput = 0, jumlahDetikInput = 0;

        Integer resultSec = 0;

        Integer num = 0;
        Integer mode = 0;

        while (mode != -1) {
            try {
                System.out.println("Mode 1 - Tampilan pertama (convert second)");
                System.out.println("Mode 2 - Tampilan kedua (convert detail ke second)");
                System.out.println("Mode -1 - Stop program!");
                System.out.print("Masukan mode : ");
                mode = scanner.nextInt();
                if (mode == 1) {
                    System.out.print("Masukan jumlah detik : ");
                    num = scanner.nextInt();
                    if (num < 0) {
                        System.out.println("Kamu tidak boleh memberikan input angka negative");
                        continue;
                    }
                    // assign local variable to this method, because i don't need increase any additional memory by declare the
                    // variable on the method
                    convertSecond(jumlahJam, jumlahMenit, jumlahDetik, num);
                } else if (mode == 2) {
                    System.out.print("Masukan jumlah jam : ");
                    jumlahJamInput = scanner.nextInt();
                    if (jumlahJamInput < 0) {
                        System.out.println("Kamu tidak boleh memberikan input angka negative");
                        continue;
                    }

                    System.out.print("Masukan jumlah menit : ");
                    jumlahMenitInput = scanner.nextInt();
                    if (jumlahMenitInput < 0) {
                        System.out.println("Kamu tidak boleh memberikan input angka negative");
                        continue;
                    }

                    System.out.print("Masukan jumlah detik : ");
                    jumlahDetikInput = scanner.nextInt();
                    if (jumlahDetikInput < 0) {
                        System.out.println("Kamu tidak boleh memberikan input angka negative");
                        continue;
                    }
                    // assign local variable to this method, because i don't need increase any additional memory by declare the
                    // variable on the method
                    reverseConvertSecond(jumlahJamInput, jumlahMenitInput, jumlahDetikInput, resultSec);
                }
                // normalize the result
                jumlahJam = 0;
                jumlahMenit = 0;
                jumlahDetik = 0;

                resultSec = 0;
            }catch (Exception e) {
                System.out.println("WARNING !!!");
                System.out.println("You Should Input Integer Only !!!");
                return ;
            }
        }

        scanner.close();

    }

    private static void convertSecond(Integer jumlahJam, Integer jumlahMenit, Integer jumlahDetik, Integer num) {
        // first we need to ensure the given input can we devided by 3600, if it isn't jumlah jam should 0
        if (num >= 3600) {
            jumlahJam = num / 3600;
            num %= 3600;
        }

        // same with the first logic, we want to ensure the given input can be convert to minutes
        if (num >= 60) {
            jumlahMenit = num / 60;
            num %= 60;
        }

        //so do this, we need ensure the num can be convert to second
        if (num < 60 && num > 0) {
            jumlahDetik = num;
        }

        System.out.println("Hasil : ");
        System.out.println("Jumlah jam : " + jumlahJam);
        System.out.println("Jumlah menit : " + jumlahMenit);
        System.out.println("Jumlah detik : " + jumlahDetik);
        System.out.println();
    }

    private static void reverseConvertSecond(Integer jumlahJamInput, Integer jumlahMenitInput, Integer jumlahDetikInput,
                                             Integer result) {

//        if (jumlahJamInput > 0) {
//            result += (jumlahJamInput * 3600);
//        }
//
//        if (jumlahMenitInput > 0) {
//            result += (jumlahMenitInput * 60);
//        }
//
//        if (jumlahDetikInput > 0) {
//            result += jumlahDetikInput;
//        }

        //refactor
        result = (jumlahJamInput * 3600) + (jumlahMenitInput * 60) + jumlahDetikInput;

        System.out.println("Hasil : ");
        System.out.println("Jumlah detik dari masukan di atas adalah : " + result);
        System.out.println();
    }

//    public void convertSecond()
}
