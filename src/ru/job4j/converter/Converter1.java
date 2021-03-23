package ru.job4j.converter;

public class Converter1 {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 76;
    }

    public static void main(String[] args) {

        /*int in = 140;
        int expected = 2;
        int out = (int) Converter.rubToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);*/
        int in = 146;
        int expected = 2;
        int out = (int) Converter.rubToDollar(in);
        boolean passed = expected == out;
        System.out.println("146 rubles are 2. Test result : " + passed);

    }

}
