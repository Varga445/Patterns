package com.patterns;

import java.util.Scanner;

public class Pattern3 {
    private Scanner scanner = new Scanner(System.in);
    private String yes = "Y";
    private String no = "N";
    private String answer;

    public void pattern3() {

        System.out.println("Ready for a cool shape?");
        System.out.println("Y/N");

       while (scanner.hasNextInt()){
           System.out.println("Please answer with 'y' or 'n' ");
           answer= scanner.nextLine().toUpperCase();
       }

        answer = scanner.nextLine().toUpperCase();
        if (answer.equals(no)) {
            System.out.println("Ok, Bye!");
            System.exit(0);
        }
        if (answer.equals(yes)) {

            for (int i = 1; i <= 8; i++) {

                for (int g = 8; g >= i; g--) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("3");
                }

                for (int y = 0; y < i; y++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int z = 2; z <= 8; z++) {

                for (int n = 1; n <= z; n++) {
                    System.out.print(" ");
                }

                for (int k = 8; k >= z; k--) {
                    System.out.print("*");
                }

                for (int f = 8; f >= z; f--) {
                    System.out.print("3");
                }


                for (int n = 0; n < z; n++) {
                    System.out.print("");

                }


                System.out.println();


            }

        }


    }
}




