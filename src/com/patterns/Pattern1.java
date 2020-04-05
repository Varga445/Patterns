package com.patterns;

import java.util.Scanner;

public class Pattern1 {

    private Scanner scanner = new Scanner(System.in);

    public void pattern1() {
        int input;

        System.out.println("Add a number!");

        if (!scanner.hasNextInt()) {
            System.out.println("Please retry with a number!");
        }


        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            Integer integer = new Integer(input);
            while (integer <= 5) {
                System.out.println("The number must be > 5 ");
                System.out.println("You added " + integer);
                integer = scanner.nextInt();
            }
            if (5 < integer) {
                System.out.println("You added " + integer);
                for (int i = 0; i < integer; i++) {

                    for (int g = 0; g < 1; g++) {
                        if (i == 0) {
                            System.out.println("X");
                        }
                        if (i % 2 == 0) {
                            System.out.print(" ");
                        }

                    }
                    for (int t = 0; t < 1; t++) {
                        System.out.print("X");


                    }
                    System.out.println();

                }

            }


        }
    }
}












