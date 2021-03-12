package ru.job4j.calculator;

import java.util.Scanner;

public class Fit {

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }


    public static void main(String[] args) {
        //short height = 187;//cm
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in cm: " );
        short nextShort = scanner.nextShort();
        double manWeight = Fit.manWeight(nextShort);
        double womanWeight = Fit.womanWeight(nextShort);
        System.out.println("For Man " + nextShort + " is: " + manWeight + " kg");
        System.out.println("For Woman " + nextShort + " is: " + womanWeight + " kg");
    }
}
