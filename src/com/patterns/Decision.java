package com.patterns;

import java.util.Scanner;

public class Decision {
    private Scanner scanner = new Scanner(System.in);
    private Object answer;
    private String[] des = {"PATTERN1", "PATTERN2", "PATTERN3"};
    private Pattern1 p1 = new Pattern1();
    private Pattern2 p2 = new Pattern2();
    private Pattern3 p3 = new Pattern3();


    public void decision() {
        System.out.println("Please choose your option");
        System.out.println("Available options:");
        for (String di : des) {
            System.out.println(di);
        }

        while (scanner.hasNextInt() || scanner.hasNextDouble() || scanner.hasNextLong() || scanner.hasNextFloat()) {
            System.out.println("Please choose your option");
            System.out.println("Available options:");
            System.out.println("Numbers not allowed here!");
            for (String di : des) {
                System.out.println(di);
            }
            answer = scanner.nextLine().toUpperCase();
        }
        //answer = scanner.nextLine().toUpperCase();

        try {

            if (!answer.equals(des[0]) || !answer.equals(des[1]) || !answer.equals(des[2])) {
                System.out.println("Please choose your option");
                System.out.println("Available options:");
                for (String di : des) {
                    System.out.println(di);
                }

            }
            throw new Exception();
        } catch (Exception e) {
            answer = scanner.nextLine().toUpperCase();
        }

        if (answer.equals(des[0])) {
            p1.pattern1();
        }


        if (answer.equals(des[1])) {
            p2.pattern2();
        }


        if (answer.equals(des[2])) {
            p3.pattern3();
        }


    }
}




