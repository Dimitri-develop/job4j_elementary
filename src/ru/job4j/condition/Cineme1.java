package ru.job4j.condition;

public class Cineme1 {
    public static void permission(boolean allowByParent, boolean hasMoney) {
        boolean result = allowByParent && hasMoney;
        if (result) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        permission(true, true);
        permission(true, false);
        permission(false, true);
        permission(false, false);
    }
}
