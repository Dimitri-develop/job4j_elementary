package ru.job4j.converter;

public class ConverterToZloty {

    public static double zlotyToHryvna(double value) {
        double rsl = value * 7.22; //zloty v ₴
        return rsl;
    }

    public static double zlotyToEuro(double value) {
        double rsl = value * 0.22;//zloty v €
        return rsl;
    }

    public static double zlotyToDollar(double value) {
        double rsl = value * 0.26;//zloty v $
        return rsl;
    }

    public static double zlotyToRub(double value) {
        double rsl = value * 19.25;// zloty v ₽
        return rsl;
    }


    public static void main(String[] args) {

        double zlotyToHryvna = ConverterToZloty.zlotyToHryvna(100);
        double zlotyToEuro = ConverterToZloty.zlotyToEuro(1000);
        double zlotyToDollar = ConverterToZloty.zlotyToDollar(1000);
        double zlotyToRub = ConverterToZloty.zlotyToRub(100);
        /*System.out.print("100 zloty are " + zlotyToHryvna + " hryvnias" + '\n'
        + "1000 zloty are " + zlotyToEuro + " euros" + '\n'
                + "1000 zloty are " + zlotyToDollar + " dollars" + '\n'
                +"100 zloty are " + zlotyToRub + " rubles");*/
        System.out.print("100 zloty are ₴ " );
        System.out.printf("%.2f", zlotyToHryvna);
        System.out.println();
        System.out.print("1000 zloty are € ");
        System.out.printf("%.2f", zlotyToEuro);
        System.out.println();
        System.out.print("1000 zloty are $ ");
        System.out.printf("%.2f", zlotyToDollar);
        System.out.println();
        System.out.print("100 zloty are ₽ ");
        System.out.printf("%.2f", zlotyToRub);
    }
}
