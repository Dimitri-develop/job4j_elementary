package ru.job4j.condition;

public class MaxOfThreeNum {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;
        if (x > y && x > z) {
            System.out.println("Max of three num is : " + x);
        } else if (y > x && y > z) {
            System.out.println("Max of three num is : " + y);
        } else if (z > x && z > y) {
            System.out.println("Max of three num is : " + z);
        }
    }
}
