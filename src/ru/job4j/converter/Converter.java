package ru.job4j.converter;

import java.util.Scanner;

public class Converter {

    public static float rubToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.print("Please, enter the value in rubles: ");
        //enter the value, which want to Convert
        float v = str.nextFloat();
        float rubToEuro = (float) Math.floor(Converter.rubToEuro(v));
        float rubToDollar = Math.round(Converter.rubToDollar(v));
        System.out.println("In euros: " + rubToEuro + " €" + '\n'
            + "In dollars: " + rubToDollar + " $" + '\n');

    }
}
