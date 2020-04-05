package com.patterns;

import java.util.Scanner;

public class Pattern2 {
    int input;
    private Scanner scanner = new Scanner(System.in);

    public void pattern2() {
        System.out.println("Add a number!");
        if(!scanner.hasNextInt()){
            System.out.println("Only numbers are allowed, please retry! ");
        }


        if (scanner.hasNextInt()) {
            input = scanner.nextInt();
            Integer integer = new Integer(input);
            while (integer <= 1) {
                System.out.println("The number must be > 1 ");
                System.out.println("You added " + integer);
                integer = scanner.nextInt();

            }
            if (1 < integer) {

                System.out.println("You added " + integer);


                for (int i = 0; i <= integer; i++) {

                    for (int y = 0; y <= integer; y++) {
                        if (i == 0 || y == 0 || i == integer || y == integer) {
                            System.out.print("X ");

                        } else {
                            System.out.print("  ");
                        }

                    }
                    System.out.println();
                }
            }


        }

    }
}
